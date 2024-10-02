package laba2;

public class Button {
    int count;
    public Button() {
        this.count = 0;
    }
    public void click(){
        count++;
        System.out.println("Button was clicked "+count+" times");
    }
}
