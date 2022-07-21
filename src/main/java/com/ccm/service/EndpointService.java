package com.ccm.service;

import java.util.List;
import java.util.Optional;

import com.ccm.entity.Endpoint;

public interface EndpointService {

	List<Endpoint> getAllEndpoints();

	Optional<Endpoint> getEndpoint(Integer id);

	void addEndpoint(Endpoint endpoint);

	void updateEndpoint(Endpoint endpoint);

	void deleteEndpoint(Integer id);

	
		

}
