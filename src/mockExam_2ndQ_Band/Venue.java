package mockExam_2ndQ_Band;

public abstract class Venue implements SelfPromoting{
    protected String name, location;
    protected double value;

    public Venue(String s, String l, double v){
        name = s;
        location = l;
        value = v;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public double getValue(){
        return value;
    }
    
    @Override
    public void advertise(){
        value += 2;
    }
    
    public abstract boolean checkAvailability();
    public abstract void reserve();
    public abstract void hostEvent();
}
