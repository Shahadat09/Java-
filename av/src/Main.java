import java.util.*;
public class Main {
    public static int Average(int x, int y, int z){
        int average =(x+y+z)/3;
        return average;
    }


    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println("The average of the no is " + Average(x,y,z));

    }
}