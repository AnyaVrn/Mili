public class Main {
    public static void main(String[] args) {
        int amount = 10000;  // сумма оплаты билеты
        int mili = 20;  // количество рублей для одной мили

        System.out.println("За покупку билета на сумму:");
        System.out.println((amount) + " рублей");
        System.out.println("Будет начисленно следующее количество бонусов:");
        System.out.println((amount / mili) + " миль");
    }
}
