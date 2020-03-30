package bperhaps.lecture11;

public class Member {
    public String id;
    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Member)) {
            return false;
        }

        Member member = (Member) obj;
        if(id.equals(member.id)) return true;
        return false;
    }
}
