package com.strings.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

    @PostMapping ("/")
    public String paragraphcounter(@RequestParam(value="string") String string){
        StringOp stringToCount = new StringOp(string);
        return stringToCount.Top10();
    }
}
