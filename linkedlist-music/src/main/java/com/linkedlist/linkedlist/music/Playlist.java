package com.linkedlist.linkedlist.music;

public class Playlist {
    Node head;

    Playlist (Song firstsong){
        Song song=firstsong;
        this.head=new Node(firstsong,null);
    }
    //Class where I declare Nodes
    static class Node{
        Song data;
        Node next;
        public Node (Song dt, Node nxt){
            data=dt;
            next=nxt;
        }
        //return the song
        public Song Getdata(){
            return data;
        }
        public Node Getnext(){
            return next;
        }
        public void ChangeData(Song newdata){
            data=newdata;
        }
        public void ChangeNext(Node newnxt){
            next=newnxt;
        }
    }

    //methods for Linkedlist 'playlist'
    public void add (Song addedsong){
        if (head.Getnext()==null){
            Node x=new Node(addedsong,head);
            Node head=new Node(addedsong,null);
        }
        Node x=new Node(addedsong,head);
    }

}
