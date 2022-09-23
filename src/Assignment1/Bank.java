package Assignment1;

public class Bank {
     private double PrincipleAmount;
     private int tenure;
     private float rateOfInterest;

    public double getPrincipleAmount() {
        return PrincipleAmount;
    }

    public void setPrincipleAmount(double principleAmount) {
        PrincipleAmount = principleAmount;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }
}
