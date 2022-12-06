package primiteTypes_1;

public class Main {
    public static void main(String[] args) {
        //1. a divided by b, but without loss of precision
//        int a = 6;
//        int b = 12;
//        double c = dividing(a,b);
//        System.out.println(c);

        //2. whether an integer is even number
//        int c = 9;
//        if(isEven(c)){
//            System.out.println("c is an even number");
//        }else {
//            System.out.println("c is not an even number");
//        }

        //3. whether two integers are equal
//        int d = 18;
//        int e = 19;
//        if(areEqual(d,e)){
//            System.out.println("d and e are equal!");
//        }else{
//            System.out.println("d and e are not equal!");
//        }

        //4. Check if the given number x and y are roughly equal(在误差范围内相等), the allowed error is lower than 0.0001.
//        double f = 1.123456;
//        double g = 1.123457;
//        if(areRoughlyEqual(f, g)){
//            System.out.println("f and g are roughly equal");
//        }else{
//            System.out.println("f and g are not roughly equal");
//        }

        //5. Given two strings, concatenate them into one, separated by a comma.
//        String head = "Chen Yang";
//        String tail = "will success in coding field!";
//        System.out.println(conbine(head,tail));
    }

    public static double dividing(int a, int b){
        double result = 1.0 * a / b;
        return result;
    }

    public static boolean isEven(int a){
        if(a % 2 == 0){
            return true;
        }
        return false;
    }

    public static boolean areEqual(int a, int b){
        if(a == b){
            return true;
        }
        return false;
    }

    public static boolean areRoughlyEqual(double a, double b){
        if(a - b < 0.0001 && b - a < 0.0001){
            return true;
        }
        return  false;
    }

    public static String conbine(String a, String b){
        String result = a + " " + b;
        return result;
    }


}