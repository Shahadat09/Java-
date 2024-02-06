import java.util.*;
public class Stringbuild {
    public static void main(String []args){
        StringBuilder sb=new StringBuilder("Hello");
        /*System.out.println(sb.charAt(0));
        sb.setCharAt(0,'P');
        System.out.println(sb);
        sb.insert(2,'N');
        System.out.println(sb);
        //Delete 
        sb.delete(2,3);
        System.out.println(sb);
        //to add letter in last
        sb.append("e");
        System.out.println(sb);*/
        for(int i=0;i<sb.length()/2;i++){
            int front =i;
            int back= sb.length()-1;
            
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

        }
        System.out.println(sb);

    }
    
}
