package _0403._04;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入用户名：");
        String account=sc.next();
        System.out.print("请输入密码：");
        String password=sc.next();
        if(password.length()<6){
            System.out.println("密码长度不能小于6位");
        }else{
            System.out.println("注册成功");
        }
    }
}
