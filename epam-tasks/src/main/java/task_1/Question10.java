package task_1;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args){
double a,b,x,y,z;

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter plz a b x y z");

        a=scanner.nextDouble();
        b=scanner.nextDouble();
        x=scanner.nextDouble();
        y=scanner.nextDouble();
        z=scanner.nextDouble();

        if ( x < a && y < b)||( x < b && y < a) {
            System.out.println("true");
        }
        else if (x<a && z<b ) || ( x < b &&  z < a ) {
            System.out.println("true");
        }
else if ( y < a && z < b) || ( y < b || z < a) {

            System.out.println("True")

else
            System.out.println("False");

        }

}
}
