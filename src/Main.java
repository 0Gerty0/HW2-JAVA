import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        int cost = 42502;  // стоимость билета
        int rubleForBonus = 20;//сумма за которую начисляется 1 бонусная миля

        int bonus = cost / rubleForBonus;//рассчитываем количество бонусных миль
        System.out.println(bonus);//выводим на экран


    }
}