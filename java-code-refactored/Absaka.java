public class Absaka extends Characters {
    
    private int numberOfClaws;
    private int numberOfLives;
    private int speed;
    private String specialAbility;
    private int defensePower;
    private int attackPower;
    private String name;
    private int health;

    public Absaka(int numberOfClaws, int numberOfLives, int speed) {
        super(numberOfLives, numberOfClaws, speed);
        this.numberOfLives = numberOfLives;
        this.speed = speed;
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

    public void run() {
        System.out.println("Absaka is running at " + speed + " mph!");
    }

    public void attack() {
        System.out.println("Absaka is attacking with " + numberOfClaws + " claws!");
    }

    public void setHealth(int i) {
        if (i >= 0 && i <= 100) {
            this.health = i;
        } else {
            throw new IllegalArgumentException("Health must be between 0 and 100");
        }
    }

    public void setName(String string) {
        this.name = string;
    }

    public void setAttackPower(int i) {
        this.attackPower = i;
    }

    public void setDefensePower(int i) {
        this.defensePower = i;
    }

    public void setSpecialAbility(String string) {
        this.specialAbility = string;
    }

    public String getSpecialAbility(){
        return specialAbility;
    }

    public int getDefensePower(){
        return defensePower;
    }

    public int getAttackPower(){
        return attackPower;
    }

    public int getHealth(){
        return health;
    }

    public String getName(){
        return name;
    }

    public String toString() {
        return "Name: " + getName() + "\n" +
                "Health: " + getHealth() + "\n" +
                "Attack Power: " + attackPower + "\n" +
                "Defense Power: " + defensePower + "\n" +
                "Special Ability: " + specialAbility + "\n";
    }
}
