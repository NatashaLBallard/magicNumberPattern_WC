package com.magicnumberpattern_wc.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/")
    public String magicnumberpattern()
    //(@RequestParam("number") int number) {
    {

        int urlNum = 13;
        int evenNum = 0;
        int listOfNums = 0;

        while (urlNum > 0) {
            if ((Integer.valueOf(urlNum) % 2 == 0)) {
                listOfNums = urlNum / 2;
            } else if (Integer.valueOf(urlNum) % 2 != 0) {
                listOfNums = (urlNum * 3) + 1;
            }

            
            }
            //System.out.println(number);
            //return String.valueOf(number);

            System.out.println();
            return String.valueOf(listOfNums);




    }

}
