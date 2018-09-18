package com.lzl.mymapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service("service")
public class Service {
    @Autowired
    private CdrMapper cdrMapper;

    public void insert(List<CdrDO> list){
        if(StringUtils.isEmpty(list)){
            return;
        }
        for (CdrDO cdrDO : list) {
            cdrMapper.insert(cdrDO);
        }
    }
}
