import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        int cost = 42502;  // Объявляете переменные для входных данных и
        int rforbonus = 20;// параметров программы: одну для хранения
                           // стоимости билета, другую для хранения количества
                           // рублей для одной бонусной мили

        int bonus = cost / rforbonus;
        System.out.println(bonus);
        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}