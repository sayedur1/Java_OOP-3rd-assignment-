package Java_Practise3.Abstraction;

public class Abstuctclass_Implementation extends Abs_Class {
    //implementation of Abstruct class method
    void add() {
        int a=10,b=20,sum;
        sum=a+b;
        System.out.println(" result of sum:"+sum);
    }

    public static void main(String[] args) {


        Abstuctclass_Implementation asco = new Abstuctclass_Implementation();
        asco.Print();
        asco.add();


    }
}
