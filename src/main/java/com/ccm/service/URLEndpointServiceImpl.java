package com.ccm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccm.entity.URLEndpoint;
import com.ccm.repository.URLEndpointRepoistory;

@Service
public class URLEndpointServiceImpl implements URLEndpointService {

	@Autowired
	private URLEndpointRepoistory urlEndpointRepoistory;

	@Override
	public void addEndpointURL(URLEndpoint urlEndpoint) {

		urlEndpointRepoistory.save(urlEndpoint);

	}

	@Override
	public void updateEndpointURL(URLEndpoint urlEndpoint) {
		urlEndpointRepoistory.save(urlEndpoint);

	}

	@Override
	public void deleteEndpointURL(Integer id) {
		urlEndpointRepoistory.deleteById(id);

	}

	@Override
	public List<URLEndpoint> getAllEndpointURL() {
		return (List<URLEndpoint>) urlEndpointRepoistory.findAll();
	}

	@Override
	public Optional<URLEndpoint> getEndpointURL(Integer id) {
		return urlEndpointRepoistory.findById(id);
	}

}
