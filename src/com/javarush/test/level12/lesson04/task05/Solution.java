package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    //Напишите тут ваши методы
    public static int max(int i1, int i2){
        if (i1 > i2)
            return i1;
        else return i2;
    }

    public static long max(long l1, long l2){
        if (l1 > l2)
            return l1;
        else return l2;
    }

    public static double max(double d1, double d2){
        if (d1 > d2)
            return d1;
        else return d2;
    }
}
