package com.czm.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cm.service.api.CityService;
import com.cmz.domain.City;
import com.czm.constant.Const;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CHENZHANMEI on 2017/6/26 0026.
 */
@RestController
@RequestMapping(value = "test")
public class CityController {


    @Reference(version = Const.DUBBO_VERSION)
    private CityService service;

    @RequestMapping("/")
    public City getCity() {
        return service.getCity();
    }


}
