package com.Master.dto;

public class RequestData {
	private Data data;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "RequestData [data=" + data + "]";
	}
}
