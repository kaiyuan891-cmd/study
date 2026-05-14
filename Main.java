import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        /*
        System.out.println("hello world");
        //数据类型
        int age = 20;
        double height = 170;
        char gender = '男';
        boolean ishandsome = true;
        String name = "mike";
        System.out.println(age);
        System.out.println(height);
        System.out.println(gender);
        System.out.println(ishandsome);
        System.out.println(name);

        //变量 运算符
        int a = 10;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //if else 判断
        int aage = 20;
        if (aage < 18){
            System.out.println("no 18");
        }else{
            System.out.println("yes 18");
        }
        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int aaage = sc.nextInt();
        System.out.println("你的年龄是"+age);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = sc.nextLine();

        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();

        System.out.println("请输入你的身高：");
        double height = sc.nextDouble();

        System.out.println("请输入你的体重:");
        double weight = sc.nextDouble();

        double BMI = weight/(height*height);

        System.out.println("hello"+name);
        System.out.println("your bmi is:"+BMI);
        if(age > 18){
            System.out.println("你已成年");
        }else{
            System.out.println("你未成年");
        }
    }
}