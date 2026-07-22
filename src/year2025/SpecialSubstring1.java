package year2025;

import java.util.*;

public class SpecialSubstring1 {
    public static boolean hasSpecialSubstring(String s, int k) {
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if( s.charAt(i) != s.charAt(i-1) && count == k ) return true;
            if( s.charAt(i) != s.charAt(i-1) ) count = 0;
            count++;
        }
        return (count == k);

    }

    public static void main(String[] args) {
        System.out.println(hasSpecialSubstring("aaabaaa",3));
        System.out.println(hasSpecialSubstring("abc",2));
        System.out.println(hasSpecialSubstring("jkjhfgg",2));
        System.out.println(hasSpecialSubstring("gckhijh",1));
        System.out.println(hasSpecialSubstring("ccc",2));
        System.out.println(hasSpecialSubstring("ii",1));
        System.out.println(hasSpecialSubstring("aiheddfej",1));
        System.out.println(hasSpecialSubstring("bacjeckfih",2));
    }
}
