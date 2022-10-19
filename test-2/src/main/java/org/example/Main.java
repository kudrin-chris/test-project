package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); //число наборов входных данных
        for(int i = 0; i < t; i++){
            int n = in.nextInt(); // размер массива
            int[] d = new int[n];
            int[] a = new int[n];
            for(int j = 0; j < n; j++){
                int tmp = in.nextInt();
                d[j] = tmp; //ввод массива d
            }
            a[0] = d[0];
            boolean f = true;
            for(int j = 1; j < n; j++){
                int tmp1 = d[j] + a[j - 1];
                int tmp2 = -1 * (d[j] - a[j - 1]);

                if(d[j] == 0){a[j] = a[j - 1];}
                else if(tmp1 * tmp2 > 0){
                    System.out.println(-1);
                    f = false;
                    j = n;
                    break;
                }
                else if(tmp1 * tmp2 == 0){
                    System.out.println(-1);
                    f = false;
                    j = n;
                    break;
                }
                else if(tmp1 * tmp2 < 0){
                    if(tmp1 > 0){ a[j] = tmp1;}
                    else if(tmp2>= 0){ a[j] = tmp2;}
                }
            }
            if(f) { //если удалось заполнить массив а
                for(int j = 0; j < n; j++){
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            }
        }

    }
}