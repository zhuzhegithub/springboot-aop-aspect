package com.space.aspect.controller;

import com.space.aspect.anno.SysLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuzhe
 * @date 2018/6/4 9:47
 * @email 1529949535@qq.com
 */
@RestController
public class TestController {

    @SysLog("测试")
    @GetMapping("/test")
    public String test(@RequestParam("name") String name){
        return name;
    }
}
