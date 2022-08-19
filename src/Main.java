public class Main {
    public static void main(String[] args) {
        SalesManager a = new SalesManager(new int[2]);
        System.out.println(a.min());
        System.out.println(a.max());
        System.out.println(a.avgExcludingMinMax());
    }
}
