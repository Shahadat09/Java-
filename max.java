import java.util.*;
public class max {
    public static int largestinArray(int arr[]){
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                Max=arr[i];
            }
        }
        return Max;
    }
        public static void main(String []args){
            Scanner sc=new Scanner(System.in);
            int arr[]=new int[4];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int largest=largestinArray(arr);
            System.out.println("The largest element in an array is " + largest);



        }


    }
    

