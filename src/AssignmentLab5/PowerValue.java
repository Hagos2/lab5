package AssignmentLab5;

import java.util.Scanner;

public class PowerValue {

    public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.print(" Enter the number");
//int  num= input.nextInt();
for(int i=6;i<=100;i+=3){
  int  num= input.nextInt();
       //num=i;
    if(num ==6){
      System.out.println((long)Math.pow(10,num) + " = " + " Million ") ;
    }
    else if(num==9){
        System.out.println((long)Math.pow(10,num) + "=" +"Billion ") ;
    }
    else if(num==12){
        System.out.println((long)Math.pow(10,num) +"=" + "Trillion") ;
    }
    else if(num==15){
        System.out.println((long)Math.pow(10,num) + "=" + "Quadrillion ") ;
    }
    else if(num==18){
        System.out.println((long)Math.pow(10,num) + "=" + "Quintillion ") ;
    }
    else if(num==21){
        System.out.println(Math.pow(10,num) +"=" + "sextillion") ;
    }
    else if(num==30){
        System.out.println(Math.pow(10,num) + "=" + "Nonillion ") ;
    }
    else if(num==100){
        System.out.println(Math.pow(10,num) + "=" +"Googol ") ;
    }
    else{
        System.out.println("none");
    }
}
    }
}
