package com.javarush.test.level22.lesson09.task02;

import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {

    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder builder = new StringBuilder();

        if (params == null || params.size() == 0)
            return builder;

        int i = 0;

        for (Map.Entry<String, String> entry : params.entrySet()){
            if (entry.getKey() != null && entry.getValue() != null){
                if (i == 0){
                    builder.append(entry.getKey() + " = '" + entry.getValue() + "'");
                    i = 1;
                }
                else {
                    builder.append(" and " + entry.getKey() + " = '" + entry.getValue() + "'");
                }
            }
        }

        return builder;
    }
}
