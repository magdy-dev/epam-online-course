package task_1;
import java.util.Scanner;

public class Question6 {

    static double area(int x1, int y1, int x2, int y2,
                       int x3, int y3)
    {
        return Math.abs((x1*(y2-y3) + x2*(y3-y1)+
                x3*(y1-y2))/2.0);
    }
    static boolean isInside(int x1, int y1, int x2,
                            int y2, int x3, int y3, int x, int y)
    {
        /* Calculate area of triangle ABC */
        double A = area (x1, y1, x2, y2, x3, y3);

        /* Calculate area of triangle PBC */
        double A1 = area (x, y, x2, y2, x3, y3);

        /* Calculate area of triangle PAC */
        double A2 = area (x1, y1, x, y, x3, y3);

        /* Calculate area of triangle PAB */
        double A3 = area (x1, y1, x2, y2, x, y);

        /* Check if sum of A1, A2 and A3 is same as A */
        return (A == A1 + A2 + A3);
    }



    public static void main(String[] args) {


        boolean f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter ur number x,y");
        double x = scanner.nextDouble();
        double y =scanner.nextDouble();

        f=((x>=-3) && (x<=0) && (y>=0) && (y<=Math.sqrt(9-x*x)))
        ||((x>0)&&(x<=6)&&(y<=-0.5*x+3));

        System.out.println(f);

    }



}
