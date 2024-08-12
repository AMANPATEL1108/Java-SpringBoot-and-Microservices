
class Calculator {

    int qw = 10;

    public int add(int n1, int n2, int n3) {
        System.out.println(qw);
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, int n2) {
        return n1 + n2;

    }

}

public class DemoTwo {
    public static void main(String[] args) {
        int data = 10;

        Calculator obj = new Calculator();
        int r1 = obj.add(2, 3, 4);
        System.out.println(r1);

    }
}