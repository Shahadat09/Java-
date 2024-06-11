import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the value of an array");
            arr[i]=s.nextInt();
        }
        System.out.println("The value of an array are");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int x=15;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("Element found at an index"+i);
            }
        }

    }
}