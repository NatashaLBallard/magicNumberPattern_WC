package com.magicnumberpattern_wc.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/")
    public String magicnumberpattern(@RequestParam("name") String name) {

        return name;







    }
}
