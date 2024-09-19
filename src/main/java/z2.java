public class z2 {
    public static void main(String[] args) {

        System.out.println(z__2("Boing-777"));
    }

    public static String z__2(String b) {
        String m="";
        for (int i = 0; i < b.length(); i++) {
                m+=b.charAt(b.length() - i-1);
        }
        return m;
    }
}
