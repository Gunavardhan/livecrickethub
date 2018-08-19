package com.livecricket.exception;

public class DaoException extends RuntimeException{

	private String reasonCode;
	private String reason;
	private String message;
	
	public DaoException(String reasonCode, String reason, String message){
		super(message);
		this.reasonCode = reasonCode;
		this.reason = reason;
		this.message = message;
	}
	
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
