package vip.wush.server.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/5/20 16:19
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name){
        if(name == null || "".equals(name)){
            throw new RuntimeException("name must be not null!");
        }
        return name;
    }

}

