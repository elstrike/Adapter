public class Main {
    public static void main(String[] args) {
        Adapter target = new AdapterImpl();

        System.out.println(target.twiceOf(100.0f));
        System.out.println(target.halfOf(100f));
    }
}
