package com.linkedlist.linkedlist.music;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    void SongCreationtest(){
        Song test=new Song("Little Things","One Direction","Up All Night");
        assertEquals("Little Things",test.GetSongTitle());
        assertEquals("One Direction",test.GetArtist());
        assertEquals("  "+test.Read()+
                "\n" +
                "   0:17 ──o───────── -3:12\n" +
                "\n" +
                "   ⇄      ◃◃    Ⅱ    ▹▹      ↻",test.Play());
        assertEquals("    "+"Little Things"+"\n   "+"One Direction"+" - "+"Up All Night",test.Read());

    }
    @Test
    void LinkedListtest(){
        Song test1=new Song("Teenage Dirtbag","Wheatus","Wheatus");
        Song test2=new Song("Old Me","5 Seconds of Summer","CALM");
        Song test3=new Song("She Looks So Perfect","5 Seconds of Summer","5 Seconds of Summer");
        Song test4=new Song("Pumped Up Kicks","Foster The People","Pumped Up Kicks");
        LinkedList testplaylist=new LinkedList();
        assertEquals("╭─────────────────────────────────────╮\n"+"   This playlist is currently empty"+"\n╰─────────────────────────────────────╯",testplaylist.PrintPlaylist());
        testplaylist.Add(test1);
        testplaylist.Add(test2);
        testplaylist.Add(test3);
        testplaylist.Add(test4);
        assertEquals("      Teenage Dirtbag\n" +
                "   Wheatus - Wheatus\n" +
                "   0:17 ──o───────── -3:12\n" +
                "\n" +
                "   ⇄      ◃◃    Ⅱ    ▹▹      ↻",testplaylist.PlayChosenSong("Teenage Dirtbag","Wheatus"));
        assertEquals("╭─────────────────────────────────────╮\n"+
                "There are no Previous Songs, You are at the Top of the Playlist!"+
                "\n╰─────────────────────────────────────╯",testplaylist.PlayPreviousSong());
        assertEquals("      Old Me\n" +
                "   5 Seconds of Summer - CALM\n" +
                "   0:17 ──o───────── -3:12\n" +
                "\n" +
                "   ⇄      ◃◃    Ⅱ    ▹▹      ↻",testplaylist.PlayNextSong());
        assertEquals("      Teenage Dirtbag\n" +
                "   Wheatus - Wheatus\n" +
                "   0:17 ──o───────── -3:12\n" +
                "\n" +
                "   ⇄      ◃◃    Ⅱ    ▹▹      ↻",testplaylist.PlayPreviousSong());
        assertEquals("╭─────────────────────────────────────╮\n" +
                "    Teenage Dirtbag\n" +
                "   Wheatus - Wheatus\n" +
                "    --------- -------- -----\n" +
                "    Old Me\n" +
                "   5 Seconds of Summer - CALM\n" +
                "    --------- -------- -----\n" +
                "    She Looks So Perfect\n" +
                "   5 Seconds of Summer - 5 Seconds of Summer\n" +
                "    --------- -------- -----\n" +
                "    Pumped Up Kicks\n" +
                "   Foster The People - Pumped Up Kicks\n" +
                "    --------- -------- -----\n" +
                "\n" +
                "╰─────────────────────────────────────╯",testplaylist.PrintPlaylist());

    }
}