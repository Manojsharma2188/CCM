package com.ccm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ccm.entity.Endpoint;
import com.ccm.entity.URLEndpoint;

@Repository
public interface URLEndpointRepoistory extends CrudRepository<URLEndpoint, Integer> {

}