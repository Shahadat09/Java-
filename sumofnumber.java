import java.util.*;
public class sumofnumber {
    public static int search(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
               

            }
        }
         return -1;

    }
    public static void main(String []args){
        int arr[]={20,40,50,60};
        int x=50;
        int index= search(arr,x);
        if(index==1){
            System.out.println("index found at"+ index);
        }else{
            System.out.println("index found at "+index);
        }

    }
    
    
}
