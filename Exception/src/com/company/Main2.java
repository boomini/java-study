package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i,j;
        ArrayList<String> list = null;

        int[] iArr = {0,1,2,3,4};

        System.out.println("Exception before");
        try{
            System.out.println("input1 :");
            i=scanner.nextInt();
            System.out.println("input2 : ");
            j=scanner.nextInt();

            System.out.println("i/j = "+(i/j));

            for(int k=0; k<5; k++){
                System.out.println("iArr[" + k +"] : "+iArr[k]);
            }

            System.out.println("list.size(): "+list.size());
        } catch(InputMismatchException e){
            e.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("언제나 실행");
        }
        System.out.println("Exception AFTER");
    }
}
