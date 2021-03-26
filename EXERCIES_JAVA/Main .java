package usta.fis;
//AUTHOR     : Nataly Vargas
//DATE       : 26-March-2021
//DESCRIPTION: This software calculates the average height of five children

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    p_show_info_program();
    double v_sum=0;
        for (int i=1;i<=5;i=i+1) {
            System.out.println("---children"+i+"-----");
           v_sum+= p_height();
        }
        System.out.println(v_sum);
        System.out.println("The average height is " +(v_sum)/5);

    }
    public static void p_show_info_program (){
        //DATE       : 26-March-2021
        //DESCRIPTION: This method show info program
        System.out.println("------------------------------------------");
        System.out.println("-------SoftAverage Version 1.0------------");
        System.out.println("--------Maker: Nataly Vargas--------------");
        System.out.println("DESCRIPTION: This method show info program");
        System.out.println("------------------------------------------");

    }
    public static int p_height(){
        //DESCRIPTION: This method return the height of the children
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the height of children (cm)");
        int v_height = keyboard.nextInt();
        while (v_height<=0){
            System.err.println("ERR: the height cannot be more than 200 cm or less than 50 cm, input again the height (cm)");
            v_height = keyboard.nextInt();
        }
        return v_height;


    }
}

