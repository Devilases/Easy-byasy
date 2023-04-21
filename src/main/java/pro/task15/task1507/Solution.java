package pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.List;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        List<String> list = Files.readAllLines(Path.of(scanner.nextLine()));
        for(int i = 0; i < list.size(); i += 2){
            System.out.println(list.get(i));
        }

    }
}

