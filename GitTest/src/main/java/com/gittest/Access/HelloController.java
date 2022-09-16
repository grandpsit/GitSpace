package com.gittest.Access;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String HelloAccess()
    {
        return "hello world";
    }

    @GetMapping("/getInt")
    public int getInt()
    {
        String Value = "24";
        System.out.println(Value);
        System.out.println(Integer.valueOf(Value));
        return Integer.valueOf(Value);
    }

}
