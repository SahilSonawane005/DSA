package String;

import java.util.Objects;

public class StringBasics {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = "world";
        System.out.println(s.charAt(0));
        System.out.println(s.toUpperCase());
        System.out.println(s.concat(s1));


        StringBuilder str = new StringBuilder("good morning");

        System.out.println(str.append("!!"));
        System.out.println(str.indexOf("!"));
        System.out.println(str.isEmpty());

        String s2 = "abcdefgh"; //orignal string
        System.out.println(s2);
        System.out.println(revStr(s2));  //revserse string

        String s3 = "aba";
        System.out.println(revStr(s3));
        System.out.println(isPalindrom(s3));

    }
    public static String revStr(String s){
//        first way to revserse string
//        String newStr = "";
//        for (int i = s.length()-1; i >=0 ; i--) {
//            char ch = s.charAt(i);
//            newStr = newStr + ch;
//        }

//        string revserse using stringBuilder
        StringBuilder newStr = new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            char ch = s.charAt(i);
            newStr.append(ch);
        }
        return newStr.toString();
    }

    public static boolean isPalindrom(String s){
        return Objects.equals(s, revStr(s));
    }
}
