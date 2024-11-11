
public class Main {
    public static void main(String[] args) {

        int income = 70000;  // доход
        int spending = 100000;  // расход

        int tex = income * 6 / 100;  // налог 6% на доходы
        int tex2 = (income - spending) * 15 / 100;  // налог 15% на разницу доходов и расходов

        System.out.println("Ваш налог на первой системе: " + tex + " рублей ");
        System.out.println("Ваш налог на второй системе: " + tex2 + " рублей ");


    }
}