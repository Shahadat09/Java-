import java.util.*;
public class incrementarray {
    public static void increment(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }
    public static void main(String [] args ){
        Scanner sc=new Scanner(System.in);
        System.out.println("The size of an array");
        int size=sc.nextInt();
        System.out.println("The value of an array is ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
             increment(arr);
             for(int i=0;i<size;i++){
        System.out.println("the increment of an array is "+ arr[i]);

    }
        }
    }
    


