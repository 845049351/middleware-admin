package com.tianma.middleware.redis.exception;

public class RedisConnectionException extends RuntimeException {

	public RedisConnectionException(String errormsg) {

		super(errormsg);
	}

}
