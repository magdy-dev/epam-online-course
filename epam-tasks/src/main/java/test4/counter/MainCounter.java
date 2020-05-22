package test4.counter;

public class MainCounter {
    public static void main(String args[]) {
        Counter counter = new Counter.getCounter();
        Counter counter2 = new Counter.getCounter();


        System.out.print(counter.getNum());
        System.out.print(counter2.getNum());

    }
    }