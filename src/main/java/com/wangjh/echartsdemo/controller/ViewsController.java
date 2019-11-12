package com.wangjh.echartsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewsController {

    @GetMapping("showECharts")
    public String showECharts(){
        return "showECharts";
    }
}
