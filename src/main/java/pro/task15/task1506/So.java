package pro.task15.task1506;

public class So {

    public static int [] nums = {1, 3, 5, 6};
    public static int target = 7;
    public static void main(String[] args){

        System.out.println(search(nums, target));

    }

    public static int search(int[] arr, int target){
        int arrStart = 0;
        int arrEnd = arr.length - 1;
        int arrMiddle = arrEnd/2;



        while (arrStart <= arrEnd){

            if ( target > arr[arrMiddle]){
                arrStart = arrMiddle + 1;
            }else if(target < arr[arrMiddle]) {
                arrEnd = arrMiddle - 1;
            } else {
                return arrMiddle;
            }
            arrMiddle =(arrEnd + arrStart) / 2;
        }




        return arrStart;

        }


    }


