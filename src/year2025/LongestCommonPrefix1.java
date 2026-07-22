package year2025;

import java.util.Arrays;

public class LongestCommonPrefix1 {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
    public static void main(String[] args) {
        String []   strs = new String  []{"flower","flow","flight"};
        String []   strs1 = new String  []{"dog","racecar","car"};
        String []   strs2 = new String  []{"",""};
        String []   strs3 = new String  []{"ab", "a"};
        String []   strs4 = new String  []{"flower","flower","flower","flower"};

        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));
        System.out.println(longestCommonPrefix(strs4));
    }
}
