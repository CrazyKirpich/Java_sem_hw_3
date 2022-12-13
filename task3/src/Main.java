// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.


import java.util.ArrayList;
import java.util.Collections;


class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(12);
        ar.add(21);
        ar.add(111);
        ar.add(133);
        int sum = 0;
        Integer[] myArray = new Integer[ar.size()];
        for (int i = 0; i < ar.size(); i++)
        {
            myArray[i] = Integer.valueOf(ar.get(i));
            sum = sum + myArray[i];
        }
        System.out.println(Collections.min(ar));
        System.out.println(Collections.max(ar));
        System.out.println(sum / ar.size());
    }
}