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
@RequestMapping("api")
public class IpSiteController {


    /**
     * 根据IP地址查询所属地区
     *
     * @param ip 地址信息|必填
     * @return 当前IP地址的基本信息
     * @resp code 返回码(0000表示成功,其它表示失败)|string|必填
     * @resp msg IP信息|string
     * @resp IP 查询成功后返回的地址信息|string
     */
    @RequestMapping("/ipsite")
    @ResponseBody
    public IpInit getIpMsg(@RequestParam  String  ip) {
        IpInit msg = IpUtils.getIPMsg(ip);
        return msg;
    }
}
