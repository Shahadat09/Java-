import java.util.*;
public class Main{
 public static void main(String []args){
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  int numbers[]=new int[size];
  for(int i=0;i<size;i++){
   numbers[i]=sc.nextInt();


  }
  System.out.println("Enter the value of x");
  int x=sc.nextInt();
  for(int i=0;i<size;i++){
   if(numbers[i]==x){
    System.out.println("X found  at an index"+i);

   }
   System.out.println(numbers[i]);
  }
 }
}