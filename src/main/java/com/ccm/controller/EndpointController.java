package com.ccm.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.ccm.entity.Endpoint;
import com.ccm.entity.URL;
import com.ccm.entity.URLList;
import com.ccm.service.EndpointService;

@Controller
@RequestMapping("/endpoints")
public class EndpointController {

	@Autowired
	private EndpointService endpointService;

	@RequestMapping("/getAll")
	public String getAllEndpoints(Model model) {
		List<Endpoint> endpoints = endpointService.getAllEndpoints();
		model.addAttribute("endpoints", endpoints);
		return "endpoints";
	}

	@RequestMapping("/")
	public String start(Model model) {
		List<Endpoint> endpoints = endpointService.getAllEndpoints();
		if(!endpoints.isEmpty())
		{
			model.addAttribute("endpoints", endpoints);
			return "endpoints";
		   
		}
		
		return "endpoints";
		
	}

	@RequestMapping("/getOne")
	@ResponseBody
	public Optional<Endpoint> getEndpoint(Integer Id) {
		return endpointService.getEndpoint(Id);
	}

	@PostMapping("/addNew")
	public String addNewEndpoint(Endpoint endpoint) {
		endpointService.addEndpoint(endpoint);
		return "redirect:/endpoints/getAll";
	}

	@RequestMapping(value = "/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String updateEndpoint(Endpoint endpoint) {
		endpointService.updateEndpoint(endpoint);
		return "redirect:/endpoints/getAll";
	}

	@RequestMapping(value = "/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String deleteEndpoint(Integer Id) {
		endpointService.deleteEndpoint(Id);
		return "redirect:/endpoints/";
	}

	@RequestMapping("/url")
	public String next(Model model) {
		return "URL";
	}
	
	
	@Autowired
	   RestTemplate restTemplate;
	
	@PostConstruct
	@RequestMapping(value = "/template", method = RequestMethod.POST)
	   public void createProducts() throws URISyntaxException {
	      
//		List<String> uList = new ArrayList<String>();
//		uList.add("Google");
//		uList.add("Facebook");
		String randomServerPort="9091";
		  final String baseUrl = "http://localhost:"+randomServerPort+"/url/process";
		  URI uri = new URI(baseUrl);
		   List<URL> url = new ArrayList<>();
		   url.add(new URL("https://google.com"));
		   url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));
		   url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co")); url.add(new URL("http://wikipedia.org/"));
		   url.add(new URL("http://www.example.co"));

		  URLList uRLList = new URLList(url);
	      ResponseEntity<String> result = restTemplate.postForEntity(uri, uRLList, String.class);
	      
	      System.out.println("Current status time "+ result.getStatusCode());
	    
	      System.out.println("Result of data " + result.toString());
	      

	   }

}
