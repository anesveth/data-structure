package com.nodequeue.coladetrabajadores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Main {
    Linkedlist coladeTrabajadores=new Linkedlist();
    @GetMapping(path="/trabajadores")
    public String Showworkers(){
        return coladeTrabajadores.PrintWorkersList();
    }
    @PostMapping(path="/repartir")
    public String ColadeRepartir(@RequestParam(value = "socialsecurity") int socialsecurity, @RequestParam(value = "entidad") String entidad){
        Trabajador repartidor=new Trabajador(socialsecurity);
        coladeTrabajadores.AddToColadetrabajo(repartidor,entidad);
        return "Reparto añadido a la cola";
    }
    @GetMapping(path="/coladetrabajo")
    public String Trabajar(){
        return coladeTrabajadores.PrintColadetrabajo();
    }
    @GetMapping(path="/seleccionrepartidores")
    public String RandomSeleccion(){
        String r="";
        if (coladeTrabajadores.TotalRepartidoresCola()==0){
            r+= "No hay mas trabajadores en cola";
        }
        else{
            r+=coladeTrabajadores.SeleccionarRepartidorAlAzar();
        }
        return r;
    }

}
