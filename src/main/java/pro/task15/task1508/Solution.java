package pro.task15.task1508;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/* 
Читаем из консоли
*/

public class Solution {
    public static void main(String[] args) {
        try (InputStream stream = System.in;
             Scanner console = new Scanner(stream)) {
            String line = console.nextLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 1) {
                    System.out.print(String.valueOf(chars[i]).toUpperCase());
                } else {
                    System.out.print(String.valueOf(chars[i]).toLowerCase());
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

