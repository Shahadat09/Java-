import java.util.*;
public class prac {
    public static void reverse(int arr[]){
        int first=0;int last=arr.length-1;
        while(first<last){
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;

        }

    }
    public static void main(String []args){
        int arr[]={2,4,6,8,3,2};
        
            reverse(arr);
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]+ " ");
        }
    }
}
