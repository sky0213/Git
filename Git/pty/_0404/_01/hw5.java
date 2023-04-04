package _0403._04;

import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str=sc.next();
        String s=str;
        System.out.print("请输入要查找的字符：");
        String str1=sc.next();
        int i=0,count=-1;
        do {
            i=s.indexOf(str1);
            s=s.substring(i+1);
            count++;
        }while((i<=str.length()&&i>=0));
        System.out.println(str1+"出现了"+count+"次");
    }
}
