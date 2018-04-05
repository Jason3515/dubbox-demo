package com.jason.demo.service.test;

import com.jason.demo.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Jason
 * consumer test
 * create time : 2018/4/5
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/application*.xml")
public class ConsumerTest {

    private final Logger log = LoggerFactory.getLogger(ConsumerTest.class);

    @Autowired
    private DemoService demoService;

    @Test
    public void test() {
        try {
            String string = demoService.sayHello("张三");
            log.info(string);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}
