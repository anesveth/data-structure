package com.linkedlist.linkedlist.music;

public class Song {
    private String title;
    private String artista;
    private String album;

    Song (String title, String artista, String album){
        this.title=title;
        this.artista=artista;
        this.album=album;
    }

    public String Play(){
        return "    "+Read()+
                "\n" +
                "0:17 ──o───────── -3:12\n" +
                "\n" +
                "⇄      ◃◃    Ⅱ    ▹▹      ↻"+
                "\n"+
                "┊　　┊　　┊ 　 ┊    　┊　　┊　　┊\n" +
                "\n" +
                "┊　　┊　　┊ 　 ☆    　┊　　┊　　┊\n" +
                "\n" +
                "┊　　┊　　 ✬ 　 　    　✬ 　   ┊　   ┊\n" +
                "\n" +
                "┊　　★ 　　　 　 　    　　　　★　  ┊\n" +
                "\n" +
                "☆ 　　　　　　 　 　    　　　　　　   ☆";
    }
    public String Read(){
        return this.title+"\n"+this.artista+" - "+this.album;
    }

}