public class z2 {
    public static void main(String[] args) {

        System.out.println(z__2("Boeing-777"));
    }

    public static String z__2(String str) {
        String new_str="";
        for (int i = 0; i < str.length(); i++) {
                new_str+=str.charAt(str.length() - i-1);
        }
        return new_str;
    }
}
