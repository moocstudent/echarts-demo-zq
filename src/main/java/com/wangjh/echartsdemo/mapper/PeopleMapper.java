package com.wangjh.echartsdemo.mapper;

import com.wangjh.echartsdemo.bean.PeopleInHall;

import java.util.List;

public interface PeopleMapper {

    List<PeopleInHall> select(PeopleInHall peopleInHall);

    int update(PeopleInHall peopleInHall);

    int insert(PeopleInHall peopleInHall);

    int delete(long[] ids);

    List<PeopleInHall> getAllPeopleInHall();

}
