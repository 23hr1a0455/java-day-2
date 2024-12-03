import java.util.*;
public class swappingwithxor{
    public static void main(String args[]){
        //accepting a string
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        String res=String.format("afetr swapping \n a=%d\n b=%d",a,b);
        System.out.println(res);
    }
}