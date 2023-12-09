package mockExam_2ndQ_Band;

public class IndieBand extends Band implements SelfPromoting{
    private String origin;

    public IndieBand(String s, int p, String o){
        super(s, p);
        origin = o;
    }
    @Override
    public void perform(){
        if(selectedVenue != null){
            selectedVenue.hostEvent();
            if(selectedVenue.getLocation().equals(origin)){
                popularity += 10;
            }
            else{
                popularity += 5;
            }
            selectedVenue = null;
            performances++;
        }
    }
    @Override
    public void advertise(){
        popularity += performances / 10;
    }
}
