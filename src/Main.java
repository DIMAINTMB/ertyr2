public class Main {

    public static void main(String[] args) {

        // сумма на счёте
        int check = 200;

        // сумма пополнения
        int refill = 3100;

        // рассчет бонуса
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        // итоговый расчет
        int total = (check + refill + bonus);

        // выводим значения на экран
        System.out.println("Итоговый счет: " + total);
        System.out.println("Итоговый бонус: " + bonus);

    }
}
