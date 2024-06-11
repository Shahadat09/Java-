import java.util.*;
public class Arrays2d{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] numbers  =new int [row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                numbers[i][j]=sc.nextInt();
//                int x=sc.nextInt();
//                numbers[i][j]=x;

            }
        }
//        int x= sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0;j<column;j++){
//                if(numbers[i][j]==x){
//                    System.out.println("X present at an location of("+ i + "," + j + ")");
                System.out.println(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}