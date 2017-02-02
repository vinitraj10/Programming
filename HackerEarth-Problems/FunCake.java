/*
    https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/fun-at-cake-shop-pledge-easy-1/
*/

import java.util.Scanner;
class FunCake{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,total=0,sumD=0,sumC=0;
        x=input.nextInt();
        int d[] = new int[x];
        int c[] = new int[x];

        for(int i=1;i<x;i++){

            if(i>=x-total){
                System.out.println("Darshak");
                break;
            }
            else if(i*i >= x-total){
                System.out.println("Chandan");
                break;
            }
            else{
                d[i]=i;
                sumD=sumD+d[i];
                c[i]=i*i;
                sumC=sumC+c[i];
                total = sumC+sumD;
            }
        }
    }
}