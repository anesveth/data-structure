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
        Gson gson = new Gson();
        assertEquals("{\"amount\":23000,\"nombrecuenta\":\"Bancos\"}",debtsncreds.MontodeDebtsMasGrande());

    }



}