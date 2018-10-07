package com.colesteve.letdoit.ribbon.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.colesteve.letdoit.common.api.entities.Books;
import com.colesteve.letdoit.ribbon.service.RibbonService;

/**
 * 
 * @author colesteve
 * @decription
 *   使用ribbon结合eureka,可以通过使用注册如eureka中的服务名称进行访问，不用关心实际服务的IP和端口号
 */
@RestController
public class RibbonController {
    public static final String EUREKA_BASE_URL ="http://LETDOIT-SERVICE-PROVIDER";
	@Resource
	private RibbonService ribbonService;

	@RequestMapping("/getRibbonInfo")
	public String getRibbonInfo(@RequestParam(value="name")String name) {
		return ribbonService.getRibbonInfo(EUREKA_BASE_URL+"name="+name);
	}
	
	@RequestMapping(value="/book/get/{id}")
	public Books get(@PathVariable("id") String id)
	{
	   return ribbonService.getBookById(EUREKA_BASE_URL+"/book/get/"+id, Books.class);
	}

}
