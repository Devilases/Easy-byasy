package pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    //напишите тут ваш код
    public int min (int a , int b){
        return Math.min(a, b);
    }
    public int min(int a, int b, int c){
        return Math.min(a, Math.min(b, c));
    }
    public int min(int a, int b, int c, int d){
        return Math.min(a, Math.min(b, Math.min(d ,c)));
    }public int min(int a, int b, int c, int d, int g){
        return Math.min(a, Math.min(b, Math.min(d, Math.min(c, g))));
    }


}
