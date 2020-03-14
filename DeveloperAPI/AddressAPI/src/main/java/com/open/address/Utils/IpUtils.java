package com.open.address.Utils;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.record.*;
import com.open.address.Init.IpInit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.net.InetAddress;

/**
 * @Description :  java类作用描述
 * @Author :  Markburt
 * @CreateDate :  2020/3/14$ 下午 04:21$
 * @UpdateUser :  Markburt
 * @UpdateDate :  2020/3/14$ 下午 04:21$
 * @UpdateRemark :  Project Build
 * @Version :  1.0
 */

public class IpUtils {

    private static Logger logger = LoggerFactory.getLogger(IpUtils.class);

    /**
     * Global static variables, DatabaseReader , Loaded to ensure that the class is loaded once
     */
    private static DatabaseReader reader;

    /**
     * Static code block, to ensure that the project started only once to obtain documents
     */
    static {

        File database = null;

        try {
            database = getFile("GeoLite2-City.mmdb","geolite2.mmdb");
            reader = new DatabaseReader.Builder(database).build();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * 解析IP
     * @param ip
     * @return
     */
    @Bean
    public static IpInit getIPMsg(String ip){

        IpInit msg = new IpInit();

        try {
            InetAddress ipAddress = InetAddress.getByName(ip);
            CityResponse response = reader.city(ipAddress);
            Country country = response.getCountry();
            Subdivision subdivision = response.getMostSpecificSubdivision();
            City city = response.getCity();
            Postal postal = response.getPostal();
            Location location = response.getLocation();

            msg.setCountryName(country.getNames().get("zh-CN"));
            msg.setCountryCode(country.getIsoCode());
            msg.setProvinceName(subdivision.getNames().get("zh-CN"));
            msg.setProvinceCode(subdivision.getIsoCode());
            msg.setCityName(city.getNames().get("zh-CN"));
            msg.setPostalCode(postal.getCode());
            //longitude
            msg.setLongitude(location.getLongitude());
            //latitude
            msg.setLatitude(location.getLatitude());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (GeoIp2Exception e) {
            e.printStackTrace();
        }

        return msg;
    }


    /**
     * 读取classpath下的文件
     * @param fileName 原文件全名
     * @param newFileName  缓存的新文件的名称
     * @return
     * @throws IOException
     */
    @Bean
    public static File getFile(String fileName, String newFileName) throws IOException {
        //读取 ClassPath 路径下指定资源的输入流
        ClassPathResource resource = new ClassPathResource(fileName);
        InputStream inputStream = resource.getInputStream();

        File file = new File(newFileName);

        inputstreamToFile(inputStream, file);

        return file;
    }

    /**
     * InputStream -> File
     * @param inputStream
     * @param file
     */
    private static void inputstreamToFile(InputStream inputStream,File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
