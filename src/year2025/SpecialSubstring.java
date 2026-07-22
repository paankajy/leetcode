package year2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  SpecialSubstring {
    public static boolean hasSpecialSubstring(String s, int k) {


        String re = "";
        boolean finalResult = false;
        List<String> result = new ArrayList<>(k);
        System.out.println("string size  "+s.length());
       boolean even = k%2!=0;
            int count = k-1;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<=count;j++){
                if(j<s.length())result.add(String.valueOf(s.charAt(j)));
            }
            count++;
//            result.add(String.valueOf(s.charAt(i-1)));
//            result.add(String.valueOf(s.charAt(i)));
//            if(i!=s.length()-1){result.add(String.valueOf(s.charAt(i+1)));}
//            if(result.size()==k){

                re = String.valueOf(s.charAt(i));
                String finalRe = re;
                finalResult =  result.stream().allMatch(s1 -> s1.equals(finalRe));
                if(finalResult && i!=s.length()-k){
                   if(re.equals(String.valueOf(s.charAt((i+k))))){
                       return false;
                   }

                }
                //if(finalResult && result.size()==1) return false;
            result.removeAll(result);
            //}
//            if(even && result.size()==k){
//                result.removeAll(result);
//                re = String.valueOf(s.charAt(i));
//                String finalRe = re;
//                finalResult =  result.stream().allMatch(s1 -> s1.equals(finalRe));
//            }
            if(i==s.length()-k) break;
        }
        return finalResult;

    }

    public static void main(String[] args) {
        System.out.println(hasSpecialSubstring("aaabaaa",3));
        //System.out.println(hasSpecialSubstring("abc",2));
        //System.out.println(hasSpecialSubstring("jkjhfgg",2));
        //System.out.println(hasSpecialSubstring("gckhijh",1));
        System.out.println(hasSpecialSubstring("ccc",2));
    }
}
