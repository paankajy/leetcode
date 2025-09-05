package year2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialSubstring {
    public static boolean hasSpecialSubstring(String s, int k) {


        String re = "";
        boolean finalResult = false;
        List<String> result = new ArrayList<>(k);
       boolean even = k%2!=0;

        for(int i=0;i<s.length();i++){
            result.add(String.valueOf(s.charAt(i)));


            if(!even && result.size()==k){

                re = String.valueOf(s.charAt(i));
                String finalRe = re;
                finalResult =  result.stream().allMatch(s1 -> s1.equals(finalRe));
            }

        }
        return finalResult;

    }

    public static void main(String[] args) {
        System.out.println(hasSpecialSubstring("jkjhfgg",2));
    }
}
