package _0403._04;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        System.out.println("欢迎进入注册系统");
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        do{
            System.out.print("请输入用户名：");
            String account=sc.next();
            System.out.print("请输入密码：");
            String password1=sc.next();
            System.out.print("请再次输入密码：");
            String password2=sc.next();
            if(account.length()<3||password1.length()<6){
                System.out.println("用户名长度不能小于3，密码长度不能小于6！");
            }else{
                if(password1.equals(password2)){
                    System.out.println("注册成功！请牢记用户名和密码。");
                    flag=false;
                }else{
                    System.out.println("两次输入的密码不相同");
                }
            }
        }while(flag);
    }
}
