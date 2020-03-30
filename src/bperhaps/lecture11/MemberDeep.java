package bperhaps.lecture11;

import java.util.Arrays;

public class MemberDeep implements Cloneable{
    public String id;
    public String name;
    public int[] scores;
    public Car car;

    public MemberDeep(String id, String name, String password, int[] scores, Car car) {
        this.id = id;
        this.name = name;
        this.scores = scores;
        this.car = car;

    }

    public MemberClone getMemeber() {
        MemberClone cloned = null;
        try{
            cloned = (MemberClone) clone();
        } catch (CloneNotSupportedException e) {}
        return cloned;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        MemberDeep cloned = (MemberDeep) super.clone();
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        cloned.car = new Car(this.car.model);
        return cloned;
    }
}
