package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(2000, 8, 25);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишите тут ваш код
        int weekOfDay = calendar.get(Calendar.DAY_OF_WEEK);
        String rezult;
        switch (weekOfDay){
            case 1 : rezult = "Воскресенье";
            break;
            case 2 : rezult = "Понедельник";
                break;
            case 3 : rezult = "ВТорник";
            break;

            default:rezult = "Не то";
        }

        return rezult;
    }
}
