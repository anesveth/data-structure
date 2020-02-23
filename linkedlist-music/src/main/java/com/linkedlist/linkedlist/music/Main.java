package com.linkedlist.linkedlist.music;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
    LinkedList playlist=new LinkedList();
    @PostMapping(path="/add")
    public String addtolist(@RequestParam (value="title")String title, @RequestParam (value = "artist") String artist,@RequestParam (value = "album") String album){
        Song newsongtoadd = new Song(title,artist,album);
        playlist.Add(newsongtoadd);
    return "Song added Sucessfully! ♫ ♫ ♫"+"\n┊　　┊　　┊ 　 ┊    　┊　　┊　　┊\n" +
            "\n" +
            "┊　　┊　　┊ 　 ☆    　┊　　┊　　┊\n" +
            "\n" +
            "┊　　┊　　 ✬ 　 　    　✬ 　   ┊　   ┊\n" +
            "\n" +
            "┊　　★ 　　　 　 　    　　　　★　  ┊\n" +
            "\n" +
            "☆ 　　　　　　 　 　    　　　　　　   ☆";
    }

    @GetMapping(path="/songs")
    public String listsongs(){
        return playlist.PrintPlaylist();
    }
    @GetMapping(path="/play")
    public String playnow(@RequestParam(value = "title")String title,@RequestParam(value = "artist")String artist){
        return playlist.PlayChosenSong(title,artist);
    }
    @GetMapping(path="/next")
    public String playnext(){
        return playlist.PlayNextSong();
    }
    @GetMapping(path="/previous")
    public String playprevious(){
        return"";
    }


}
