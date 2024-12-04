package Java_Practise3.Inhartance;

public class Big_Brother extends Father {

    int Big_Brother_salary=20000;
    int Small_Brother_Salary=0;
    void Small_Brother_Salary_Taken_From_Father_And_Brother(int f, int b)
    {
        if(Big_Brother_salary>=15000 ) {
            Small_Brother_Salary=Small_Brother_Salary+b;
            Big_Brother_salary = Big_Brother_salary - b;
        }
        if(Father_salary>=10000) {
            Small_Brother_Salary=Small_Brother_Salary+f;
            Father_salary = Father_salary - f;
        }

        System.out.println(("Small brother salary taken from both:"+Small_Brother_Salary));



    }

     void Big_Brother_salary_increment_From_Father(int c) {
        if(Father_salary>=10000) {
            Father_salary = Father_salary - c;
            Big_Brother_salary=Big_Brother_salary+c;
        }
    }
}
