package com.wjw.zipkinservicemiya.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ZipkinMiyaController {
	private static final Logger LOGGER = Logger.getLogger(ZipkinMiyaController.class.getName());

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/hi")
	public String home() {
		LOGGER.log(Level.INFO, "hi is being called");
		return "hi i'm miya!";
	}

	@RequestMapping("/miya")
	public String info() {
		LOGGER.log(Level.INFO, "info is being called");
		return restTemplate.getForObject("http://localhost:8988/info", String.class);
	}

}
