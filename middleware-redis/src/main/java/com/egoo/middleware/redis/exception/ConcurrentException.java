package com.egoo.middleware.redis.exception;

public class ConcurrentException extends RuntimeException {

	public ConcurrentException(String msg) {
		super(msg);
	}
	
}
