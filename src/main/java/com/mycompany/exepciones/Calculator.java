package com.mycompany.exepciones;

import java.util.Scanner;

public class Calculator {
    
    public Calculator(){
    }

    public int division (int a, int b){
        /*if (b==0){
        System.out.println("Operacion no permitida");
    }*/
        boolean repeat;
        int resu=0;
        Scanner scanner = new Scanner(System.in);
    do{
        repeat=false;
      try{  
          resu=a/b;
      } catch (ArithmeticException e){
          System.out.println("Operacion Stifen Hoquin");
          System.out.println("Ingrese otro valor ");
          b = scanner.nextInt();
          repeat =true;
      }
    } while (repeat);
    return resu;
   }    
}
