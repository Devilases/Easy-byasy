package pro.task16.task1614;

import java.time.Instant;

/* 
Конец времен
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        //напишите тут ваш код

        long res = Long.MAX_VALUE;
        Instant time = Instant.ofEpochMilli(res);

        return time;
    }

    static Instant getMaxFromSeconds() {
        //напишите тут ваш код
        long res = Long.MAX_VALUE;
        Instant time = Instant.ofEpochSecond(res);

        return time;
    }

    static Instant getMaxFromSecondsAndNanos() {
        long res = Long.MAX_VALUE;
        Instant time = Instant.ofEpochSecond(res, res);

        return time;
    }
}
