package com.ccm.service;

import java.util.List;
import java.util.Optional;

import com.ccm.entity.Endpoint;
import com.ccm.entity.URLEndpoint;

public interface URLEndpointService {

	

	void addEndpointURL(URLEndpoint urlEndpoint);

	void updateEndpointURL(URLEndpoint urlEndpoint);

	void deleteEndpointURL(Integer id);

	List<URLEndpoint> getAllEndpointURL();

	Optional<URLEndpoint> getEndpointURL(Integer id);

	

}
