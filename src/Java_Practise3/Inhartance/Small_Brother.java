package Java_Practise3.Inhartance;

public class Small_Brother extends Big_Brother {

    public static void main(String[] args) {
        Small_Brother sb=new Small_Brother();


        do{
            sb.Small_Brother_Salary_Taken_From_Father_And_Brother(5000,4000);
        } while(sb.Father_salary>=10000||sb.Big_Brother_salary>=15000);


        System.out.println("small brother overall total:"+sb.Small_Brother_Salary);
    }

}
