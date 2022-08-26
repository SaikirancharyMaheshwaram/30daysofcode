import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> s = new HashSet<Integer>();
        while(n != 1){
            s.add(n);
            int sum = 0;
            while(n != 0){
                int r = n % 10;
                n = n /10;
                sum = sum + (r*r);
            }
            if(s.contains(sum)){
                return false;
            }
            n = sum;
        }
        return true;
    }
}
class Main {
  public static void main(String[] args) {
  System.out.println("Enter the Integer");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    Solution sol=new Solution();
    sol.isHappy(n);
      

    
  }
}
