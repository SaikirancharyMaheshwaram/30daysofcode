import java.util.*;
import java.util.Scanner;
class Solution {
    public int reverse(int x) {
        long rev=0;
if(x<0){
x=x*-1;
             while(x!=0){
                 rev=rev*10 + x%10;
                 x=x/10;
                 
             }
             if(rev<Integer.MIN_VALUE ||rev>Integer.MAX_VALUE){
                rev=0;
             }
   rev=rev*-1;
         }
else{
    while(x!=0){
        rev=rev*10 +x%10;
        x=x/10;
    
    if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE){
        rev=0;
    }
    }
            
        }
        int out=(int)rev;
   return out;
}
}
class Main {
  public static void main(String[] args) {
    System.out.println("Enter Number");
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    Solution s=new Solution();
    int a=s.reverse(x);
    System.out.println(a);
   
    //type casting --> Narrowing( bigger to smaller)
  
  }
}
