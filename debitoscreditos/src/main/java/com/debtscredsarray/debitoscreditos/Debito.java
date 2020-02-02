package com.debtscredsarray.debitoscreditos;

public class Debito {
    private int amount;
    private String nombrecuenta;

    Debito (String nombrecuenta, int amount){
        this.amount=amount;
        this.nombrecuenta=nombrecuenta;
    }


    public int GetAmount(){
        return this.amount;
    }
}
