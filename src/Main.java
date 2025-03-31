public class Main {
    public static void main(String[] args)  {
        System.out.println("Hello and welcome!");

        Feeder lol = new Feeder(99999999);
        lol.simulateOneDay(2);
        System.out.println(lol.getCurrentFood());
        Feeder newFeeder  = new Feeder(9999);
        lol.simulateOneDay(3);
        System.out.println(lol.getCurrentFood());
    }
}