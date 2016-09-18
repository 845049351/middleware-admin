package com.egoo.middlerware.redis.exception;

public class ConcurrentException extends RuntimeException {

	public ConcurrentException(String msg) {
		super(msg);
	}
	
}
