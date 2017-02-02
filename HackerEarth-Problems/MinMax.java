/*
    https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/min-max-3/
 */
import java.util.Scanner;
class MinMax{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n,max=0,min=999,flag=0;
        n=input.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = input.nextInt();
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        for(int j=min;j<=max;j++){
            flag=0;
            for(int i = 0;i<n;i++){
                if(a[i]==j){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                break;
        }
        if(flag==0)
        System.out.printf("NO\n");
        else
        System.out.printf("YES\n");

    }
}