package com.tianma.middleware.redis.exception;

public class ConcurrentException extends RuntimeException {

	public ConcurrentException(String msg) {
		super(msg);
	}
	
}
