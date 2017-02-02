import java.util.Scanner;
public class Rec{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        long result,x,y;
        x=input.nextInt();
        y=input.nextInt();
        result=(long)pro(x,y);
        System.out.println(result);
    }
    private static long pro(long x,long y){
        if(x==0)
            return y+1;
        else if(y==0 && x>0)
            return pro(x-1,1);
        else
            return pro(x-1,y+1);
    }
}