/*
    https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/fun-at-cake-shop-pledge-easy-1/
*/
import java.io.*;
import java.lang.*;
class Hac{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        int test,flag=0;
        test = Integer.parseInt(inp.readLine());
        while(test>0){
            long pro = 1;
            String s1;
            s1= inp.readLine();
            String s2;
            s2=s1;
            char ch1[] = s1.toCharArray();
            char ch2[] = s2.toCharArray();
            int len = ch1.length;
            for(int i=len-1;i>=0;i--){
                if(ch2[i]!=ch1[len-i-1]){
                    flag=1;
                    break;
                }   
                else{
                    flag=2;
                }
            }
            if(flag==2)
                System.out.println("Palindrome");
            else{
                for(int i=0;i<len;i++){
                    pro=pro*(ch1[i]-96);
                }
                System.out.println(pro);
            }
            test--;       
        }
    } 
        
}




