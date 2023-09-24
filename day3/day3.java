package day3;

public class day3 {
public static void main(String[] args) {
    int[] arr={1, 3, 66, 110};
    System.out.println(max(arr)); 
}
   
   static int max(int[] arr){
        int maxNo=arr[0];
        for(int a: arr){
if(a>maxNo){
    maxNo=a;
}
        }
        return maxNo;
    }
}
