import java.util.*;
public class min{
    public static int minimum(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
        public static void main(String []args){
            int arr[]={12,15,18,20,6,8,3};
            int lowest=minimum(arr);
            System.out.println(lowest);

        }
    }
