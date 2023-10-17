package mockExam_waterTank;

public class WaterTank {
    private String owner;
    private double funds, amountFilled;
    
    public WaterTank(String o, double funds){
        this.owner = o;
        this.funds = funds;
        this.amountFilled = 0;
    }
    
    public String getOwner(){
        return owner;
    }
    public double getFunds(){
        return funds;
    }
    public double getAmountFilled(){
        return amountFilled;
    }
    public void addAmountFilled(double d){
        amountFilled += d;
    }
    public void fill(WaterStation s, double volume){
        double cost = s.getRate()*volume;
        if(funds >= cost){
            funds -= cost;
            amountFilled += volume;
            s.addEarnings(cost);
            System.out.println(owner + " spent " + cost + " pesos and filled tank by " + volume + "L from " + s.getName() + ".");
        }
        else{
            System.out.println(owner + " didn't have enough money to fill the tank from " + s.getName() + ".");
        }
    }
    public void displayStats(){
        System.out.println("Owner: " + owner);
        System.out.println("Funds: " + funds);
        System.out.println("Amount filled: " + amountFilled);
    }
}