package com.company;

public class Main3 {
    public static void main(String[] args) {
        Main3 main3 = new Main3();

        try{
            main3.firstMethod();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void firstMethod() throws Exception{
        secondMethod();
    }

    public void secondMethod() throws Exception{
        thirdMethod();
    }

    public void thirdMethod() throws Exception{
        System.out.println("10/0="+(10/0));
    }

}
