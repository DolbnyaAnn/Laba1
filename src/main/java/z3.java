public class z3 {
    public static void main(String[] args){
        System.out.println(z__3(1,4,3));
    }
    static String z__3(double a,double b,double c){
        if (a==0 && b==0 && c==0){
            return "Net";
        }
        else if(a==0){
            return "x0 = "+(-c/b);
        }
        double D=Math.pow(b,2)-4*a*c;
        if(D==0){
            return "x0 = "+(-b/2*a);
        }
        else if(D>0){
            return "x1 = "+((-b-Math.pow(D,0.5))/2*a)+"x2 = "+((-b+Math.pow(D,0.5))/2*a);
        }
        else{
            return "Вещественных корней нет";
        }
    }
}

