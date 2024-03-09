package com.mycompany.whilee;

import java.util.Scanner;

public class Whilee {

public static void main(String[] args) {
        
Scanner teclado = new Scanner (System.in);

    System.out.println("Digite até 10");

int x = teclado.nextInt();

while (x != 10){
x= teclado.nextInt();
             
}
teclado.close();
        
    }
}

