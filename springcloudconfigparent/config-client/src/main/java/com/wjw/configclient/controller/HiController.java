package com.wjw.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HiController {
	/**
	 * http://localhost:8881/actuator/bus-refresh
	 */

	@Value("${foo}")
	String foo;

	@RequestMapping(value = "/hi")
	public String hi() {
		return foo;
	}
}
