public class Main {
    public static void main(String[] args) {

        int startCheck = 100; // начальный счет
        int accountReplenishment = 1200; // сумма пополнения
        int bonus; // Бонусные начисления
        int finalCheck; // Финальный счет

        if (accountReplenishment >= 1000) {
            bonus = (accountReplenishment * 1 / 100);
            finalCheck = startCheck + accountReplenishment + bonus;
            System.out.println("Начислено бонусов: " + bonus + " р.");
            System.out.println("Финальный счет: " + finalCheck + " р.");
        } else {
            finalCheck = (startCheck + accountReplenishment);
            System.out.println("Финальный счет: " + finalCheck + " р.");
        }

    }
}