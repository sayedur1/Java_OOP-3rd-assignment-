package Java_Practise3.Inhartance;

public class lower_Subclass extends sub_Class {

    public static void main(String[] args) {


        lower_Subclass sb = new lower_Subclass();
        sb.Salary_Taken_Away_Small_Brother();
        sb.Big_Brother_salary_increment_From_Father(2000);


        do {
            sb.SmallBrother_tookmoney_From_FatherandBrother(5000, 4000);
        } while (Father_salary >= 10000 || Big_Brother_salary >= 15000);

            System.out.println("final father salary: " + Big_Brother_salary);
            System.out.println("final big brother salary:" + Father_salary);
            System.out.println("final small brother amount taken father&brother:" + sb.Small_Brother_Salary);

    }

}
