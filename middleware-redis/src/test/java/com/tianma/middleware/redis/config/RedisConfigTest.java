package com.tianma.middleware.redis.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by fiboliu on 16-9-18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(RedisConfigTest.class)
public class RedisConfigTest {

    private static Logger logger = LoggerFactory.getLogger(RedisConfigTest.class);

    @Test
    public void redisConfigTest() {
        RedisConfig redisConfig = new RedisConfig();
        logger.info(redisConfig.propertiesConfig().toString());
    }
}