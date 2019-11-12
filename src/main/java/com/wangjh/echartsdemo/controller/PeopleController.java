package com.wangjh.echartsdemo.controller;

import com.wangjh.echartsdemo.bean.PeopleInHall;
import com.wangjh.echartsdemo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @RequestMapping("/getAll")
    public Map<String,Object> getAll(){
        Map<String,Object> resultMap = new HashMap<>();
        List<PeopleInHall> allPeopleInHall = peopleService.getAllPeopleInHall();
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("items",allPeopleInHall);
        dataMap.put("total",allPeopleInHall.size());
        resultMap.put("data",dataMap);
        resultMap.put("code",20000);
        return resultMap;
    }

    @RequestMapping("/insertOne")
    public int insertOne(PeopleInHall peopleInHall){
        return peopleService.insert(peopleInHall);
    }

    @RequestMapping("/deleteSome")
    public int deleteSome(@RequestParam("ids[]")long[] ids){
        return peopleService.delete(ids);
    }

    @RequestMapping("/getSelective")
    public List<PeopleInHall> getByConditions(PeopleInHall peopleInHall){
        return peopleService.select(peopleInHall);
    }

    @RequestMapping("/updateOne")
    public int updateOne(PeopleInHall peopleInHall){
        return peopleService.update(peopleInHall);
    }
}
