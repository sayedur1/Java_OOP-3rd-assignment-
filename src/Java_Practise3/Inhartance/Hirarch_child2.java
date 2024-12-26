package Java_Practise3.Inhartance;

public class Hirarch_child2 extends Higherarchy_Parents_class{

   //public int m;

    public static void main(String[] args) {
        Hirarch_child2 child2=new Hirarch_child2();
        int m= child2.p+2000;
        System.out.println("Access parents class variable inside child2:"+m);
    }
}
