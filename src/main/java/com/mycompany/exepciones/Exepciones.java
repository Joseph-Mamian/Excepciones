package com.mycompany.exepciones;

public class Exepciones {

    public static void main(String[] args) {
  
      Calculator calculator = new Calculator();
      int resu = calculator.division(2, 0);
  /*
    try{
      
     int c= calculator.division(12, 0);
      System.out.println(c);
      
   } catch (Exception exception){
       System.out.println("But te sale un error :'v");
      System.out.println(exception);
   } finally {
      System.out.println("asasas");
    }
 */
    try{
    int [] numbers = new int [3];
    numbers [2] = 2/2;
   } catch (ArithmeticException e){
        System.out.println("Operacion no permitida");
   }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Posicion de array no valida");
   }catch (Exception e){
        System.out.println("Ha ocurrido un error");}
  
  }
}
