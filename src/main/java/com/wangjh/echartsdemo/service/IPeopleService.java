package com.wangjh.echartsdemo.service;

import com.wangjh.echartsdemo.bean.PeopleInHall;

import java.util.List;

public interface IPeopleService {

    List<PeopleInHall> select(PeopleInHall peopleInHall);

    int update(PeopleInHall peopleInHall);

    int insert(PeopleInHall peopleInHall);

    int delete(long[] ids);

    List<PeopleInHall> getAllPeopleInHall();

}
