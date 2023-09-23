
public class Main {

    public static void main(String[] args) {
        createHeroes();
        for (Hero heroes : createHeroes()) {
            System.out.println("жизнь героя: " + heroes.getHealth() + " урон героя:  " + heroes.getDamage() + " тип защиты героя: " + heroes.getSuperpower());
        }

        Boss boss = new Boss();
        boss.setDamaage(100);
        boss.setHealth(500);
        boss.setProtection("Золотая броня");
        System.out.println("жизнь босса: " + boss.getHealth());
        System.out.println("урон босса: " + boss.getDamaage());
        System.out.println("Тип защиты босса: " + boss.getProtection());
    }

    public static Hero[] createHeroes() {
        Hero ironMan = new Hero(2000, 1000, "shot");
        Hero thor = new Hero(10000, 7777);
        Hero spiderMan = new Hero(1000, 500, "wep");
        return new Hero[]{ironMan, thor, spiderMan};
    }
}