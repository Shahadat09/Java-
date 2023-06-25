import java.util.*;
public class Main {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] =marks[i]+1;
        }

    }
    public static void main(String []args){

        int marks[]={97,98,79};
        update(marks);
        System.out.println(marks[0]);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

    }
}