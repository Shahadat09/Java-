import java.util.*;
/*public class pair{
    public static void getpair(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print(" (" + curr+ " ," + arr[j]+")");
            }
            System.out.println();
        }
    }
        public static void main(String []args){
        int arr[]={4,5,6,7,8,9};
          getpair(arr);
    }

}*/
public class pair{
    public static void getpair(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("( "+ curr+ ","+arr[j]);
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        int arr[]={4,8,9,2,3};
        getpair(arr);
    }
}
