package com.arrayexcercise.queue;

import org.springframework.web.bind.annotation.*;

@RestController
public class Bank {
    TransactionsArray transactions=new TransactionsArray();

    @PostMapping (path="/push")
    public String index(@RequestParam(value="type") String type,@RequestParam(value="name") String name,
                        @RequestParam(value="amount") int amount, @RequestParam(value="to") String to,
                        @RequestParam(value="from") String from){

        Transaction newtransaction=new Transaction(type,name,amount,to,from);
        transactions.Push(newtransaction);
        return "Transaction Pushed Successfully";
    }

    @GetMapping (path="/pop")
    public String pop(){
        String popped=transactions.Getelement(0);
        transactions.Pop();
        return popped;
    }
    @PostMapping (path="/clear")
    public String cleararray(){
        transactions.Clear();
        return "Transactions Array Cleared";
    }
    @GetMapping (path="/transactions")
    public String transact(){
        return transactions.ShowArray();
    }


}
