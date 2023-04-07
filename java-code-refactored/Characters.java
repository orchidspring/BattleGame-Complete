public abstract class Characters {

    private int numberOfClaws;
    private int numberOfLives;
    private int speed;
    private String specialAbility;
    private int defensePower;
    private int attackPower;
    private int health;
    private String name;

    public Characters(int numberOfClaws, int numberOfLives, int speed) {
        this.numberOfClaws = numberOfClaws;
        this.numberOfLives = numberOfLives;
        this.speed = speed;
    }

    public Characters(String name) {
        this.name = name;
    }

    public int getNumberOfClaws() {
        return numberOfClaws;
    }

    public void setNumberOfClaws(int numberOfClaws) {
        this.numberOfClaws = numberOfClaws;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void attack();

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        if (health >= 0 && health <= 100) {
            this.health = health;
        } else {
            System.out.println("Health must be between 0 and 100");
        }
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(Object attack) {
        if (attack instanceof Integer) {
            int damage = (Integer) attack;
            this.health -= damage;
        } else if (attack instanceof String) {
            String attackType = (String) attack;
            if (attackType.equals("fire")) {
                this.health -= 10;
            } else if (attackType.equals("ice")) {
                this.health -= 5;
            }
        }
    }

    @Override
    public String toString() {
        return "{" +
            " numberOfClaws='" + numberOfClaws + "'" +
            ", numberOfLives='" + numberOfLives + "'" +
            ", speed='" + speed + "'" +
            ", specialAbility='" + specialAbility + "'" +
            ", defensePower='" + defensePower + "'" +
            ", attackPower='" + attackPower + "'" +
            ", health='" + health + "'" +
            ", name='" + name + "'" +
            "}";
    }
}
