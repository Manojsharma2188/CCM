package com.ccm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Endpoint")
public class Endpoint {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "ip_address")
	private String ip_address;

	@Column(name = "port")
	private long port;

	public int getId() {
		return id;
	}

	public String getIp_address() {
		return ip_address;
	}

	public long getPort() {
		return port;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}

	public void setPort(long port) {
		this.port = port;
	}

	public Endpoint() {

	}

	public Endpoint(int id, String ip_address, long port) {
		super();
		this.id = id;
		this.ip_address = ip_address;
		this.port = port;
	}

	@Override
	public String toString() {
		return "Endpoint [id=" + id + ", ip_address=" + ip_address + ", port=" + port + "]";
	}

}
