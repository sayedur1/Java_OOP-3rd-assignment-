package Java_Practise3.Encaptulation;

public class Main {
    public static void main(String[] args) {
        encaptulation_Example ob=new encaptulation_Example();
        ob.setValue("abc@123");
      System.out.println("access the password even through private:"+ob.getValue() );

    }
}
