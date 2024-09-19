public class z5 {
    public static void main(String[] args) {
        System.out.print(z_5("namn"));

    }
    static boolean z_5(String b){
        for(int i=0;i<=b.length()/2;i++) {
            if (b.charAt(i) != b.charAt(b.length()-i-1)) {
                System.out.print("Не является полиндромом\n");
                return false;
            }
        }
        System.out.print("Полиндромом\n");
        return true;
    }
}
