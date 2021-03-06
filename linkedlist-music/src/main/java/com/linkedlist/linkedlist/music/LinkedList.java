package com.linkedlist.linkedlist.music;

public class LinkedList {
    private Node head;
    private Node currentlyPlayedSong;
    LinkedList(){
        this.head=null;
    }

    //Class where I declare Node methods
    static class Node{
        Song data;
        Node next;
        Node previous;
        public Node (Song dt,Node nxt,Node prvious){
            data=dt;
            next=nxt;
            previous=prvious;
        }
        //return the song
        public Song Getdata(){
            return data;
        }
        public Node Getnext(){
            return next;
        }
        public Node GetPrevious(){return previous;}
        public void ChangeData(Song newdata){
            data=newdata;
        }
        public void ChangeNext(Node newnxt){
            next=newnxt;
        }
    }

    //ADD
    public void Add(Song addedSong){
        if (this.head==null){
            Node headnode=new Node(addedSong,null,null);
            this.head=headnode;
        }
        else{

            Node current=this.head;
            while (current.Getnext()!=null){
                current=current.Getnext();
            }
            Node newnode=new Node(addedSong,null,current);
            current.ChangeNext(newnode);
        }
    }


    //PLAY SPECIFIC SONG
    public String PlayChosenSong(String songname,String artista){
        //first, assuming the song is not part of the LinkedList
        String play="";
        //now checks if it is
        try{
        Node current = this.head;
        String currenttitle=current.Getdata().GetSongTitle();
        String currentartist=current.Getdata().GetArtist();
        if (currenttitle.equals(songname) && currentartist.equals(artista)) {
            //if it matches, play becomes PLAY method from existing song
            play = current.Getdata().Play();
            //assigns the node to the variable 'currentlyplayedsong'
            this.currentlyPlayedSong=current;
        }
        //if the song is not in the head
        while (current.Getnext()!=null){
            current=current.Getnext();
            currenttitle=current.Getdata().GetSongTitle();
            currentartist=current.Getdata().GetArtist();
            if(currenttitle.equals(songname) && currentartist.equals(artista)){
                play = current.Getdata().Play();
                this.currentlyPlayedSong=current;
            }
        }

        }
        catch (Exception e){
            play=" This song is not in the playlist :(";
        }

        return play;
    }
    //PLAY NEXT SONG
    public String PlayNextSong(){
        String play="";
        // if we had yet to listen to any song, we will automatically play the head
        if (this.currentlyPlayedSong==null){
            if (this.head==null){
                // if head is null aka there are no songs
                play = "╭─────────────────────────────────────╮\n"+
                        "There are no Songs!!! add something"+
                        "\n╰─────────────────────────────────────╯";
            }
            else{
                play=this.head.Getdata().Play();
                this.currentlyPlayedSong=this.head;
            }
        }
        else{
            Node current = this.currentlyPlayedSong;
            if (current.Getnext()==null){
                play = "╭─────────────────────────────────────╮\n"+
                        "There are no more songs..."+
                        "\n╰─────────────────────────────────────╯";
                this.currentlyPlayedSong=null;
            }
            else{
                //finally we find our next song
                play=current.Getnext().Getdata().Play();
                //we update the song currently played
                this.currentlyPlayedSong=current.Getnext();
            }
        }

        return play;
    }
    //PLAY PREVIOUS SONG
    public String PlayPreviousSong(){

        Node current=this.currentlyPlayedSong;
        String play="";
        // if we had yet to listen to any songs:
        if (current==null) {
            play="╭─────────────────────────────────────╮\n"+
                    "There are no Previous Songs, Listen to something first!"+
                    "\n╰─────────────────────────────────────╯";
            if (this.head == null) {
                // if head is null aka there are no songs
                play = "╭─────────────────────────────────────╮\n"+
                        "There are no Songs!!! add something"+
                        "\n╰─────────────────────────────────────╯";
            }
        }
        else{
            if (current.GetPrevious()==null){
                play = "╭─────────────────────────────────────╮\n"+
                        "There are no Previous Songs, You are at the Top of the Playlist!"+
                        "\n╰─────────────────────────────────────╯";
            }
            else{
                play=current.GetPrevious().Getdata().Play();
                //we update the song currently played
                this.currentlyPlayedSong=current.GetPrevious();
            }
        }

        return play;
    }
    //SHOW SONG LIST
    public String PrintPlaylist(){
        String playlist="╭─────────────────────────────────────╮\n";
        if (this.head==null){
            playlist+="   This playlist is currently empty";
        }
        else{
            Node current=this.head;
            playlist+=this.head.Getdata().Read()+"\n    --------- -------- -----\n";

            while (current.Getnext()!=null){
                current=current.Getnext();
                playlist+=current.Getdata().Read()+"\n    --------- -------- -----\n";
            }
        }
        return playlist+="\n╰─────────────────────────────────────╯";
    }
}
