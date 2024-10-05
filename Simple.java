import java.util.Scanner;

public class Simple{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st numbers");
        int a=sc.nextInt();
        System.out.println("enter 2nd numbers");
        int b=sc.nextInt();
        int choice=5;
        switch(choice)
        {
            case 1:
                System.out.format("addition of two number is:%d",a+b);
                break;
            case 2:
                System.out.format("subtraction of two number is:%d",a-b);
                 break;
            case 3:
                System.out.format("mutiply of two number is :%d",a*b);
                 break;
            case 4:
                System.out.format("division of two number is :%d",a/b);
                 break;
                 default:
                 System.out.println("enterd invalid choice");

    }
    

    }
}