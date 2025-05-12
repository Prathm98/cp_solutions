public class Que125 {
    // https://leetcode.com/problems/valid-palindrome/
    public boolean isPalindrome(String s) {
        boolean result = true;
        int l=0, r=s.length()-1;
        while(l<=r){
            int a = s.codePointAt(l);
            int b = s.codePointAt(r);
            if(!((a>='0' && a<='9') || (a>='a' && a<='z') ||(a>='A' && a<='Z'))){ 
                l++; continue;
            }else if(a>='A' && a<='Z') a += 32;
            
            if(!((b>='0' && b<='9') || (b>='a' && b<='z') ||(b>='A' && b<='Z'))){ 
                r--; continue;
            } else if(b>='A' && b<='Z') b += 32;

            if(a != b) return false;
            l++; r--;        
        }
        return result;
    }
}
