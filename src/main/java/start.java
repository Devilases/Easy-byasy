import java.util.Scanner;
public class start {
    public static void main  (String[] args) {



        for (int i = 10; i >= 5; i--){



            System.out.println(i);
        }






        int i =1;
        int b = 0;
        while (i<=10)
        {
            if ((i % 3) == 0 )
            {
                i++;
                continue;
            }



            b += i;
            i++;
        }
        System.out.println(b);



    }
}










