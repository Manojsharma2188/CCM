package com.ccm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccm.entity.Endpoint;
import com.ccm.repository.EndpointRepository;

@Service
public class EndpointServiceImpl implements EndpointService{
	
	@Autowired
	private EndpointRepository endpointRepository;

	@Override
	public List<Endpoint> getAllEndpoints() {
		
		return (List<Endpoint>) endpointRepository.findAll();
	}

	@Override
	public Optional<Endpoint> getEndpoint(Integer id) {
		return endpointRepository.findById(id);
	}

	@Override
	public void addEndpoint(Endpoint endpoint) {
		endpointRepository.save(endpoint);
		
	}

	@Override
	public void updateEndpoint(Endpoint endpoint) {
		endpointRepository.save(endpoint);
		
	}

	@Override
	public void deleteEndpoint(Integer id) {
		endpointRepository.deleteById(id);
		
	}

	
}
