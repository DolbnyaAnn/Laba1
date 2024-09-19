public class z1 {
    public static void main(String[] args) {
        for(int i=1;i<=500;i++){
            System.out.println(i+") "+z__1(i));
        }
    }
    static String z__1(int i){
        if (i % 35 == 0) {
            return "fizzbuzz";
        }
        else if (i % 5 == 0) {
            return ("fizz");
        } else if (i % 7 == 0) {
            return ("buzz");
        }
        return "";
    }
}
