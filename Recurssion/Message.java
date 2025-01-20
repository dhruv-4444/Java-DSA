package Recurssion;

public class Message {
    static void message(int a)
    {
        if(a<5)
        {
            System.out.println("Hello world");
            message(a+1);
        }
    }
    public static void main(String args[])
    {
        message(0);
    }
    
}
