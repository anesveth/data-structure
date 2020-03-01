package com.nodequeue.coladetrabajadores;

public class Linkedlist {
    private Node head;
//    private Node currentlyPlayedSong;
    Linkedlist(){
        //Se inicia con ya algunos trabajadores
        Trabajador trabajador1=new Trabajador(16599,"Harry Styles");
        Trabajador trabajador2=new Trabajador(15520,"Louis Tomnlinson");
        Trabajador trabajador3=new Trabajador(16561,"Zayn Malik");
        Trabajador trabajador4=new Trabajador(23267,"Niall Horan");
        Trabajador trabajador5=new Trabajador(61898,"Liam Payne");
        Node tr5=new Node(trabajador5,null);
        Node tr4=new Node(trabajador4,tr5);
        Node tr1=new Node(trabajador1,tr4);
        Node tr3=new Node(trabajador3,tr1);
        Node tr2=new Node(trabajador2,tr3);
        this.head=tr2;
    }


    static class Node{
        Trabajador data;
        Node next;
//        Node previous;
        public Node (Trabajador dt,Node nxt){
            data=dt;
            next=nxt;
//            previous=prvious;
        }

        public Trabajador Getdata(){
            return data;
        }
        public Node Getnext(){
            return next;
        }
//        public Node GetPrevious(){return previous;}
        public void ChangeData(Trabajador newdata){
            data=newdata;
        }
        public void ChangeNext(Node newnxt){
            next=newnxt;
        }
    }



    public void Add(Trabajador nuevotrabajador){
        Node current = this.head;
        //la lista va ordenada del menor numero de seguridad social al mayor,
        // primero se chequea si se deberia cambiar el head
        if (nuevotrabajador.GetSocialsecuritynumber() < current.data.GetSocialsecuritynumber()) {
            Node oldhead = current;
            Node headnode = new Node(nuevotrabajador, oldhead);
            this.head = headnode;
        }
        //si no, se ve en q nodo cabria
        else {
            while (current.Getnext() != null) {
                if (nuevotrabajador.GetSocialsecuritynumber() > current.data.GetSocialsecuritynumber() && nuevotrabajador.GetSocialsecuritynumber() < current.Getnext().data.GetSocialsecuritynumber()) {
                    Node newnode = new Node(nuevotrabajador, current.Getnext());
                    current.ChangeNext(newnode);
                }
                else {
                    current = current.Getnext();
                }
            }
//                //al final se coloca
//                Node newnode = new Node(nuevotrabajador, null);
//                current.ChangeNext(newnode);
        }

    }

    public String PrintWorkersList(){
        String playlist="╭─────────────────────────────────────╮\n";
            Node current=this.head;
            playlist+=this.head.Getdata().ToString()+"\n    --------- -------- -----\n";

            while (current.Getnext()!=null){
                current=current.Getnext();
                playlist+=current.Getdata().ToString()+"\n    --------- -------- -----\n";
            }
        return playlist+="\n╰─────────────────────────────────────╯";
    }


}
