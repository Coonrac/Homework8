package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Errors_1.case_1());
        System.out.println(Errors_1.case_2());
    }
}
class Errors_1 {
    static String case_1() {
        String[] hw = {"Hello,", "World!"};
        String upcase = hw[2].toUpperCase();
        return upcase;
    }

    static String case_2() {
        String[] hw = {"Hello,", "World!", null};
        String upcase = hw[2].toUpperCase();
        return upcase;
    }
}