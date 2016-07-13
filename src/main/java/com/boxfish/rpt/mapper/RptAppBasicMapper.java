package com.boxfish.rpt.mapper;

import com.boxfish.rpt.model.RptAppBasic;
import com.boxfish.rpt.util.MyMapper;

import java.util.List;

/**
 * Created by tiny on 16/7/11.
 */
public interface RptAppBasicMapper extends MyMapper<RptAppBasic> {

    public List<RptAppBasic> selectRptAppBasic(RptAppBasic rptAppBasic);


}
