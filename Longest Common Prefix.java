class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res= new StringBuilder();
        if(strs.length==0) return "";
        else{

            
            Arrays.sort(strs);
          // by sorting strings will in alphabetical order
          //then by checking first string and last string will give the largest common prefix
          /*
          strings strs = ["flower","flow","flight"]
          after sorting will be
          
          flight
          flow
          flower
          
          
          
          
          */
            
            char[] first=strs[0].toCharArray();
            char[] last=strs[strs.length-1].toCharArray();
            for(int i=0;i<first.length;i++){
if(first[i]!=last[i]) break;
            else res.append(first[i]);    
            
            }
        
        
        }
        return res.toString();
        
    }
}
