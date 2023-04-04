package _0403._04;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入用户名：");
        String account=sc.next();
        System.out.print("请输入密码：");
        String password=sc.next();
        if("TOM".equals(account)||"1234567".equals(password)){
            System.out.println("用户名与密码不匹配，登陆失败");
        }else{
            System.out.println("登陆成功");
        }
    }
}
