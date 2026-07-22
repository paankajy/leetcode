package year2025;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length==1 && strs[0].length()==1) return String.valueOf(strs[0].charAt(0));
        int length = strs.length;
        Set<Character> set = new LinkedHashSet<>();
        TreeMap<String,Integer> ff = new TreeMap<>();
        for(int i=0;i<strs.length;i++){
            ff.put(strs[i],strs[i].length());
        }
        for(int i=0;i<ff.firstEntry().getValue();i++){
            for(int j=0;j<length;j++) {
                char local = strs[j].charAt(i);
                set.add(local);
            }
            if(set.size()==1){
                result = result.concat(String.valueOf(ff.firstKey().charAt(i)));
            }else {
                break;
            }
            set.clear();
        }
    return result;
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
