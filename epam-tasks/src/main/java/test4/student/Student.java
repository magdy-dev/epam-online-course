package test4.student;

import java.util.Arrays;

public class Student {

    private String lastName;
    private String initials;
    private int  groupNumber;
    private int marks[] = new int [5];
    private int counter =0;


    public void addMark(int value ){
        if (counter<=4) {
            marks[counter++] = value;
        }
    }

    public int getMark(int index ){
        if (index<=4) {
            return marks[index];
        }
        return -1;
    }

    public Student() {

    }

    public Student(String lastName,String initials, int groupNumber,double marks) {
        this.lastName=lastName;
        this.initials=initials;
        this.groupNumber=groupNumber;
    }

    public double max(){

        return max();
    }
    public double man(){
        return man();
    }

    public double average() {
        int sum = 0;
       for (int i =0;i<counter;i++){
           sum+= marks[i];
       }
       return Math.round((double) sum/(counter+1));
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
    public void setInitials(String initials){
        this.initials=initials;
    }
    public String getLastName(String next){
        return lastName;
    }
    public int getGroupNumber(){
        return groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", initials='" + initials + '\'' +
                ", groupNumber=" + groupNumber +
                ", marks=" + Arrays.toString(marks) +
                ", counter=" + counter +
                '}';
    }
}
