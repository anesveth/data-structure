package com.debtscredsarray.debitoscreditos;

public class Debito {
    private int amount;
    private String nombrecuenta;

    Debito (String nombrecuenta, int amount){
        this.amount=amount;
        this.nombrecuenta=nombrecuenta;
    }

    public String ToString(){
        return this.nombrecuenta+"\n Amount: Q"+this.amount;
    }

    public int GetAmount(){
        return this.amount;
    }
}
