package com.magicnumberpattern_wc.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.http.HttpServletRequest;
import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/")
    public String magicnumberpattern(HttpServletRequest param) {
        {
            String number = param.getParameter("number");
            if (number == null){
                return "Enter a valid number. Example: http://localhost:8080/?number=20";
            }
            int urlNum = Integer.parseInt(number);
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


            } while (urlNum != 1);

            System.out.println();
            return number + " " + listOfNums;
        }


    }
}


