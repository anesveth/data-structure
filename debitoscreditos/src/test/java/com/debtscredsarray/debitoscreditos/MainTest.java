package com.debtscredsarray.debitoscreditos;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void maintesting(){
        Credito credito1=new Credito("Caja",4000);
        Credito credito2=new Credito("Bancos",60000);
        Credito credito3=new Credito("Mercancias",809);
        Credito credito4=new Credito("Clientes",1290);
        Credito credito5=new Credito("Caja",1969);
        Debito debito1=new Debito("Bancos",700);
        Debito debito2=new Debito("Clientes",100);
        Debito debito3=new Debito("Caja",20);
        Debito debito4=new Debito("Proveedores",300);
        Debito debito5=new Debito("Bancos",1000);
        Debito debito6=new Debito("Tarjeta",4500);
        Debito debito7=new Debito("Caja",356);
        Debito debito8=new Debito("Caja",28);
        Debito debito9=new Debito("Tarjeta",1998);
        Debito debito10=new Debito("Bancos",23000);

        DebtsnCreds debtsncreds;

        {
            debtsncreds = new DebtsnCreds(credito1, credito2, credito3, credito4, credito5, debito1, debito2, debito3, debito4, debito5,
                    debito6, debito7, debito8, debito9, debito10);
        }
        assertEquals("{\"amount\":23000,\"nombrecuenta\":\"Bancos\"}",debtsncreds.DebitoMasGrande());

        assertEquals(32002,debtsncreds.TotalDebits());
        assertEquals(68068,debtsncreds.TotalCrebits());
        assertEquals(36066,debtsncreds.Saldo());
        assertEquals(3200,debtsncreds.PromedioDebts());
        assertEquals(5+" Operaciones de Debito"+"\n"+10+" Operaciones de Credito",debtsncreds.Conteo());


        assertEquals("Debitos: \n" +
                "1) {\"amount\":700,\"nombrecuenta\":\"Bancos\"}\n" +
                "\n" +
                "2) {\"amount\":100,\"nombrecuenta\":\"Clientes\"}\n" +
                "\n" +
                "3) {\"amount\":20,\"nombrecuenta\":\"Caja\"}\n" +
                "\n" +
                "4) {\"amount\":300,\"nombrecuenta\":\"Proveedores\"}\n" +
                "\n" +
                "5) {\"amount\":1000,\"nombrecuenta\":\"Bancos\"}\n" +
                "\n" +
                "6) {\"amount\":4500,\"nombrecuenta\":\"Tarjeta\"}\n" +
                "\n" +
                "7) {\"amount\":356,\"nombrecuenta\":\"Caja\"}\n" +
                "\n" +
                "8) {\"amount\":28,\"nombrecuenta\":\"Caja\"}\n" +
                "\n" +
                "9) {\"amount\":1998,\"nombrecuenta\":\"Tarjeta\"}\n" +
                "\n" +
                "10) {\"amount\":23000,\"nombrecuenta\":\"Bancos\"}\n" +
                "\n" +
                "Creditos: \n" +
                "1) {\"amount\":4000,\"nombrecuenta\":\"Caja\"}\n" +
                "\n" +
                "2) {\"amount\":60000,\"nombrecuenta\":\"Bancos\"}\n" +
                "\n" +
                "3) {\"amount\":809,\"nombrecuenta\":\"Mercancias\"}\n" +
                "\n" +
                "4) {\"amount\":1290,\"nombrecuenta\":\"Clientes\"}\n" +
                "\n" +
                "5) {\"amount\":1969,\"nombrecuenta\":\"Caja\"}\n",debtsncreds.Show());

    }



}