package com.debtscredsarray.debitoscreditos;

public class DebtsnCreds {
    private Debito debitos[];
    private Credito creditos[];

    DebtsnCreds (Debito debit, Credito credit){
        this.debitos=new Debito[10];
        this.creditos=new Credito[5];
    }

    public int TotalDebits(){
        int n=this.debitos.length;
        int total=0;
        for (int i=0;i<=n;i++){
            total+=this.debitos[i].GetAmount();
        }
        return total;
    }
    public int TotalCrebits(){
        int n=this.creditos.length;
        int total=0;
        for (int i=0;i<=n;i++){
            total+=this.creditos[i].GetAmount();
        }
        return total;
    }

    public int Saldo(){
        return TotalCrebits()-TotalDebits();
    }
    public int PromedioDebts(){
        int n=this.debitos.length;
        return TotalDebits()/n;
    }
    public String MontodeDebtsMasGrande(){
        int n=this.debitos.length;
        int biggerAmount=0;
        String biggerdebit="";
        for (int i=0;i<=n;i++){
            if(this.debitos[i].GetAmount()>biggerAmount){
                biggerAmount=this.creditos[i].GetAmount();
                biggerdebit=this.debitos[i].ToString();
            }
        }
        return biggerdebit;
    }

    public String Conteo(){
        int ncredits=this.creditos.length;
        int ndebits=this.debitos.length;
        return ncredits+" Operaciones de Credito"+"\n"+ndebits+" Operaciones de Debito";
    }






}
