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

        int urlNum = 21;
        int storedNum = 0;
        String listOfNums = "";

        do {

            if ((urlNum % 2 == 0)) {
                urlNum = urlNum / 2;
                listOfNums += urlNum + " ";
            } else if (urlNum % 2 == 1) {
                urlNum = (urlNum * 3) + 1;
                listOfNums += urlNum + " ";
            }

            //System.out.println(number);
            //return String.valueOf(number);




        } while (urlNum != 1) ;

        System.out.println();
        return listOfNums;
    }


}


