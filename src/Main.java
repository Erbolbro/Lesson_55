
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamaage(100);
        boss.setHealth(500);
        boss.setProtection("Золотая броня");
        System.out.println("жизнь босса: " + boss.getHealth());
        System.out.println("урон босса: " + boss.getDamaage());
        System.out.println("Тип защиты босса: " + boss.getProtection());
    }
}