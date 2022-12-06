package ControlFolwAndMethods_2;

public class Main {
    public static void main(String[] args){
        //1. Return 1 if the input integer is positive, -1 if the input integer is negative, 0 if the input integer is zero.
//        int a = -6;
//        if(isPositive(a) == 0){
//            System.out.println("0");
//        } else if (isPositive(a) == 1) {
//            System.out.println("+");
//        } else {
//            System.out.println("-");
//        }

        //2. Determine whether an integer n is a prime number. Assumption: n is >= 2.
//        int b = 7;
//        if(!isPrime(b)){
//            System.out.println("not prime");
//        }else{
//            System.out.println("is prime");
//        }

        //3. Calculate the sum of all square numbers between 1 and n (inclusive).
//        int c = 10; //to calculate : 1+4+9
//        System.out.println(sumSquare(c));

        //4. Calculate factorial(阶乘) of n
//        int d = 4; //to calculate 1 * 2 * 3 * 4
//        System.out.println(faProduct(d));

        //5. Calculate a to the power of b (naive)
        int e = 2, f = 3;
        System.out.println(getPower(e,f));
    }

    public static int isPositive(int a){
        if(a == 0){
            return  0;
        } else if (a > 0) {
            return 1;
        }
        return -1;
    }

    public static boolean isPrime(int a){
        for(int i = 2; i * i <= a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int sumSquare(int a){
        int sum = 0;
        for(int i = 0; i*i <= a; i++){
            sum+=i*i;
        }
        return sum;
    }

    public static int faProduct(int a){
        int factorialProduct = 1;
        for(int i = 1; i <= a; i++){
            factorialProduct = factorialProduct * i;
        }
        return factorialProduct;
    }

    public static int getPower(int a, int b){
        int result = 1;
        for(int i = 1; i<= b;i++){
            result = result * a;
        }
        return result;
    }


}
