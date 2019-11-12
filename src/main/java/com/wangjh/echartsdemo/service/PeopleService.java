package com.wangjh.echartsdemo.service;

import com.wangjh.echartsdemo.bean.PeopleInHall;
import com.wangjh.echartsdemo.mapper.PeopleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PeopleService implements IPeopleService{
    @Resource
    private PeopleMapper peopleMapper;

    @Override
    public List<PeopleInHall> select(PeopleInHall peopleInHall) {
        return peopleMapper.select(peopleInHall);
    }

    @Override
    public int update(PeopleInHall peopleInHall) {
        return peopleMapper.update(peopleInHall);
    }

    @Override
    public int insert(PeopleInHall peopleInHall) {
        return peopleMapper.insert(peopleInHall);
    }

    @Override
    public int delete(long[] ids) {
        return peopleMapper.delete(ids);
    }

    @Override
    public List<PeopleInHall> getAllPeopleInHall() {
        return peopleMapper.getAllPeopleInHall();
    }
}
