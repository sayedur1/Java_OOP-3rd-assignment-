package Java_Practise3.Inhartance;

public class Hirarch_child1 extends Higherarchy_Parents_class{

    public static void main(String[] args) {
        Hirarch_child1 child = new Hirarch_child1();
        int b = child.p + 50;

        System.out.println("access parent class variable inside child1:" + b);
    }
}
