package com.debtscredsarray.debitoscreditos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

    Credito credito1=new Credito("Caja",4000);
    Credito credito2=new Credito("Bancos",60000);
    Credito credito3=new Credito("Mercancias",809);
    Credito credito4=new Credito("Clientes",1290);
    Credito credito5=new Credito("Caja",1969);
    Debito debito1=new Debito("Bancos",700);
    Debito debito2=new Debito("Clientes",100);
    Debito debito3=new Debito("Caja",20);
    Debito debito4=new Debito("Proveedores",300);
    Debito debito5=new Debito("Bancos",1000);
    Debito debito6=new Debito("Tarjeta",4500);
    Debito debito7=new Debito("Caja",356);
    Debito debito8=new Debito("Caja",28);
    Debito debito9=new Debito("Tarjeta",1998);
    Debito debito10=new Debito("Bancos",23000);

    DebtsnCreds debtsncreds=new DebtsnCreds(credito1,credito2,credito3,credito4,credito5,debito1,debito2,debito3,debito4,debito5,
            debito6,debito7,debito8,debito9,debito10);

//    @PostMapping(path="/push")
//    public String index(@RequestParam(value="type") String type, @RequestParam(value="name") String name,
//                        @RequestParam(value="amount") int amount, @RequestParam(value="to") String to,
//                        @RequestParam(value="from") String from){
//
//        Transaction newtransaction=new Transaction(type,name,amount,to,from);
//        transactions.Push(newtransaction);
//        return "Transaction Pushed Successfully";
//    }
//
//    @GetMapping(path="/pop")
//    public String pop(){
//        String popped=transactions.Getelement(0);
//        transactions.Pop();
//        return popped;
//    }
//    @PostMapping (path="/clear")
//    public String cleararray(){
//        transactions.Clear();
//        return "Transactions Array Cleared";
//    }
//    @GetMapping (path="/transactions")
//    public String transact(){
//        return transactions.ShowArray();


}
