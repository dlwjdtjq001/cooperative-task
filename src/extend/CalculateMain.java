package extend;

class Calculation{
    public int addition(int a, int b){
        return a + b;
    }
    public int subtraction(int a, int b){
        return a - b;
    }
}

class Inheritance01 extends Calculation{
    public int multiplication(int a, int b){
        return a * b;
    }
}

public class CalculateMain {
    public static void main(String[] args) {
        Inheritance01 obj = new Inheritance01();
        int a = 20;
        int b = 10;
        System.out.println("두 수의 덧셈 : " + obj.addition(a,b));
        System.out.println("두 수의 뺄셈 : " + obj.subtraction(a,b));
        System.out.println("두 수의 곱셈 : " + obj.multiplication(a,b));
    }
}
