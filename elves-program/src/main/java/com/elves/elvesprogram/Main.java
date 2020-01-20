package com.elves.elvesprogram;
import org.springframework.web.bind.annotation.*;

import java.util.Scanner;

@RestController
@RequestMapping(method = RequestMethod.GET,path = "/")
public class Main {
    @GetMapping
    public String CalculateFuel(@RequestParam(value="mass") int mass){
        return "The mass introduced was:"+mass+"\nThe total fuel is: "+String.valueOf(Fuel(mass));
    }
    public static int Fuel(int mass){
        return (mass/3)-2;
    }
}
