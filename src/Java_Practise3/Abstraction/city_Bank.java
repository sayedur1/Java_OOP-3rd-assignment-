package Java_Practise3.Abstraction;

class city_Bank implements Bangladesh_Bank{
    public double customer_interest_including_tax;


    @Override

    public void interest_Rate()
    {
        double customer_amount=1000;
        double bank_rate=  .08;
        System.out.println("bank_rate:"+bank_rate);
         customer_interest_including_tax= bank_rate*customer_amount;
        System.out.println(" 8% interest of 1000 taka "+ customer_interest_including_tax);

    }

    @Override
    public void tax_Cut() {
        double tax=0.15;
        double interest_after_tax= customer_interest_including_tax-tax;
        System.out.println("customer fianl  interest after 15% tax: "+interest_after_tax);



    }


}
