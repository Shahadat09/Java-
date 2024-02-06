import java.util.*;
public class function{
    public static void calculatesum(int a,int b){
        int sum=a+b;
        System.out.println("The sum is" +sum );

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("The value of a ");
        int a=sc.nextInt();
        System.out.println("The value of b");
        int b=sc.nextInt();
        calculatesum(a,b);
       
    }
}