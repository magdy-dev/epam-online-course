package test4.time;

public class timeM {
    public static void main (String args[]){
        Time time = new Time();
        System.out.print(time.toMilitary());
        System.out.print(time.toString());
        time.setTime(13,40,30);
        System.out.print(time.toMilitary());
        System.out.print(time.toString());

    }
}
