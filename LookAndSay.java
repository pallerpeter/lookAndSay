package lookandsay;

import stringkarakterek.CharOfString;

import java.util.ArrayList;
import java.util.List;

public class LookAndSay {

//    public String lookAndSay(String input) {
//        if (input == null || input.isEmpty())
//            return null;
//
//        StringBuilder sb = new StringBuilder();
//        int firstCharPos = 0;
//        for (int i = 0; i < input.length();i++){
//            if(input.charAt(firstCharPos) != input.charAt(i)){
//                String digitsTotal = input.substring(firstCharPos, i);
//                sb.append(digitsTotal.length()).append(input.charAt(firstCharPos));
//                firstCharPos = i;
//            }
//        }
//        sb.append(input.substring(firstCharPos,input.length()).length()).append(input.charAt(firstCharPos));
//        return sb.toString();
//    }


    public String lookAndSay(String input) {
        if(input == null || "".equals(input.trim()))
            return null;
        String say = "";
        int counter = 1;
        int i = 0;
        if(input.length() == 1)
            return "1" + input.charAt(0);
        do {
            if (input.charAt(i) == input.charAt(i + 1)){
                counter++;
                i++;
            } else {
                say += "" + counter + input.charAt(i);
                i++;
                counter = 1;
            }
        } while (i < input.length() - 1);
        say += "" + counter + input.charAt(i);
        return say;
    }


    public static void main(String[] args) {
        LookAndSay lookAndSay = new LookAndSay();
        String str = "1";
        for (int i = 0; i < 10; i++){
            System.out.println(str = lookAndSay.lookAndSay(str));
        }
    }
}
