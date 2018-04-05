package com.jason.demo.service.impl;

import com.jason.demo.service.DemoService;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * @author Jason
 * description
 * create time : 2018/4/5
 */
@Service("demoService")
@Path("/demo")
@Produces({"application/json; charset=UTF-8", "text/xml; charset=UTF-8"})
public class DemoServiceImpl implements DemoService {

    @GET
    @Path("/sayHello/{name}/")
    public String sayHello(@PathParam("name") String name) {

        //测试超时
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "你好啊，" + name;
    }

    @GET
    @Path("/sayHello2/{name}/")
    public String sayHello2(@PathParam("name") String name) {
        return "你好啊2，" + name;
    }
}
