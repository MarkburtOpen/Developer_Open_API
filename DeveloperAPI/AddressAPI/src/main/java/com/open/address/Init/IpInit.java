package com.open.address.Init;

import lombok.Data;

/**
 * @Description :  java类作用描述
 * @Author :  Markburt
 * @CreateDate :  2020/3/14$ 下午 04:22$
 * @UpdateUser :  Markburt
 * @UpdateDate :  2020/3/14$ 下午 04:22$
 * @UpdateRemark :  Project Build
 * @Version :  1.0
 */
@Data
public class IpInit {

    /***
     * 国家
     */
    String countryName;
    /***
     * 国家代码
     */
    String countryCode;

    /***
     * 省份
     */
    String provinceName;
    String provinceCode;

    /***
     * 城市名称
     */
    String cityName;

    /***
     * 邮政编码
     */
    String postalCode;

    /***
     * 经度
     */
    Double longitude;
    /***
     * 纬度
     */
    Double latitude;
}
