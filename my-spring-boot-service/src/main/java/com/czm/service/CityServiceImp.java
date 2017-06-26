package com.czm.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.cm.service.api.CityService;
import com.cmz.domain.City;
import com.czm.constant.Const;

import java.util.Map;

/**
 * Created by CHENZHANMEI
 * on 2017/6/26 0026.
 */
@Service(interfaceName = "cityService", validation = Const.DUBBO_VERSION)
public class CityServiceImp implements CityService {

    @Override
    public City getCity() {

        City city = new City();
        city.setCityName("上海");
        city.setDescription("上海市闵行区");
        city.setProvinceId(1L);

        return city;
    }

    @Override
    public Map<String, Object> getCityList() {


        return null;
    }

}
