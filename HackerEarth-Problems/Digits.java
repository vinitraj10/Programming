/*
 https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/digit-problem/ 

*/
import java.io.*;
class Digits{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,k,m=0;
        n=Integer.parseInt(br.readLine().split(" "));
        k=Integer.parseInt(br.readLine().split(" "));
        int a[] = new int [n];
        int s[] = new int [n-k+1];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(br.readLine().split());
        }
        for(int counter = 0;counter<n-k+1;counter++){
            for(int j=1;j<=k;j++){
                s[counter]=s[counter]+j*j*a[m];
                if(j==k)
                    m=m-k+2;
                else
                    m=m+1;
            }
            System.out.print(s[counter]+" ");
        }
    }
}

