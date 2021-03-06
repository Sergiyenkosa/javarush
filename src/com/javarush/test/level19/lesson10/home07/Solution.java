package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        String result = "";

        while (reader.ready()){
            String s = reader.readLine();

            String[] strings = s.split(" ");

            for (String a : strings){
                if(a.length() > 6){
                        result += a + ",";
                }
            }
        }

        if(result.length() != 0){
            result = result.substring(0, result.length()-1);
        }

        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        writer.write(result);

        writer.close();
    }
}
