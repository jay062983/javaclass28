package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>();
words.add("Ana");
words.add("tall");
words.add("case");
        Iterator<String>iterator=words.iterator();

        while (iterator.hasNext()){
            String s=iterator.next();
            if(s.endsWith("a")){
                iterator.remove();
            }
        }
        System.out.println(words);
    }

}