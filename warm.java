import java.util.*;
public class warm {
    public static void increment(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }

        public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        increment(arr);
            for(int i=0;i<arr.length;i++){
        
                System.out.println(arr[i]);

            }

        }
        
    }


