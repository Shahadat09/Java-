import java.util.*;
public class pract {
    /*public static void reverse(int arr[]){
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
        int arr[]={14,5,8,3,9,1};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }    
}*/
public static void pair(int arr[]){
    
    for(int i=0;i<arr.length;i++){
        int curr=arr[i];
        for(int j=i+1;j<arr.length;j++){
            System.out.print("("+curr+","+arr[j]+")");

        }
        System.out.println();

        

    }
    }
    public static void main(String []args){
        int arr[]={4,5,7,9,2};
        pair(arr);
    }
}


