package pta11_3;

import java.util.Scanner;


public class pta7_28{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int age1,age2;
        age1 = in.nextInt();
        age2 = in.nextInt();
        if(age2>=age1) System.out.println("A");
        else  System.out.println("B");
    }
}


class Person27{
   static int AverageAge;

}
class Farmer extends Person27{
   static int AverageAge;
   static char averageAgeChange(){
       char change;
       if(AverageAge>=Person27.AverageAge){
           change = 'A';
       }else{
           change = 'B';
       }
       return change;
   }
}
