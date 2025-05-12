public class Que14 {
    public String longestCommonPrefix(String[] strs) {
        // https://leetcode.com/problems/longest-common-prefix/
        int len = strs[0].length();
        boolean res = true;
        if (strs.length == 1)
            return strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (len > strs[i].length())
                len = strs[i].length();
        }

        int i = 0;
        for (; i < len; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    res = false;
                    break;
                }
            }
            if (!res)
                break;
        }
        return strs[0].substring(0, i);

        // StringBuilder res = new StringBuilder();
        // int l = strs[0].length();
        // for(int i=0; i<l; i++){
        // char temp = strs[0].charAt(i);
        // boolean allMatched = true;
        // for(int j=1; j<strs.length; j++){
        // if(strs[j].length() <= i || strs[j].charAt(i) != temp){
        // allMatched = false;
        // break;
        // }
        // }
        // if(allMatched) res.append(temp);
        // else break;
        // }
        // return res.toString();
    }
}
