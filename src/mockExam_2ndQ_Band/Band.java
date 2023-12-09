package mockExam_2ndQ_Band;

public class Band {
    protected String name;
    protected Venue selectedVenue;
    protected int popularity, performances;

    public Band(String s, int p){
        name = s;
        popularity = p;
        performances = 0;
    }
    public void reserve(Venue v){
        if(v.checkAvailability()){
            v.reserve();
            selectedVenue = v;
        }
    }
    public void perform(){
        if(selectedVenue != null){
            selectedVenue.hostEvent();
            selectedVenue = null;
            popularity += 5;
            performances++;
        }
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the selectedVenue
     */
    public Venue getSelectedVenue() {
        return selectedVenue;
    }

    /**
     * @return the popularity
     */
    public int getPopularity() {
        return popularity;
    }

    /**
     * @return the performances
     */
    public int getPerformances() {
        return performances;
    }
}
