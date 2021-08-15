public class Main {
    public static void main(String[] args) {

        int initialAmount = 100;
        int depositAmount = 1001;
//        int bonus;

//        if (depositAmount > 1_000) {
//            bonus = depositAmount / 100;
//        } else {
//            bonus = 0;
//        }
//        Альтернативный вариант без тернарного оператора
      int bonus = (depositAmount > 1_000) ? depositAmount / 100 : 0;

        System.out.println("Ваш бонус " + bonus + " баллов");

        int totalAmount = initialAmount + depositAmount + bonus;

        System.out.println("Итоговый счёт: " + totalAmount);


    }
}
