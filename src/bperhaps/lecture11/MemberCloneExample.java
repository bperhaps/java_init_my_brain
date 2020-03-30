package bperhaps.lecture11;

public class MemberCloneExample {
    public static void main(String[] args) {
        MemberClone original = new MemberClone("blue", "홍길동", "12345", 25, true);

        MemberClone cloned = original.getMemeber();
        cloned.password = "76345";

        System.out.println(original.password);
        System.out.println(cloned.password);
    }
}
