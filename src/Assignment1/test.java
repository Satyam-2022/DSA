package Assignment1;

public class test {
    public static void main(String[] args) {
        ICICIBank iciciBank=new ICICIBank();
        iciciBank.getICICIBankDetails();
        System.out.println();

        SBIBank sbiBank=new SBIBank();
        sbiBank.getSBIBankDetails();
        System.out.println();

        HDFCBank hdfcBank= new HDFCBank();
        hdfcBank.getHDFCBankDetails();

    }
}
