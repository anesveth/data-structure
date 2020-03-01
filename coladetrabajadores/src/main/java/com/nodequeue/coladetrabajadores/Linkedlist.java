package com.nodequeue.coladetrabajadores;
import java.util.Random;

public class Linkedlist {
    private Node head;
    private Node headOfColadetrabajo;
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
        this.headOfColadetrabajo=null;
    }


    static class Node{
        Trabajador data;
        Node next;
        Node coladetrabajoNext=null;
        String entidadActual="";
        public Node (Trabajador dt,Node nxt){
            data=dt;
            next=nxt;
        }

        public Trabajador Getdata(){
            return data;
        }
        public String GetEntidadActual(){ return entidadActual;}
        public Node Getnext(){
            return next;
        }
        public Node GetnextInColadeTrabajo(){ return coladetrabajoNext;}

        public void ChangeEntidadActual(String newentidad){
            entidadActual=newentidad;
        }
        public void ChangeData(Trabajador newdata){
            data=newdata;
        }
        public void ChangeNext(Node newnxt){
            next=newnxt;
        }
        public void ChangeNextInColadetrabajo(Node newnxt){
            coladetrabajoNext=newnxt;
        }


    }

    public void AddNewWorker(Trabajador nuevotrabajador){
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
            //si llega al ultimo nodo
            if (nuevotrabajador.GetSocialsecuritynumber() > current.data.GetSocialsecuritynumber()) {
                Node newnode = new Node(nuevotrabajador, current.Getnext());
                current.ChangeNext(newnode);
            }
        }

    }
    //SE AÑADE UN DIA TRABAJADO AL ENTRAR A LA COLA
    public void AddToColadetrabajo(Trabajador repartidor,String entidadAnunciada){
        Node repartidorFound=null;
        //Primero, busca el repartidor en la lista
        Node current = this.head;
        if (current.data.GetSocialsecuritynumber()==repartidor.GetSocialsecuritynumber()){
            repartidorFound=this.head;
        }
        else{
        while (current.Getnext() != null) {
            if (current.data.GetSocialsecuritynumber()==repartidor.GetSocialsecuritynumber()){
                repartidorFound=current;
            }
            current = current.Getnext();
        }
        if (current.data.GetSocialsecuritynumber()==repartidor.GetSocialsecuritynumber()){
            repartidorFound=current;
        }}


        //Si no encuentra el repartidor en la lista, osea, es uno nuevo, se añadira a la lista de repartidores
        if (repartidorFound==null) {
            AddNewWorker(repartidor);
            if (this.headOfColadetrabajo == null) {
                Node headnode = new Node(repartidor, null);

                //Se añade que esa es la entidad en la que estara trabajando.

                headnode.Getdata().Trabajar();
                headnode.ChangeEntidadActual(entidadAnunciada);
                this.headOfColadetrabajo = headnode;
            }
            else {
                Node currentColadeTrabajo = this.headOfColadetrabajo;
                while (currentColadeTrabajo.GetnextInColadeTrabajo() != null) {
                    currentColadeTrabajo = currentColadeTrabajo.GetnextInColadeTrabajo();
                }
                Node newnode = new Node(repartidor, null);
                newnode.ChangeEntidadActual(entidadAnunciada);
                newnode.Getdata().Trabajar();
                currentColadeTrabajo.ChangeNextInColadetrabajo(newnode);
            }
        }
        //Si el repartidor YA se encuentra en lista

        else{
            if (this.headOfColadetrabajo==null){
                repartidorFound.ChangeEntidadActual(entidadAnunciada);
                repartidorFound.Getdata().Trabajar();
                this.headOfColadetrabajo=repartidorFound;
            }
            else{
                Node currentColadeTrabajo=this.headOfColadetrabajo;
                //stop it from repiting workers
                while (currentColadeTrabajo.GetnextInColadeTrabajo()!=null && currentColadeTrabajo!=repartidorFound){
                    currentColadeTrabajo=currentColadeTrabajo.GetnextInColadeTrabajo();
                }
                //para evitar loop circular en el next
                if (currentColadeTrabajo.Getdata().GetSocialsecuritynumber()!=repartidorFound.Getdata().GetSocialsecuritynumber()){
                    currentColadeTrabajo.ChangeNextInColadetrabajo(repartidorFound);
                }
                repartidorFound.Getdata().Trabajar();
                repartidorFound.ChangeEntidadActual(entidadAnunciada);
            }
        }

    }

    //SELECCION AL AZAR DE REPARTIDORES EN COLA

    public int TotalRepartidoresCola(){
        int total=0;
        if(this.headOfColadetrabajo!=null){
            total+=1;
            Node currentCola=this.headOfColadetrabajo;
            while (currentCola.GetnextInColadeTrabajo()!=null) {
                currentCola = currentCola.GetnextInColadeTrabajo();
                total+=1;
            }
        }
        return total;
    }

    public String SeleccionarRepartidorAlAzar() {
        String retturn="";
        Random rand = new Random();
        int tottall = TotalRepartidoresCola() - 1;
        Node chosen = this.headOfColadetrabajo;
        Node pastnode = this.headOfColadetrabajo;
        if (tottall > 0) {
            int randPosicion = rand.nextInt(tottall);
            if (this.headOfColadetrabajo.GetnextInColadeTrabajo() != null) {
                for (int i = 0; i < randPosicion; i++) {
                    pastnode = chosen;
                    chosen = chosen.GetnextInColadeTrabajo();
                }

                if (chosen == this.headOfColadetrabajo) {
                    Node newheadofcoladetrabajo = chosen.GetnextInColadeTrabajo();
                    this.headOfColadetrabajo = newheadofcoladetrabajo;
                }
                //we erase the node
                else {
                    pastnode.ChangeNextInColadetrabajo(chosen.GetnextInColadeTrabajo());
                }
            }
        }
        //we erase the node
        if (tottall==0){
            this.headOfColadetrabajo=null;
        }
        return retturn+= chosen.Getdata().ToString() + "\nEntidad anunciada en la ultima propaganda: " + chosen.GetEntidadActual();

    }


    public String PrintColadetrabajo(){

        String str="";
        if (this.headOfColadetrabajo==null){
            str+="La cola de trabajo esta vacia";
        }
        else{
            Node currentCola=this.headOfColadetrabajo;
            str+=this.headOfColadetrabajo.Getdata().ToString()+"\nEntidad anunciada en la propaganda: "+this.headOfColadetrabajo.GetEntidadActual()+"\n    --------- -------- -----\n";

            while (currentCola.GetnextInColadeTrabajo()!=null){
                currentCola=currentCola.GetnextInColadeTrabajo();
                str+=currentCola.Getdata().ToString()+"\nEntidad anunciada en la propaganda: "+currentCola.GetEntidadActual()+"\n    --------- -------- -----\n";
            }
        }
        return str;

    }

    public String PrintWorkersList(){
        String str="╭─────────────────────────────────────╮\n";
            Node current=this.head;
            str+=this.head.Getdata().ToString()+"\n    --------- -------- -----\n";

            while (current.Getnext()!=null){
                current=current.Getnext();
                str+=current.Getdata().ToString()+"\n    --------- -------- -----\n";
            }
        return str+="\n╰─────────────────────────────────────╯";
    }


}
