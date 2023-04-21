package pro.task16.task1616;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/* 
Тренировка временных зон
*/

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        TreeSet<String> sss = new TreeSet<>(ZoneId.getAvailableZoneIds());


        return sss;
    }

    static ZonedDateTime getBeijingDateTime() {
        //напишите тут ваш код
        ZoneId one = ZoneId.of("Asia/Shanghai");

        return ZonedDateTime.now(one);
    }
}
