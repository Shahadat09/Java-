import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
         int Numbers[]=new int[size];
        for(int i=0;i<size;i++){
            Numbers[i]= sc.nextInt();
        }

        int x=sc.nextInt();
        for(int i=0;i<size;i++){

            if(Numbers[i]==x){
                System.out.println("X found at index"+ i);
            }


        }
    }
}