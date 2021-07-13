package com.company;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int num = Sc.nextInt();
//        int count = 1;
        int space = num-1;
        int chars = 1;
        for(int i = 0; i<num; i++){
            for(int j = 0; j<space; j++){
                System.out.print(" ");
            }
            for(int z = 0; z < chars; z++){
                System.out.print("*");
            }
            System.out.print("\n");

            if(i<num/2){
                space--;
                chars += 2;
            }else{
                space++;
                chars -= 2;
            }
        }
    }
}
