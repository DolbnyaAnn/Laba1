package laba2;

public class Balance {
    private int left;
    private int right;
    public Balance() {
        left=0;
        right=0;
    }
    public void addRight(int weight){
        right+=weight;
    }
    public void addLeft(int weight){
        left+=weight;
    }
    public void result(){
        if(left<right){
            System.out.println("R");
        }else if(left>right){
            System.out.println("L");
        } else{
            System.out.println("=");
        }

    }
}

