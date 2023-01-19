package org.example;

public class Main {
    public static void main(String[] args) {
        Rotation rotate=new Rotation();

        System.out.println(rotate.leftRotate("Welcome",2));
    }

}
class Rotation{
    public String leftRotate(String input, int position){
        String result=null;
            result=input.substring(position,input.length()).concat(input.substring(0,position));
        return result;
    }
}