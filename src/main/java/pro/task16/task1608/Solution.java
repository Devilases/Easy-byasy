package pro.task16.task1608;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/* 
Просто день недели
*/

public class Solution {

    static LocalDate birthDate = LocalDate.of(1977, 5, 31);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {

        String day = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
        //напишите тут ваш код

        return day;
    }
}
