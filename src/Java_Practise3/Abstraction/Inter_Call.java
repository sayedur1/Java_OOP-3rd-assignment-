package Java_Practise3.Abstraction;

class Inter_Call implements Inter_Face {


    public void method1() {
        System.out.println("imterface  method1 impmentation here");
    }


    public void method2() {
        System.out.println("imterface method2 impmentation here");
    }

    public static void main(String[] args) {

        Inter_Call ob = new Inter_Call();
        ob.method1();
        ob.method2();
    }
}
