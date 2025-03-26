package com.Master.dto;

public class Data {
	private Long id;
	private String name;
	private String description;
	private String status;


	public Data() {
	}

	public Data(Long id, String name, String description, String status) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status + "]";
	}
}
