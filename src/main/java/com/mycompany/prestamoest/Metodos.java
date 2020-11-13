
package com.mycompany.prestamoest;



public class Metodos {
      

      public String User (String Usuario){ 
      Usuario= "Juan";
          return Usuario;
      }    
      
      public String Contra (String contraseña){ 
      contraseña= "Juan1234";
      return contraseña;
     }
      
      public int Tarjeta (String N){
          
           N = "5579090033925876";
           int c = N.length();
           if (N.length()<16) {
           System.out.println("Numero de tarjeta no válido");
           }else{
           System.out.println("Validando número de trajeta");
       }
          return c;
       }               
            
       public int CVV (String cvv){
          
           cvv = "284";
           int cont = cvv.length();
           if (cvv.length()<3) {
           System.out.println("Codigo valido");
           }else{
           System.out.println("Codigo Invalido");
       }
          return cont;
       }
       
       public int Edad (int edad){
       
        System.out.println("Dime tu edad: ");
        edad = 25;
 
 
        if (edad >= 18){
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }
           
           return edad;
       
       }
       
       
  }
  