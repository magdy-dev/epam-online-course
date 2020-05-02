package task2;
import java.io.*;
import java.util.*;
//Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m

public class Question41 {

        class pair
        {
            int first, second;
            pair(int f,int s)
            {
                first = f; second = s;
            }
        };

        boolean findPairs(int arr[])
        {
            HashMap<Integer,pair> map = new HashMap<Integer,pair>();
            int n=arr.length;

            for (int i=0; i<n; ++i)
            {
                for (int j=i+1; j<n; ++j)
                {
                    int sum = arr[i]+arr[j];
                    if (!map.containsKey(sum))
                        map.put(sum,new pair(i,j));

                    else
                    {
                        pair p = map.get(sum);

                        System.out.println("("+arr[p.first]+", "+arr[p.second]+
                                ") and ("+arr[i]+", "+arr[j]+")");
                        return true;
                    }
                }
            }
            return false;
        }

        // Testing program
        public static void main(String args[])
        {
            int arr[] = {3, 4, 7, 1, 2, 9, 8};
            Question41 a = new Question41();
            a.findPairs(arr);
        }
    }

