package com.ccm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ccm.entity.Endpoint;

@Repository
public interface EndpointRepository  extends CrudRepository<Endpoint, Integer> {

}