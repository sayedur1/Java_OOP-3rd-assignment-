package Java_Practise3.Abstraction;

public class Abstuct_Sub_Class extends Abs_Class {
    //implementation of Abstruct
    void body() {
        System.out.println("body implementation of abstruct method");
    }

    public static void main(String[] args) {


        Abstuct_Sub_Class asco = new Abstuct_Sub_Class();
        asco.Print();
        asco.body();
    }
}
