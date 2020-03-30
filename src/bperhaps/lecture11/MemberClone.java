package bperhaps.lecture11;

public class MemberClone implements Cloneable{
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    public MemberClone(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }

    public MemberClone getMemeber() {
        MemberClone cloned = null;
        try{
            cloned = (MemberClone) clone();
        } catch (CloneNotSupportedException e) {}
        return cloned;
    }
}
