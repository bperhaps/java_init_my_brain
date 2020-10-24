package bperhaps.lecture11;

public class NewInstanceExample {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("bperhaps.lecture11.SendAction");
            //Class clazz = Class.forName("bperhaps.lecture11.ReceiveAction");
            Action action = (Action) clazz.newInstance();
            action.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch( IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
