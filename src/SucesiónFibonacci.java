public class SucesiónFibonacci {

public static void main(String[] args){
SucesiónFibonacci x = new SucesiónFibonacci();
System.out.println("la sucesion fibonacci de 12 por recursividad es: "+x.fibonacci(12));
System.out.println("la sucesion fibonacci de 12 por ciclo es: "+x.fibonacciCiclo(12));
}
 public int fibonacci(int n){
    if (n==1 || n==2){
        return 1;
    }else{
        return  fibonacci(n-1)+fibonacci(n-2);
    }
 }
 public int fibonacciCiclo(int n){
     int fibo=0, primero=1,segundo=0;
     while(n>0){
         fibo= primero+segundo;
         primero=segundo;
         segundo=fibo;
         n--;

     }
     return fibo;
 }
}