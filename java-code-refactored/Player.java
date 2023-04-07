public class Player extends Characters {
    
    private int attack;
    private int health;

    public Player(String name, int health, int attack, int defense, int level) {
        super(health, attack, defense);
        super.setName(name);
        this.setHealth(health);
        super.setSpecialAbility("None");
    }

    public void attack(Characters enemy) {
        enemy.takeDamage(this.attack);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void levelUp() {
        // TODO: Implement levelUp method
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health >= 0 && health <= 100) {
            this.health = health;
        } else {
            System.out.println("Health must be between 0 and 100");
        }
    }

    public int getAttack() {
        return this.attack;
    }

    @Override
    public void attack() {
        System.out.println("Attacking!");
        // TODO: Implement attack method
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

    @Override
    public String toString() {
        return "{" +
            " attack='" + getAttack() + "'" +
            ", health='" + getHealth() + "'" +
            "}";
    }
}
