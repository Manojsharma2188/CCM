package com.ccm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccm.entity.Endpoint;
import com.ccm.entity.URLEndpoint;
import com.ccm.service.EndpointService;
import com.ccm.service.URLEndpointService;

@Controller
@RequestMapping("/endpointurl")
public class URLController {

	@Autowired
	private URLEndpointService urlEndpointService;

	@RequestMapping("/getAll")
	public String getAllEndpointsURL(Model model) {
		List<URLEndpoint> urlendpoints = urlEndpointService.getAllEndpointURL();
		model.addAttribute("urlendpoints", urlendpoints);
		return "URL";
	}

	@RequestMapping("/")
	public String start(Model model) {
		List<URLEndpoint> urlendpoints = urlEndpointService.getAllEndpointURL();

		if (!urlendpoints.isEmpty()) {
			model.addAttribute("urlendpoints", urlendpoints);
			return "URL";

		}

		return "URL";
	}

	@RequestMapping("/getOne")
	@ResponseBody
	public Optional<URLEndpoint> getEndpointURL(Integer Id) {
		return urlEndpointService.getEndpointURL(Id);
	}

	@PostMapping("/addNew")
	public String addNewEndpointURL(URLEndpoint urlEndpoint) {
		urlEndpointService.addEndpointURL(urlEndpoint);
		return "redirect:/endpointurl/getAll";
	}

	@RequestMapping(value = "/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String updateEndpointURL(URLEndpoint urlEndpoint) {
		urlEndpointService.updateEndpointURL(urlEndpoint);
		return "redirect:/endpointurl/getAll";
	}

	@RequestMapping(value = "/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String deleteEndpointURL(Integer Id) {
		urlEndpointService.deleteEndpointURL(Id);
		return "redirect:/endpointurl/";
	}

	@RequestMapping("/frequency")
	public String next(Model model) {
		return "frequency";
	}

}
