package com.letdoit.ribbon.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.letdoit.ribbon.service.RibbonService;

@RestController
public class RibbonController {
    public static final String EUREKA_BASE_URL ="http://eureka-client/registryInfo?";
	@Resource
	private RibbonService ribbonService;

	@RequestMapping("/getRibbonInfo")
	public String getRibbonInfo(@RequestParam(value="name")String name) {
		return ribbonService.getRibbonInfo(EUREKA_BASE_URL+"name="+name);
	}
}
