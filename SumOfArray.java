import java.util.*;
import java.io.*;
public class SumOfArray {
    public static void main(String []args)throws Exception{
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int []ar1=new int[n1];
        for(int i=0;i<ar1.length;i++){
            ar1[i]=s.nextInt();
        }
        int n2=s.nextInt();
        int []ar2=new int[n2];
        for(int i=0;i<ar2.length;i++){
            ar2[i]=s.nextInt();
        }
        int []sum=new int[n1>n2 ? n1:n2];
        int carry=0;
        int i=ar1.length-1;
        int j=ar2.length-1;
        int k=sum.length-1;

        while(k>=0){
            int dig=carry;
            if(i>=0){
                dig+=ar1[i];
            }
            if(j>=0){
                dig+=ar2[j];
            }
            carry=dig/10;
            dig=dig%10;
            sum[k]=dig;
            i--;
            j--;
            k--;
        }
        if(carry!=0){
            System.out.println(carry);
        }
        for(int val:sum){
            System.out.println(val);
        }
    }
}
