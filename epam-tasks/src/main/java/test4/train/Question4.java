package test4.train;

import java.util.Scanner;

//оздайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.
public class Question4 {

    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        Train trainList[] = new Train[5];
        Train train=new Train();
        Train train1=new Train();
        Train train2=new Train();
        Train train3=new Train();



        train.setNameOfDestination("minsk");
        train.setTrainNumber(1);
        train.setDepartureTime("1:30");

        train1.setNameOfDestination("cairo");
        train1.setTrainNumber(2);
        train1.setDepartureTime("2:30");

        train2.setNameOfDestination("burot");
        train2.setTrainNumber(3);
        train2.setDepartureTime("3:30");

        train2.setNameOfDestination("abozanbig");
        train2.setTrainNumber(4);
        train2.setDepartureTime("4:30");

        train.setNameOfDestination("gag");
        train.setTrainNumber(5);
        train.setDepartureTime("5:50");


        System.out.println(train);
        System.out.println(train1);
        System.out.println(train2);
        System.out.println(train3);
        System.out.print("enter the number of the tran");
         String num = scanner.next();
         for (int j=1;j<trainList.length;j++){
             num.equals(trainList);
             System.out.print(trainList.toString());


         }


    }
}