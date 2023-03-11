package LinkedList;

import java.util.LinkedList;

public class Demo3 {
    public static void main(String[] args) {
        long starttime=System.currentTimeMillis();
        LinkedList<String>number= new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            number.add(0,"test data");


        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-starttime);
    }
}
