package com.livecricket.model;

public class CricketResponse {

	private String errorCode;
	private String errorMessage;
	private String responseData;
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getresponseData() {
		return responseData;
	}
	public void setresponseData(String responseData) {
		this.responseData = responseData;
	}
	
}
