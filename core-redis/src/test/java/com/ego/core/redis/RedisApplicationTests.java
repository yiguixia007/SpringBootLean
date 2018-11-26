package com.ego.core.redis;

import com.ego.core.redis.dao.RedisDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class RedisApplicationTests {
	@Autowired
	RedisDao redisDao;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testRedis(){
		redisDao.setKey("name","forezp");
		redisDao.setKey("age","11");
		log.info(redisDao.getValue("name"));
		log.info(redisDao.getValue("age"));
	}
}
