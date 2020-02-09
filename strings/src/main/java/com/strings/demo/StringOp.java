package com.strings.demo;

public class StringOp {
    private char stringarray[];


    public StringOp (String paragraph){
        char array[]=new char[paragraph.length()];
        for (int i=0;i<paragraph.length();i++){
            array[i]=paragraph.charAt(i);
        }
        this.stringarray=array;
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
                returnn+=lettertocheck+" "+counter+" "+Printasterisks(counter)+"\n";
            }

        }
        return returnn;
    }
    String Top10(){

    }
//    char[] prueba(){
//        String pato = "pato";
//        char asd[] = new char[pato.length()];
//        for (int i=0;i<pato.length();i++){
//            asd[i]=pato.charAt(i);
//        }
//        return asd;
//
//    }
}
