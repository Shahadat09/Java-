import java.util.*;
public class Main{
    public static float circumference(int radius,float pie){

         float circumference=2*pie*radius;
         return circumference;


    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
       int radius= sc.nextInt();
       float pie=3.24f;
       System.out.println(circumference(radius,pie));

    }
}