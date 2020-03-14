package com.open.address.Controller;

import com.open.address.Init.IpInit;
import com.open.address.Utils.IpUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

/**
 * @Description :  java类作用描述
 * @Author :  Markburt
 * @CreateDate :  2020/3/14$ 下午 04:24$
 * @UpdateUser :  Markburt
 * @UpdateDate :  2020/3/14$ 下午 04:24$
 * @UpdateRemark :  Project Build
 * @Version :  1.0
 */
@RestController
@Configuration
public class IpSiteController {


    /***
     * 根据IP地址查询所属地区
     * @param ip
     * @return
     */

    @RequestMapping(value = "/ipsite",method = RequestMethod.GET)
    @ResponseBody
    public IpInit getIpMsg(@RequestParam  String  ip) {
        IpInit msg = IpUtils.getIPMsg(ip);
        return msg;
    }
}
