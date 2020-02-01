package com.debtscredsarray.debitoscreditos;

public class DebtsnCreds {
    private Debito Debitos[];
    private Credito Creditos[];

    DebtsnCreds (Debito debit, Credito credit){
        this.Debitos=new Debito[10];
        this.Creditos=new Credito[5];
    }
}
