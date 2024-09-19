public class z4 {
    public static void main(String[] args){
        System.out.println(z__4());
    }

    static double z__4(){
        double m=0;
        int n=2;
        do {
            m+=1/(Math.pow(n,2)+n-2);
            n++;
        }
        while(1/(Math.pow(n,2)+n-2)>=Math.pow(10,(-6)));
        System.out.println(m);
        return m;
    }
}