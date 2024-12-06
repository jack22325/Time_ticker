//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Time time1 = new Time(8,9,58);
        System.out.println(time1);
        time1.tick();
        System.out.println(time1);
        time1.tick();
        System.out.println(time1);
        time1.tick();
        System.out.println(time1);
        time1.tick();
        System.out.println(time1);
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        System.out.println(time1);
        Time time2 = new Time(15, 59, 58);
        System.out.println(time2);
        time2.add(time1);
        System.out.println(time2);
    }
}