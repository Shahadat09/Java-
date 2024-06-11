import java.util.*;
//public class Main{
//    public static void main(String []args){
//        int marks[]={97,98,92};
////        marks[0]=96;
////        marks[1]=98;
////        marks[2]=93;
//        System.out.println(marks[2]);
//    }
//}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {

            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (numbers[i] == x) {
                System.out.println("Numbers found at an index" + i);
            }
        }
    }
}
