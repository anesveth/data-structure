package com.arrayexcercise.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    @Test
    void UnitTesting() {
        TransactionsArray transactions=new TransactionsArray();
        Transaction transaction1=new Transaction("Deposit","name",0,"to","from");
        //shows that you can properly create element
        assertEquals("Type:" + "Deposit" + "\nname:" + "name" + "\namount: Q" + 0 + "\nfrom:" + "from"+"\nto:"+"to",transaction1.Printinfo());

        //shows that you can properly create and print array (with pushed elements)
        transactions.Push(transaction1);
        Transaction transaction2=new Transaction("Withdraw","n",1,"too","fromm");
        transactions.Push(transaction2);
        assertEquals("\n"+(1)+") "+transaction1.Printinfo()+"\n"+"\n"+(2)+") "+transaction2.Printinfo()+"\n",transactions.ShowArray());
        //shows that you can properly pop
        transactions.Pop();
        assertEquals("\n"+(1)+") "+transaction2.Printinfo()+"\n",transactions.ShowArray());
        //shows that you can properly clear
        transactions.Clear();
        assertEquals("No transactions found",transactions.ShowArray());

    }


}