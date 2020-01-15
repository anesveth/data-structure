package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String answer="y";
        int totalfuel=0;
        do{
            System.out.println("mass:");
            int mass=obj.nextInt();
            int fuel=Fuel(mass);
            totalfuel+=fuel;
            System.out.println("do you wish to add more mass values? (y/n)");
            obj.nextLine();
            answer=obj.nextLine();
        }while (answer.equals("y"));
        System.out.println("total fuel: "+totalfuel);
    }
    public static int Fuel(int mass){
        return (mass/3)-2;
    }
}
