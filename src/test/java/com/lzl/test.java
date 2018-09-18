package com.lzl;

import com.lzl.mymapper.CdrDO;
import com.lzl.mymapper.Service;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class test {
    @Autowired
    private Service service;

    public List<CdrDO> init(){
        List<CdrDO> list = new ArrayList<CdrDO>();
        for (int i = 0; i < 10; i++) {
            CdrDO cdrDO = new CdrDO();
            cdrDO.setCallee("test"+i);
            cdrDO.setCaller("testxx"+i);
            cdrDO.setBeginTime(new Date());
            cdrDO.setEndTime(new Date());
            list.add(cdrDO);
        }
        return list;
    }

    @Test
    public void test(){
        List<CdrDO> init = init();
        service.insert(init);
    }
}
