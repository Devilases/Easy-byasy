package com.javarush.task.pro.task18.task1825;

/*
Из потока данных — в строку
*/

    public class Solution extends VersionControl {

        public static void main(String[] args) {
            System.out.println(firstBadVersion(7));


        }


        static public int firstBadVersion(int n) {
            int start = 0;
            int end = n;
            int middle;

            while (start <= end){

                middle = (end + start) / 2;

                if(isBadVersion(middle) && !isBadVersion(middle - 1)){
                    return middle;
                } else if (!isBadVersion(middle)) {
                    start = middle + 1;
                }else {
                    end = middle - 1;
                }
            }
            return -1;

        }
        static boolean isBadVersion(int mid){
            if(mid >= 1){
                return true;
            }
            return false;
        }

    }

