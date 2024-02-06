import java.util.*;
public class sum{
    public static void main(String []args){
        Scanner Sc =new Scanner(System.in);
        int i,sum=0;
        System.out.println("Enter the value of n");
        int n=Sc.nextInt();
        for(i=0;i<=n;i++){
            sum= sum +i;

        }
        System.out.println("The sum of n numbers is "+sum);





    }
}