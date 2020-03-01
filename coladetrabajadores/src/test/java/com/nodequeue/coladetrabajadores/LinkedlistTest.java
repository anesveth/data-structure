package com.nodequeue.coladetrabajadores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedlistTest {

    @Test
    void TrabajadoresTest(){
        Trabajador trabajadortest=new Trabajador(19982,"Shawn Mendes");
        assertEquals(0,trabajadortest.GetDiasTrabajados());
        trabajadortest.Trabajar();
        assertEquals(1,trabajadortest.GetDiasTrabajados());
        assertEquals(19982,trabajadortest.GetSocialsecuritynumber());
        assertEquals("Social Security Number:"+19982+"\n Nombre:"+"Shawn Mendes"+"\n Dias trabajados: "+1+"\n",trabajadortest.ToString());
    }
    @Test
    void LinkedlistTest(){
        Linkedlist coladeprueba=new Linkedlist();
        Trabajador trabajadortest1=new Trabajador(15670,"Luke Hemmings");
        Trabajador trabajadortest2=new Trabajador(16570,"Calum Hood");
        Trabajador trabajadortest3=new Trabajador(14098,"Michael Clifford");
        Trabajador trabajadortest4=new Trabajador(74098,"Ashton Irwin");
        assertEquals("╭─────────────────────────────────────╮\n" +
                "Social Security Number:15520\n" +
                " Nombre:Louis Tomnlinson\n" +
                " Dias trabajados: 0\n" +
                "\n" +
                "    --------- -------- -----\n" +
                "Social Security Number:16561\n" +
                " Nombre:Zayn Malik\n" +
                " Dias trabajados: 0\n" +
                "\n" +
                "    --------- -------- -----\n" +
                "Social Security Number:16599\n" +
                " Nombre:Harry Styles\n" +
                " Dias trabajados: 0\n" +
                "\n" +
                "    --------- -------- -----\n" +
                "Social Security Number:23267\n" +
                " Nombre:Niall Horan\n" +
                " Dias trabajados: 0\n" +
                "\n" +
                "    --------- -------- -----\n" +
                "Social Security Number:61898\n" +
                " Nombre:Liam Payne\n" +
                " Dias trabajados: 0\n" +
                "\n" +
                "    --------- -------- -----\n" +
                "\n" +
                "╰─────────────────────────────────────╯",coladeprueba.PrintWorkersList());
        coladeprueba.AddNewWorker(trabajadortest1);
        coladeprueba.AddNewWorker(trabajadortest2);
        coladeprueba.AddNewWorker(trabajadortest3);
        coladeprueba.AddNewWorker(trabajadortest4);
        assertEquals("╭─────────────────────────────────────╮\n" +
                "Social Security Number:14098\n" +
                " Nombre:Michael Clifford\n" +
                " Dias trabajados: 0\n" +
                "\n" +
                "    --------- -------- -----\n" +
                "Social Security Number:15520\n" +
                " Nombre:Louis Tomnlinson\n" +
                " Dias trabajados: 0\n" +
                "\n" +
                "    --------- -------- -----\n" +
                "Social Security Number:15670\n" +
                " Nombre:Luke Hemmings\n" +
                " Dias trabajados: 0\n" +
                "\n" +
                "    --------- -------- -----\n" +
                "Social Security Number:16561\n" +
                " Nombre:Zayn Malik\n" +
                " Dias trabajados: 0\n" +
                "\n" +
                "    --------- -------- -----\n" +
                "Social Security Number:16570\n" +
                " Nombre:Calum Hood\n" +
                " Dias trabajados: 0\n" +
                "\n" +
                "    --------- -------- -----\n" +
                "Social Security Number:16599\n" +
                " Nombre:Harry Styles\n" +
                " Dias trabajados: 0\n" +
                "\n" +
                "    --------- -------- -----\n" +
                "Social Security Number:23267\n" +
                " Nombre:Niall Horan\n" +
                " Dias trabajados: 0\n" +
                "\n" +
                "    --------- -------- -----\n" +
                "Social Security Number:61898\n" +
                " Nombre:Liam Payne\n" +
                " Dias trabajados: 0\n" +
                "\n" +
                "    --------- -------- -----\n" +
                "Social Security Number:74098\n" +
                " Nombre:Ashton Irwin\n" +
                " Dias trabajados: 0\n" +
                "\n" +
                "    --------- -------- -----\n" +
                "\n" +
                "╰─────────────────────────────────────╯",coladeprueba.PrintWorkersList());
        coladeprueba.AddToColadetrabajo(trabajadortest1,"Alive");
        coladeprueba.AddToColadetrabajo(trabajadortest3,"Amnesia");
        coladeprueba.AddToColadetrabajo(trabajadortest4,"Hey Everybody");
        coladeprueba.AddToColadetrabajo(trabajadortest4,"5SOS");
        coladeprueba.AddToColadetrabajo(trabajadortest2,"Vapor");
        assertEquals(4,coladeprueba.TotalRepartidoresCola());
        assertEquals("Social Security Number:15670\n" +
                " Nombre:Luke Hemmings\n" +
                " Dias trabajados: 1\n" +
                "\n" +
                "Entidad anunciada en la propaganda: Alive\n" +
                "    --------- -------- -----\n" +
                "Social Security Number:14098\n" +
                " Nombre:Michael Clifford\n" +
                " Dias trabajados: 1\n" +
                "\n" +
                "Entidad anunciada en la propaganda: Amnesia\n" +
                "    --------- -------- -----\n" +
                "Social Security Number:74098\n" +
                " Nombre:Ashton Irwin\n" +
                " Dias trabajados: 2\n" +
                "\n" +
                "Entidad anunciada en la propaganda: 5SOS\n" +
                "    --------- -------- -----\n" +
                "Social Security Number:16570\n" +
                " Nombre:Calum Hood\n" +
                " Dias trabajados: 1\n" +
                "\n" +
                "Entidad anunciada en la propaganda: Vapor\n" +
                "    --------- -------- -----\n",coladeprueba.PrintColadetrabajo());
        coladeprueba.SeleccionarRepartidorAlAzar();
        coladeprueba.SeleccionarRepartidorAlAzar();
        coladeprueba.SeleccionarRepartidorAlAzar();
        coladeprueba.SeleccionarRepartidorAlAzar();
        assertEquals("La cola de trabajo esta vacia",coladeprueba.PrintColadetrabajo());


    }

}