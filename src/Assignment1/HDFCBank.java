package Assignment1;

import java.util.Scanner;

public class HDFCBank extends Bank {

   double amt;

   public double getCalculateInterest(double PrincipleAmount, int tenure, float rateOfOInterest){
       amt=(PrincipleAmount * tenure * rateOfOInterest )/ 100;
       return amt;
   }

    public void getHDFCBankDetails(){
        HDFCBank hdfcBank=new HDFCBank();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Principle amount ");
        double PrincipleAmount=scanner.nextDouble();
        System.out.println("Enter The tenure in years ");
        int tenure=scanner.nextInt();
        final  float rateOfOInterest=25;

        hdfcBank.setPrincipleAmount(PrincipleAmount);
        hdfcBank.setRateOfInterest(rateOfOInterest);
        hdfcBank.setTenure(tenure);

        System.out.println("your principle amount is ="+ hdfcBank.getPrincipleAmount());
        System.out.println("your tenure in Years is ="+ hdfcBank.getTenure());
        System.out.println("your rate of interest ="+ hdfcBank.getRateOfInterest());
        System.out.println("total Interest amount of HDFCBANK is ="+  getCalculateInterest(PrincipleAmount,tenure,rateOfOInterest));

    }
}
