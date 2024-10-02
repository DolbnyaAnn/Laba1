package laba2;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    private final List<Integer> Odd = new ArrayList<>();
    private final List<Integer> Even = new ArrayList<>();


    public void addNumber(int Num){
        if(Num%2==0){
            Even.add(Num);
        }else{
            Odd.add(Num);
        }
    }
    public void even(){
        System.out.println("чЁ: "+Even);
    }
    public void odd(){
        System.out.println("нИчЁ: "+Odd);
    }
}
