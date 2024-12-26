package Java_Practise3.Inhartance;

public class single_inheritance_sub_class extends single_inheritance_Parrent_class {
    public static void main(String[] args) {
        single_inheritance_sub_class sb=new single_inheritance_sub_class();
        sb.Multiplication(10,20);
        System.out.println(("parent class value showing in subclass:"+ sb.result));
    }
}
