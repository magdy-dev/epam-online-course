package test4.counter;

//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
public class Counter {
    private static Counter counter = null;
    private static  int num=0;

    public Counter() {

    }

    private static void lock(Object mutex) {

    }

    public int getNum() {
        for (int i=1;i>num;i++) {
            num = num + 1;
        }
        return num;
    }


    public static Counter getCounter(){
        lock(counter);{
            if (counter == null){
                counter = new Counter();
            }
            return counter ;
        }
    }



    public static class getCounter extends Counter {
    }

    @Override
    public String toString() {
        return "Counter{}"+ counter+1;
    }


}