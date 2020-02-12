package com.point.Point;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
    @GetMapping("/")
    public String QuadrantOfaPoint(@RequestParam(value="x") int x, @RequestParam(value="y") int y){
        Point newpoint=new Point(x,y);
        return newpoint.Quadrant();
    }
}
