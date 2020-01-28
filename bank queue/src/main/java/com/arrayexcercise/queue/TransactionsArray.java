package com.arrayexcercise.queue;

public class TransactionsArray {
    private Transaction transactions[];

    TransactionsArray(){
        this.transactions=new Transaction[0];
    }


    public Transaction[] Push(Transaction newtransaction){
        int n=this.transactions.length;
        Transaction updatedtransactions[]=new Transaction[n+1];
        for (int i=0;i<n;i++){
            updatedtransactions[i]=this.transactions[i];

        }
        updatedtransactions[n]=newtransaction;
        return this.transactions=updatedtransactions;
    }


    public Transaction[] Pop(){
        int n=this.transactions.length;
        int position=0;
        Transaction updatedtransactions[]=new Transaction[n-1];
        for (int i=0;i<n;i++){
            if (i>=position&&i<(n-1)){
                updatedtransactions[i]=this.transactions[i+1];
            }
        }

//    public Transaction[] Popping(int position){
//        int n=this.transactions.length;
//        Transaction updatedtransactions[]=new Transaction[n-1];
//        for (int i=0;i<n;i++){
//
//            if (i>=position&&i<(n-1)){
//                updatedtransactions[i]=this.transactions[i+1];
//            }
//            if (i<position){
//                updatedtransactions[i]=this.transactions[i];
//            }
//        }

        return this.transactions=updatedtransactions;

    }
    public void Clear(){
        this.transactions=null;
        this.transactions=new Transaction[0];
    }
    public String Getelement(int position){
        int n=this.transactions.length;
        return this.transactions[position].Printinfo();

    }
    public String ShowArray(){
        int n=this.transactions.length;
        String StringList="";
        if (n==0){
            StringList+=( "No transactions found");
        }
        else {
            for (int i=0;i<n;i++){
                StringList+=("\n"+(i+1)+") "+Getelement(i)+"\n");
            }
        }
        return StringList;

    }


}
