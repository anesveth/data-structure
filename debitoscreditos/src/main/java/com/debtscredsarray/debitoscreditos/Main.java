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

    DebtsnCreds debtsncreds;

    {
        debtsncreds = new DebtsnCreds(credito1, credito2, credito3, credito4, credito5, debito1, debito2, debito3, debito4, debito5,
                debito6, debito7, debito8, debito9, debito10);
    }


    @PostMapping(path="/add")
    public String index(@RequestParam(value="type") String type, @RequestParam(value="cuenta") String cuenta,
                        @RequestParam(value="amount") int amount){
        if (type.equals("credito")||type.equals("Credito")){
            Credito newcredito=new Credito(cuenta,amount);
            debtsncreds.AddCredit(newcredito);
        }
        if (type.equals("debito")||type.equals("Debito")){
            Debito newdebito=new Debito(cuenta,amount);
            debtsncreds.AddDebit(newdebito);
        }

        return "Se añadio con exito, Hay "+debtsncreds.Conteo();
    }
//
    @GetMapping(path="/show")
    public String show(){
        return debtsncreds.Show();
    }
    @GetMapping(path="/totaldebitos")
    public String totaldebitos(){
        return "Total de Debitos: Q"+debtsncreds.TotalDebits();
    }
    @GetMapping(path="/totalcreditos")
    public String totalcrebitos(){
        return "Total de Creditos: Q"+debtsncreds.TotalCrebits();
    }
    @GetMapping(path="/biggestdebit")
    public String biggest(){
        return debtsncreds.DebitoMasGrande();
    }
    @GetMapping(path="/saldo")
    public String saldo(){
        return "Saldo: "+debtsncreds.Saldo();
    }
    @GetMapping(path="/promediodebitos")
    public String promediodebitos(){
        return "Promedio de debitos: "+debtsncreds.PromedioDebts();
    }
    @PostMapping(path="/deletenrestart")
    public String deletenrestart(@RequestParam(value="position1") int position1, @RequestParam(value="position2") int position2,
                                 @RequestParam(value="position3") int position3){
        int menor=0;
        int segundomenor=0;
        int mayor=0;
        if (position1<position2 && position1<position3){
            menor=position1;
            segundomenor=position2;
            mayor=position3;
            if (position3<position2){
                segundomenor=position3;
                mayor=position2;
            }
        }
        if (position2<position1 && position2<position3){
            menor=position2;
            segundomenor=position1;
            mayor=position3;
            if (position3<position1){
                segundomenor=position3;
                mayor=position1;
            }
        }
        if (position3<position1 && position3<position2){
            menor=position3;
            segundomenor=position1;
            mayor=position2;
            if (position2<position1){
                segundomenor=position2;
                mayor=position1;
            }
        }


        debtsncreds.DeleteCredit(menor);
        debtsncreds.DeleteCredit(segundomenor-1);
        debtsncreds.DeleteCredit(mayor-2);
        return debtsncreds.Conteo()+"\nTotal de Debitos: Q"+debtsncreds.TotalDebits()+"\nTotal de Creditos: Q"+debtsncreds.TotalCrebits()+"\nSaldo: "+debtsncreds.Saldo()+"\nPromedio de debitos: "+debtsncreds.PromedioDebts()+"\n Debito mas grande: "+debtsncreds.DebitoMasGrande();
    }


}
