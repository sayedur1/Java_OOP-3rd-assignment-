package Java_Practise3.Inhartance;

public class Hirarch_A extends Parents_clss{

    public static void main(String[] args) {
        Hirarch_A child1 = new Hirarch_A();
        int b = child1.p + 50;

        System.out.println("access parent class value in child A:" + b);
    }
}
