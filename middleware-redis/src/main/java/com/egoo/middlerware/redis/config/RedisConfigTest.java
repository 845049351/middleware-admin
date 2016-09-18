package com.egoo.middlerware.redis.config;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fiboliu on 16-9-18.
 */
public class RedisConfigTest {

    @Test
    public void redisConfigTest() {
        RedisConfig redisConfig = new RedisConfig();
        System.out.println(redisConfig.propertiesConfig().toString());
    }
}