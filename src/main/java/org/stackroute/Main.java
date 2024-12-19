package org.stackroute;

public class Main {
    public String message() {
        return "Have a Happy & Healthy Day";
    }
    public static void main(String[] args) {
         Main greet=new Main();

        System.out.println(greet.message());
    }
}