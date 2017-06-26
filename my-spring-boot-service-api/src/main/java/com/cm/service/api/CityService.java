package com.cm.service.api;


import com.cmz.domain.City;

import java.util.Map;

/**
 * Created by CHENZHANMEI on 2017/6/26 0026.
 */
public interface CityService {

    City getCity();


    Map<String, Object> getCityList();
}
