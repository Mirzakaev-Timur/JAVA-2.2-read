public class Main {
    public static void main(String[] args) {
        // вход
        int balance = 100;
        int amount = 1500;
        boolean calcBonus = (amount > 100);

        // логика
        int bonusBalans;
        if (calcBonus) {
            bonusBalans = amount / 100;
        } else {
            bonusBalans = 0;
        }

        int BalanceOut =balance + amount + bonusBalans;

        System.out.println("Ваш баланс составляет: " + BalanceOut + " рублей.Спасибо что пользуетесь нашими услугами.");
    }
}

