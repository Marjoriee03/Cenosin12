package Marge.Cenosin;

import java.util.Scanner;

public class Cenosin26 {

 public static void main(String[] args) {
  Scanner myNum = new Scanner(System.in);
  Scanner read = new Scanner (System.in);
    int number1;
    int number2;
    int number3;
    int number4; 
    int answer;
    
    System.out.println("Enter Number1");
    number1=myNum.nextInt();
    
    System.out.println("Enter Number2");
    number2=myNum.nextInt();
    
    System.out.println("Enter Number3");
    number3=myNum.nextInt();
    
    System.out.println("Enter Number4");
    number4=myNum.nextInt();
    
    System.out.println("Enter Operation [+] [*]");
    System.out.println("Enter Operation [/] [-]");
    String operation = read.nextLine();
    switch (operation) {
     case "+": System.out.println("num1+num2+num3+num4=");
   System.out.println(answer = number1 + number2 + number3 + number4);
   System.out.println("The sum of four numbers is:  "+ answer);
     break;
  case "*": System.out.println("num1*num2*num3*num4= ");
      System.out.println( answer = number1 * number2 * number3 + number4);
      System.out.println("The product of four numbers is: "+answer);
       break;
      case" /": System.out.println("num1/num2/num3/num4= ");
      System.out.println(answer = number1 / number2 / number3 / number4);
      System.out.println("The quotient of four numbers is: "+ answer);
      break;
       case "-":System.out.println("num1-num2-num3-num4= "); 
      System.out.println(answer = number1 - number2 - number3 - number4);
      System.out.println("The difference of four numbers is: "+ answer);
     break;
      default: System.out.println("Invalid Input");
    }   
      
  }
 }
  
  

      
