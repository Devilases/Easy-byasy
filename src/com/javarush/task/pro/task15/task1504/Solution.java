package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код



        try(Scanner sc = new Scanner(System.in);
                var inputStream = Files.newInputStream(Paths.get(sc.nextLine()));
                var outputStream = Files.newOutputStream(Paths.get(sc.nextLine()))
                ){
            byte[] bytesIn = inputStream.readAllBytes();
            byte[] bytesOut = new byte[bytesIn.length];
            for(int i = 0; i < bytesIn.length; i += 2){
                if(i < bytesIn.length - 1){
                    bytesOut[i] = bytesIn[i + 1];
                    bytesOut[i + 1] = bytesIn[i];
                }else {
                    bytesOut[i] = bytesIn[i];
                }
            }outputStream.write(bytesOut);

        }catch (IOException e){
            System.out.println("Something went wrong : " + e);
        }
    }
}

