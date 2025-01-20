package DynamicProgramming;

public class Fibo {


    public static int Fib(int n,int []f){
        if(n==0 || n==1) return n;

        if(f[n]!=0){
            return f[n];
        }
        f[n]=Fib(n-1,f)+Fib(n-2,f);
        return f[n];
    } 


    public static void main(String[] args) {
        int n = 5;
        int f[] = new int[n + 1];

        int a = Fib(n, f);
        System.out.println(a);
    }
    
}
