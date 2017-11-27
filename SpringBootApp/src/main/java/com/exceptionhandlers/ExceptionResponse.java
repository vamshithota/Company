package com.exceptionhandlers;

import java.util.Date;

public class ExceptionResponse {

	private Date timestamp;
	private String message;
	private String errordetails;
	
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getErrordetails() {
		return errordetails;
	}
	public void setErrordetails(String errordetails) {
		this.errordetails = errordetails;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ExceptionResponse(Date timestamp, String errordetails, String message) {
		super();
		this.timestamp = timestamp;
		this.errordetails = errordetails;
		this.message = message;
	}
	
}
