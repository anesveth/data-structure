package com.linkedlist.linkedlist.music;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
    @PostMapping(path="/add")
    public String addtolist(){
    return "";
    }

    @GetMapping(path="/songs")
    public String listsongs(){
        return"";
    }
    @GetMapping(path="/play")
    public String playnow(){
        return"";
    }
    @GetMapping(path="/next")
    public String playnext(){
        return"";
    }
    @GetMapping(path="/previous")
    public String playprevious(){
        return"";
    }


}
