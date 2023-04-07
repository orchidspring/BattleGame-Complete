public class BattleField {
    
    private static void testCharacter(Characters character) {
        System.out.println("Name: " + character.getName());
        System.out.println("Health: " + character.getHealth());
        System.out.println("Attack Power: " + character.getAttackPower());
        System.out.println("Defense Power: " + character.getDefensePower());
        System.out.println("Speed: " + character.getSpeed());
        System.out.println("Special Ability: " + character.getSpecialAbility());
        System.out.println();
    }

    public static void main(String[] args) {
        
        Player p1 = new Player("Dashi", 100, 20, 10, 1);

        Absaka absaka = new Absaka(0, 0, 0);
        absaka.setName("Absaka");
        absaka.setHealth(100);
        absaka.setAttackPower(20);
        absaka.setDefensePower(10);
        absaka.setSpeed(15);
        absaka.setSpecialAbility("Fireball");

        Carmika carmika = new Carmika(null, 0, 0, 0);
        carmika.setName("Carmika");
        carmika.setHealth(100);
        carmika.setAttackPower(25);
        carmika.setDefensePower(15);
        carmika.setSpeed(20);
        carmika.setSpecialAbility("Lightning Strike");

        System.out.println("Testing Absaka...");
        testCharacter(absaka);

        System.out.println("Testing Carmika...");
        testCharacter(carmika);
        
        System.out.println("Testing Player One...");
        testCharacter(p1);

    }
}
