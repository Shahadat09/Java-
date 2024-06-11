import java.util.*;
public class Main{
    public static void Addition(int sum){
        System.out.println(sum);
        return;

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y=sc.nextInt();
        int sum=x+y;
        Addition(sum);



    }
}