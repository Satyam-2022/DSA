package Assignment1;

import java.util.Scanner;

public class SBIBank extends Bank{

    double amount;
    public double getCalculateInterest(double PrincipleAmount, int tenure, float rateOfOInterest){
        amount=(PrincipleAmount * tenure * rateOfOInterest )/ 100;
        return amount;
    }

    public void getSBIBankDetails(){
        SBIBank sbiBank=new SBIBank();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Principle amount ");
        double PrincipleAmount=scanner.nextDouble();
        System.out.println("Enter The tenure in years ");
        int tenure=scanner.nextInt();
        final  float rateOfOInterest=20;

        sbiBank.setPrincipleAmount(PrincipleAmount);
        sbiBank.setRateOfInterest(rateOfOInterest);
        sbiBank.setTenure(tenure);

        System.out.println("your principle amount is ="+ sbiBank.getPrincipleAmount());
        System.out.println("your tenure in Years is ="+ sbiBank.getTenure());
        System.out.println("your rate of interest ="+ sbiBank.getRateOfInterest());
        System.out.println("total Interest amount of SBIBANK is ="+  getCalculateInterest(PrincipleAmount,tenure,rateOfOInterest));

    }
}
