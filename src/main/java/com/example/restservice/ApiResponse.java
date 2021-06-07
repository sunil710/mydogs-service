package com.example.restservice;

import java.util.List;
import java.util.TreeMap;

public class ApiResponse {

	private TreeMap<String, List<String>> message;
	private String status;

	public TreeMap<String, List<String>> getMessage() {
		return message;
	}

	public void setMessage(TreeMap<String, List<String>> message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
