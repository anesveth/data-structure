package com.debtscredsarray.debitoscreditos;


import com.google.gson.Gson;

public class DebtsnCreds {
    private Debito debitos[];
    private Credito creditos[];

    DebtsnCreds (Credito cred1, Credito cred2, Credito cred3,Credito cred4,Credito cred5,Debito debt1,Debito debt2,Debito debt3,Debito debt4,Debito debt5,Debito debt6,Debito debt7,Debito debt8,Debito debt9,
                 Debito debt10){
        this.debitos= new Debito[]{debt1, debt2, debt3, debt4, debt5, debt6, debt7, debt8, debt9, debt10};
        this.creditos=new Credito[]{cred1, cred2, cred3,cred4,cred5};
    }

    public Debito[] AddDebit(Debito newdebt){
        int n=this.debitos.length;
        Debito updateddebitos[]=new Debito[n+1];
        for (int i=0;i<n;i++){
            updateddebitos[i]=this.debitos[i];

        }
        updateddebitos[n]=newdebt;
        return this.debitos=updateddebitos;
    }

    public Credito[] AddCredit(Credito newcredit){
        int n=this.creditos.length;
        Credito updatedcreditos[]=new Credito[n+1];
        for (int i=0;i<n;i++){
            updatedcreditos[i]=this.creditos[i];

        }
        updatedcreditos[n]=newcredit;
        return this.creditos=updatedcreditos;
    }
    public String GetDebito(int position){
        Gson gson = new Gson();
        String jsonified = gson.toJson(this.debitos[position]);
        return jsonified;
    }
    public String GetCredito(int position){
        Gson gson = new Gson();
        String jsonified = gson.toJson(this.creditos[position]);
        return jsonified;
    }
    public String Show(){
        int n=this.debitos.length;
        String StringList="Debitos: ";
        for (int i=0;i<n;i++){
            StringList+=("\n"+(i+1)+") "+GetDebito(i)+"\n");
        }
        StringList+="\nCreditos: ";
        n=this.creditos.length;
        for (int i=0;i<n;i++){
            StringList+=("\n"+(i+1)+") "+GetCredito(i)+"\n");
        }

        return StringList;

    }

    public int TotalDebits(){
        int n=this.debitos.length;
        int total=0;
        for (int i=0;i<n;i++){
            total+=this.debitos[i].GetAmount();
        }
        return total;
    }
    public int TotalCrebits(){
        int n=this.creditos.length;
        int total=0;
        for (int i=0;i<n;i++){
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
        Gson gson = new Gson();
        int n=this.debitos.length;
        int biggerAmount=0;
        Debito biggerdebit=new Debito("",0);
        for (int i=0;i<n;i++){
            if(this.debitos[i].GetAmount()>biggerAmount){
                biggerAmount=this.debitos[i].GetAmount();
                biggerdebit=this.debitos[i];
            }
        }
        String json = gson.toJson(biggerdebit);
        return json;
    }

    public String Conteo(){
        int ncredits=this.creditos.length;
        int ndebits=this.debitos.length;
        return ncredits+" Operaciones de Credito"+"\n"+ndebits+" Operaciones de Debito";
    }






}
