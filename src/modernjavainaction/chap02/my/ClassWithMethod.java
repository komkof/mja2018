package modernjavainaction.chap02.my;

public class ClassWithMethod {
    private static String state = "initial value";

    public void changeState(String newState) {
        state = newState;
    }

    public static void changeState2(Integer integer, String newState) {
        state = newState + integer;
    }

    public void printState() {
        System.out.println(this.state);
    }

}
