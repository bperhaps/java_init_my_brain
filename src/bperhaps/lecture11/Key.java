package bperhaps.lecture11;

public class Key {
    public int number;

    public Key(int number){
        this.number = number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Key)) {
            return false;
        }
        Key key = (Key)obj;
        if(this.number == key.number) return true;
        return false;
    }
}
