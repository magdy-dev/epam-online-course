package test4.student;

import java.util.Arrays;
import java.util.Scanner;

// Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
public class Question3 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the degree");

        Student students[] = new Student[10];

        for (int i = 0; i < students.length; i++) {
            Student student = new Student();
            System.out.println("enter the degree");
            student.setLastName(scanner.next());
            student.setGroupNumber(scanner.nextInt());
            student.setInitials(scanner.next());
            for (int j = 0; j < 5; j++) {
                System.out.println("");
                student.addMark(scanner.nextInt());
            }
            students[i] = student;
        }
        for (Student student : students) {
            if (student.average() >= 8) {
                System.out.println(student);
            }
        }


    }
}

