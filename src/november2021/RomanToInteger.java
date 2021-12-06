package november2021;

import java.util.HashMap;
import java.util.Map;

class RomanToInteger {
    public static Map<String,Integer> number = new HashMap<>();

static     {
        number.put("I", 1);
        number.put("V", 5);
        number.put("X", 10);
        number.put("L", 50);
        number.put("C", 100);
        number.put("D", 500);
        number.put("M", 1000);
    }
    public static int  romanToInt(String s) {
        int result =0;
        String [] roman = s.split("");
        for(int i=0;i<roman.length;i++){

            if(roman[i].equals("I") && i+1 !=roman.length && (roman[i+1].equals("V") || roman[i+1].equals("X"))){
                result-=2;
            }
             if (roman[i].equals("I")){
                result+=1;
            } if(roman[i].equals("V")){
                result+=5;
            } if(roman[i].equals("X")){
                result+=10;
            } if(roman[i].equals("L")){
                result+=50;
            } if(roman[i].equals("C")){
                result+=100;
            } if(roman[i].equals("X") && i+1!=roman.length && (roman[i+1].equals("L") || roman[i+1].equals("C"))){
                result-=20;
            }
             if(roman[i].equals("C") && i+1!=roman.length && (roman[i+1].equals("D") || roman[i+1].equals("M"))){
                result-=200;
            } if(roman[i].equals("D")){
                result+=500;
            } if(roman[i].equals("M")){
                result+=1000;
            }

        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("IV"));
    }
}