import java.util.*;
public class twodArray 
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of rows");
        int rows =sc.nextInt();
        System.out.println("Enter the size of an column");
        int column =sc.nextInt();
        int numbers[][]=new int [rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                numbers[i][j]=sc.nextInt();
                

            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }

        


    }
    
    
}
