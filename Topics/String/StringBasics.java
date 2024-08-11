package String;

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
    }
}
