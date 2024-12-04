package Java_Practise3.Inhartance;

public class Hirarch_B extends Parents_clss{

   //public int m;

    public static void main(String[] args) {
        Hirarch_B child2=new Hirarch_B();
        int m= child2.p+2000;
        System.out.println("Access parents class value in child B:"+m);
    }
}
