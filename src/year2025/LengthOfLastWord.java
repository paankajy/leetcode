package year2025;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s= s.trim();
//        String []s1 = s.split(" ");
//        int length = s1.length;
//        return s1[length-1].length();
        int length=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                length++;
            } else if(length>0){
                break;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        LengthOfLastWord l = new LengthOfLastWord();
        System.out.println(l.lengthOfLastWord("What are you doing  "));
    }
}
