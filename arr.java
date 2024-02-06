import java.util.Scanner;

public class arr {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=s.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);

        }
        

    }
    
}
