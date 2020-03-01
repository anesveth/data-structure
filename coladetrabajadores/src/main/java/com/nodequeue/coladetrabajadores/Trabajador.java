package com.nodequeue.coladetrabajadores;

public class Trabajador {
    private String nombre;
    private int socialsecurity;
    private int diastrabajados;
     Trabajador (int socialsecurity){
         this.socialsecurity=socialsecurity;
         this.diastrabajados=1;
     }
    Trabajador (int socialsecurity, String nombre){
         this.nombre=nombre;
         this.socialsecurity=socialsecurity;
         this.diastrabajados=1;

    }

    public void Trabajar(){
         this.diastrabajados+=1;
    }

    public int GetSocialsecuritynumber(){
         return this.socialsecurity;
    }
    public int GetDiasTrabajados(){
        return this.diastrabajados;
    }

    public String ToString(){
         return "Social Security Number:"+this.socialsecurity+"\n Nombre:"+this.nombre+"\n Dias trabajados: "+this.diastrabajados+"\n";
    }
}
