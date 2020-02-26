package bperhaps.lecture7;

public class Tire {
    public int maxRotation;
    public int accumulateRotation;
    public String location;

    public Tire(String location, int maxRotatoin) {
        this.location = location;
        this.maxRotation = maxRotatoin;
    }

    public boolean roll() {
        accumulateRotation++;
        if(accumulateRotation < maxRotation) {
            System.out.println(location + " Tire 수명 : " +
                    (maxRotation-accumulateRotation) + "회");
            return true;
        }
        System.out.println("*** " + location + " Tire 펑크 ***");
        return false;
    }
}
