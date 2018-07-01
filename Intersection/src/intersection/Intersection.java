package intersection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Clint
 */
public class Intersection {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("intersection.dat"));

        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            int count2 = sc.nextInt();
            sc.nextLine();
            set ObjArr[] = new set[count2];
            ArrayList<String> al = new ArrayList<>();
            String line = sc.nextLine();
            String arr1[] = line.split(" ");
            set FirstSet = new set();
            for (String el : arr1) {

                FirstSet.add(el);

            }

            for (int j = 1; j < count2; j++) {
                line = sc.nextLine();
                String arr[] = line.split(" ");
                set set = new set();
                for (String el : arr) {
                    set.add(el);
                }
                ObjArr[j] = set;
            }
            sort s = new sort(ObjArr,FirstSet);

            //System.out.println(al);
        }

    }
}

class set {

    ArrayList<String> al = new ArrayList<>();

    public void add(String s) {
        if (!contains(s)) {
            al.add(s);
        }
    }

    public boolean contains(String s) {
        boolean contains = false;
        for (String el : al) {
            if (el.equals(s)) {
                contains = true;
            }
        }
        return contains;
    }
}

class sort {

    sort(set arr[], set s) {
        String output = "";
        for (String el : s.al) {

            boolean contains = true;
            for (set set : arr) {
                set se = set;
                System.out.println("hi");
                System.out.println(se.contains(el));
                if (!se.contains(el)) {
                    contains = false;
                }
            }
            if(contains){
                output+=el+" ";
            }
        }
        System.out.println(output);

    }
}
