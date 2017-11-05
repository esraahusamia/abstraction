/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author EsraaHus93
 */
public class Person implements PersonInterface,EmployeeInterface {
//      static final String str = "127634"; 
      public void emplyeeinfo(){
      System.out.print("info");
      }
    public double getPerson(){
            System.out.print("person");
          return 0;

    }
    public void printInfo(){
           System.out.print("info");

   }
    public void sumOfTwo(int num1,int num2){
            System.out.print(num1+num2);

    }

    
}
