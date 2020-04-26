package task1;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner putin=new Scanner(System.in);

   double a = 10+2;
   double b = 15;
   double c = 20;
   double ac = 4+a + c;

   double bPow = Math.pow(b,2);
  double aPow= Math.pow(a,3);
   double bPow_ =Math.pow(b,-2);
   double sqrt =Math.sqrt(bPow);
   double sqrt1 =Math.sqrt(ac);
   System.out.println(b+(bPow+ac)/a-aPow*c+bPow_);
    }
}
