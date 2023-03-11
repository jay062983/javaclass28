package LinkedList;

import java.util.LinkedList;

public class demo1 {
    public static void main(String[] args) {
        LinkedList<String>subjects=new LinkedList<>();
        subjects.add("tails");
        subjects.add("nails");
        subjects.add("mails");
        subjects.add("snails");


        LinkedList<String>futuresubjects=new LinkedList<>();
        futuresubjects.add("tim");
        futuresubjects.add("nim");
        futuresubjects.add("kim");
        futuresubjects.add("pim");
       LinkedList<String> allsubjects=new LinkedList<>();
       //allsubjects.add(String.valueOf(subjects));
     //  allsubjects.add(String.valueOf(futuresubjects));
       allsubjects.addAll(subjects);
       allsubjects.addAll(futuresubjects);
        System.out.println(allsubjects);
        LinkedList<String> subject1=new LinkedList<>();
        subject1.add("kavin");
        subject1.add("king");
        subject1.add("chain");
allsubjects.addAll(subject1);

        System.out.println(allsubjects);
        allsubjects.removeAll(subject1);
        System.out.println(allsubjects);

    }
}
