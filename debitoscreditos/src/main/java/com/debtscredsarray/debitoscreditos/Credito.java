package com.debtscredsarray.debitoscreditos;

public class Credito {
    private int amount;
    private String nombrecuenta;

    Credito (String nombrecuenta, int amount){
        this.amount=amount;
        this.nombrecuenta=nombrecuenta;
    }


    public int GetAmount(){
        return this.amount;
    }

}
