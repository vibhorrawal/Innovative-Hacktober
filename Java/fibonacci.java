//Fibonacci Series using Recursion 
class fibonacci 
{ 
    static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    } 
       
    public static void main (String args[]) 
    { https://github.com/saurabhpal007/Innovative-Hacktober
    int n = 9; 
    System.out.println(fib(n)); 
    } 
} 
