package com.arrayexcercise.queue;

public class Transaction {

    private String type;
    private String name;
    private int amount;
    private String to;
    private String from;

    Transaction(String type, String name, int amount, String to, String from){
        this.type=type;
        this.name=name;
        this.amount=amount;
        this.to=to;
        this.from=from;
    }

    public String Printinfo (){
        if (this.type.equals("Deposit")){
            return "Type:"+this.type+"\nname:"+this.name+"\namount: Q"+this.amount+"\nto:"+this.to;
        }
        else {
            return "Type:" + this.type + "\nname:" + this.name + "\namount: Q" + this.amount + "\nfrom:" + this.from;
        }
    }




}

