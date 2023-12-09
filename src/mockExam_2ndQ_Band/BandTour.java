package mockExam_2ndQ_Band;

public class BandTour {
    public static void main(String[] args) {
        Theater t1 = new Theater("Sydney Opera House", "Australia", 20, 5);
        Stadium s1 = new Stadium("Philippine Arena", "Philippines", 15);
        
        Band b1 = new Band("Imagine Dragons", 50);
        IndieBand i1 = new IndieBand("Formerly Maryknoll", 20, "Philippines");
        
        b1.reserve(t1);
        b1.perform();
        System.out.println(b1.getPopularity());
        
        b1.reserve(s1);
        b1.perform();
        System.out.println(b1.getPopularity());
        
        i1.reserve(t1);
        i1.perform();
        System.out.println(i1.getPopularity());
        
        i1.reserve(s1);
        i1.perform();
        System.out.println(i1.getPopularity());
    }

}
