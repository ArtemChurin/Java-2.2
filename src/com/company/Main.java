public class Main {

    public static void main(String[] args) {
    // входные данные
    int initialAccountBalance = 100;
    int payment = 1000;

    // логика программы
    int bonus;
    if (payment >=1001) {
      bonus = (payment / 100);
    } else {
        bonus = 0;
    }

    int availableBalance = initialAccountBalance + payment + bonus;

        System.out.println("Сумма начисленных вам бонусов составляет: " + bonus);
        System.out.println("Доступный баланс вашего счета составляет: " + availableBalance);
    }
}

