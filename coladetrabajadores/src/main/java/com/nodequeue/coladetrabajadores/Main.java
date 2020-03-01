package com.nodequeue.coladetrabajadores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Main {
    Linkedlist coladeTrabajadores=new Linkedlist();
    @GetMapping(path="/trabajadores")
    public String Showworkers(){

        return coladeTrabajadores.PrintWorkersList();
    }

}
