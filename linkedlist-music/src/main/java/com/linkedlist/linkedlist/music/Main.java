package com.linkedlist.linkedlist.music;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
    @PostMapping(path="/add")
    public String addtolist(@RequestParam (value="title")String title, @RequestParam (value = "artist") String artist,@RequestParam (value = "album") String album){
        Song newsongtoadd = new Song(title,artist,album);

    return "";
    }

    @GetMapping(path="/songs")
    public String listsongs(){
        return"";
    }
    @GetMapping(path="/play")
    public String playnow(@RequestParam(value = "songnumber")int songnumber){

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
