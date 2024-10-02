package laba2;

public class Bell {
    private final String[] soundArr={"ding","dong"};
    private int index=0;
    public void sound(){
        System.out.println(soundArr[index]);
        index=index^1;

    }
}
