package com.boxfish.rpt.controller;

import com.boxfish.rpt.model.RptAppBasic;
import com.boxfish.rpt.service.RptAppBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tiny on 16/7/11.
 */
@CrossOrigin
@RestController
@RequestMapping("/rptAppBasict")
public class RptAppBasictController {

    @Autowired
    private RptAppBasicService rptAppBasicService;

    /**
     * 查询
     * @return
     */
    @RequestMapping
    public List<RptAppBasic> getClassListByTeacher(RptAppBasic rptAppBasic){
        return rptAppBasicService.getAllRptAppBasic(rptAppBasic);
    }
}
