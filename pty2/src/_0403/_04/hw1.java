package _0403._04;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个java文件：");
        String str=sc.next();
        int i=str.indexOf(".");
        String s=str.substring(i);
        if(".java".equals(s)){
            System.out.println("请输入发送到的邮箱：");
            String str1=sc.next();
            int j=str1.indexOf("@");
            int k=str1.indexOf(".");
            if(j<k||j>0){
                System.out.println("发送成功");
            }else{
                System.out.println("邮箱格式错误，发送失败");
            }
        }else{
            System.out.println("输入的文件名错误，发送失败");
        }
    }
}
