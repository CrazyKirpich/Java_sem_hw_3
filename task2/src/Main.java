// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.


import java.util.ArrayList;
import java.util.List;


class Main
{
    public static void main(String args[])
    {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        Integer[] myArray = new Integer[list.size()];
        for (int i = 0; i < list.size(); i++) {
            myArray[i] = Integer.valueOf(list.get(i));

        }
        for (Integer myInt : myArray) {
            if (myInt % 2 == 1) {
                System.out.println(myInt);
            }
        }
    }
}
