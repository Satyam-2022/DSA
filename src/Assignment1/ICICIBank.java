package Assignment1;

import java.util.Scanner;

public class ICICIBank extends Bank{

      double amount;
    public double getCalculateInterest(double PrincipleAmount, int tenure, float rateOfOInterest ){

         amount=(PrincipleAmount * tenure * rateOfOInterest )/ 100;
         return amount;
    }


    public void getICICIBankDetails(){

        ICICIBank iciciBank=new ICICIBank();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Principle amount ");
        double PrincipleAmount=scanner.nextDouble();
        System.out.println("Enter The tenure in years ");
        int tenure=scanner.nextInt();
        //System.out.println("Enter The rate of Interest ");
         final  float rateOfOInterest=15;

        iciciBank.setPrincipleAmount(PrincipleAmount);
        iciciBank.setRateOfInterest(rateOfOInterest);
        iciciBank.setTenure(tenure);

        System.out.println("your principle amount is ="+ iciciBank.getPrincipleAmount());
        System.out.println("your tenure in Years is ="+ iciciBank.getTenure());
        System.out.println("your rate of interest ="+ iciciBank.getRateOfInterest());
        System.out.println("total Interest amount of ICICIBANK is ="+  getCalculateInterest(PrincipleAmount,tenure,rateOfOInterest));

    }
}
