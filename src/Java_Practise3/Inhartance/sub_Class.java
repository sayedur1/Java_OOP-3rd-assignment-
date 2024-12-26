package Java_Practise3.Inhartance;

public class sub_Class extends parent_Class {

     static int Big_Brother_salary=20000,Big_originalsalary=20000;
    int Small_Brother_Salary=0;


        public void Big_Brother_salary_increment_From_Father ( int c){
        if (Father_salary >= 10000) {
            Father_salary = Father_salary - c;
            Big_Brother_salary = Big_Brother_salary + c;
        }
        System.out.println("original salary of big brother:" + Big_originalsalary);
            System.out.println(" big brother increased from Father:" + Big_Brother_salary);


    }


        void SmallBrother_tookmoney_From_FatherandBrother ( int f, int b)
        {
            if (Big_Brother_salary >= 15000) {
                Small_Brother_Salary = Small_Brother_Salary + b;
                Big_Brother_salary = Big_Brother_salary - b;
            }
            if (Father_salary >= 10000) {
                Small_Brother_Salary = Small_Brother_Salary + f;
                Father_salary = Father_salary - f;
            }

        }

        /*public void salary(){
            System.out.println(("remaing father after small brother taken:" + Father_salary));
            System.out.println(("remaing big brother salary after small brother taken:" + Big_Brother_salary));

        }*/



}
