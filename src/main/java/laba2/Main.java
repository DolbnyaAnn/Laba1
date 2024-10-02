package laba2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Button b = new Button();
        b.click();
        b.click();
        b.click();
        b.click();
        b.click();


        Balance balance=new Balance();
        balance.addRight(17);
        balance.addLeft(17);
        balance.result();


        Bell bell=new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();


        int[] randArr = new int[17];
        Random rng = new Random();
        for(int i=0;i< randArr.length;i++){
            randArr[i] = (rng.nextInt(16)+1);
        }
        System.out.println(Arrays.toString(randArr));
        OddEvenSeparator oddEvenSeparator=new OddEvenSeparator();
        for(int i:randArr){
            oddEvenSeparator.addNumber(i);
        }
        oddEvenSeparator.even();
        oddEvenSeparator.odd();


        Table table=new Table(7,7);
        for(int i=0;i<table.row();i++){
            for(int j=0;j<table.col();j++){
                table.setValue(i,j,(i+1)*10+j+1);
            }
        }
        System.out.println(table);
        System.out.println(table.getValue(2,3));
        System.out.println(table.row());
        System.out.println(table.col());
        System.out.println(table.average());
    }


}

