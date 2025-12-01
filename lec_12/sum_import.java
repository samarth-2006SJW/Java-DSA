package lec_12;

import lec_12.p1.sum;
import lec_12.p2.division;
public class sum_import {
    public static void main(String[] args){
        sum c=new sum(5,6);
        System.out.print("Sum of two numbers="+c.sumo()+"\n");
        division k=new division(5.5f,4f);
        System.out.print("Division of two numbers="+k.div());
    } 
}
