package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileReader fileReader = new FileReader(reader.readLine());

        FileWriter fileWriter = new FileWriter(reader.readLine());

        reader.close();

        while (fileReader.ready()){

            int i = fileReader.read();

            if (i == 46){
                i = 33;
            }

            fileWriter.write(i);
        }

        fileWriter.close();

        fileReader.close();
    }
}
