package com.boxfish.rpt.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by tiny on 16/7/9.
 */
@Data
public class RptAppBasic extends BaseEntity implements Serializable{

    @JsonFormat(pattern ="yyyy-MM-dd")
    private Date dayKey;

    private String dimensionDesc1;

    private String dimensionDesc2;

    private String dimensionDesc3;

    private String dimensionValue;

    private String dataDesc;

    private Long dataValue;

    private int jobId;

    @JsonFormat(pattern ="yyyy-MM-dd")
    private String dayKeyStart;

    @JsonFormat(pattern ="yyyy-MM-dd")
    private String dayKeyEnd;
}
