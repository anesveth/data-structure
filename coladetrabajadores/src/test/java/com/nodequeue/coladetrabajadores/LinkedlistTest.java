package com.nodequeue.coladetrabajadores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedlistTest {

    @Test
    void TrabajadoresTest(){
        Trabajador trabajadortest=new Trabajador(19982,"Shawn Mendes");
        assertEquals(1,trabajadortest.GetDiasTrabajados());
        trabajadortest.Trabajar();
        assertEquals(2,trabajadortest.GetDiasTrabajados());
        assertEquals(19982,trabajadortest.GetSocialsecuritynumber());
        assertEquals("Social Security Number:"+19982+"\n Nombre:"+"Shawn Mendes"+"\n Dias trabajados: "+2+"\n",trabajadortest.ToString());
    }
    @Test
    void LinkedlistTest(){
        Linkedlist coladeprueba=new Linkedlist();

    }

}