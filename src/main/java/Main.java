public class Main {
    public static void main(String[] args) {
        int startingScore = 200;
        int replenishment = 100_000;

        if (replenishment >= 1000) {
            int bonus = replenishment / 100;
            int total = startingScore + replenishment + bonus;
            System.out.println("Клиент пополнил счет на " + replenishment + "р." + " - бонус равен " + bonus + "р." +
                    " Баланс счета - " + total + "р.");
        } else {
            int total = startingScore + replenishment;
            System.out.println("Клиент пополнил счет на " + replenishment + "р." + " - бонусов нет " +
                    " Баланс счета - " + total + "р.");
        }
    }
}
