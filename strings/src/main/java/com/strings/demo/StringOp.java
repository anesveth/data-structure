package com.strings.demo;

import org.springframework.core.style.ToStringCreator;

import java.util.Arrays;

public class StringOp {
    private char stringarray[];
    private char letters[];
    private int frequency[];


    public StringOp (String paragraph){
        char array[]=new char[paragraph.length()];
        for (int i=0;i<paragraph.length();i++){
            array[i]=paragraph.charAt(i);
        }
        this.stringarray=array;
        this.letters=new char[0];
        this.frequency=new int[0];
    }


    String Printasterisks(int amount){
        String asterirsks="";
        for (int i=0;i<amount;i++){
            asterirsks+="*";
        }
        return asterirsks;
    }
    String IdentifyLetters(){
        String returnn="";
        int i;
        int counter=0;
        for (i=0;i<this.stringarray.length;i++){
            counter=0;
            char lettertocheck=this.stringarray[i];
            for (int j=0;j<this.stringarray.length;j++){
                if (lettertocheck==this.stringarray[j]){
                    counter+=1;
                    this.stringarray[j]=0;
                }
            }
            if (lettertocheck!=0){
                Push(lettertocheck);
                CounterPush(counter);
                returnn+=lettertocheck+" "+counter+" "+Printasterisks(counter)+"\n";
            }
            for (int j=0;j<10;j++){

        }

    }
        return returnn;
    }

    String Top10(){
        IdentifyLetters();
        String top10="";
        String letter="";
        int biggerposition=0;
        for (int j=0;j<10;j++){
            int bigger=0;
            for (int i=0;i<this.letters.length;i++){
                if (this.frequency[i]>bigger){
                    letter= String.valueOf(this.letters[i]);
                    bigger=this.frequency[i];
                    biggerposition=i;
                }

            }
            this.frequency[biggerposition]=0;
            if (letter.equals(" ")){
                //so the space char doesn't appear as just a blank space//
                letter="_";
            }
            top10+=letter +" "+bigger+" "+Printasterisks(bigger)+"\n";
        }

        return top10;}


    private char[] Push(char newletter){
        int n=this.letters.length;
        char newlettersarray[]=new char[n+1];
        for (int i=0;i<n;i++){
            newlettersarray[i]=this.letters[i];
        }
        newlettersarray[n]=newletter;
        return this.letters=newlettersarray;
    }
    private int[] CounterPush(int frequency){
        int n=this.frequency.length;
        int newfrequencyarray[]=new int[n+1];
        for (int i=0;i<n;i++){
            newfrequencyarray[i]=this.frequency[i];
        }
        newfrequencyarray[n]=frequency;
        return this.frequency=newfrequencyarray;
    }

}
