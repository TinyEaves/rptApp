package com.boxfish.rpt.service;


import com.boxfish.rpt.mapper.RptAppBasicMapper;
import com.boxfish.rpt.model.RptAppBasic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tiny on 16/7/9.
 */
@Service
public class RptAppBasicService {
    private static Logger log = LoggerFactory.getLogger(RptAppBasicService.class);

    @Autowired
    private RptAppBasicMapper rptAppBasicMapper;

    public List<RptAppBasic> getAllRptAppBasic(RptAppBasic rptAppBasic){
        new ArrayList<>().forEach(System.out::println);
        return rptAppBasicMapper.selectRptAppBasic(rptAppBasic);
    }

}
