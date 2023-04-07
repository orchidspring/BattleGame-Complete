public class Carmika extends Characters {

    private int numberOfClaws;
    private int numberOfLives;
    private int speed;
    private int clawPosition;
    private int clawTarget;
    private String specialAbility;
    private int defensePower;
    private int attackPower;
    private int health;
    private String name;

    // constructor (four parameters: name, numberOfClaws, numberOfLives, speed)
    public Carmika(String name, int numberOfClaws, int numberOfLives, int speed) {
        super(name);
        this.numberOfClaws = numberOfClaws;
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

    // attack()
    public void attack() {
        System.out.println("Attacking!");
    }

    // loose 2 claws
    public void looseClaws() {
        System.out.println("The claws are now loose!");
        this.numberOfClaws -= 2;
    }

    // move claw closer to target
    private void moveClawCloserToTarget() {
        clawPosition++;
        System.out.println("Claw position: " + clawPosition);
    }

    // move claw further from target
    private void moveClawFurtherFromTarget() {
        clawPosition--;
        System.out.println("Claw position: " + clawPosition);
    }

    // move claw to target position
    public void moveClawToTargetPosition() {
        while (clawPosition != clawTarget) {
            if (clawPosition < clawTarget) {
                moveClawCloserToTarget();
            } else if (clawPosition > clawTarget) {
                moveClawFurtherFromTarget();
            }
        }
        System.out.println("Claw is in target position!");
    }

    // reduce speed by one third
    public void reduceSpeed() {
        System.out.println("Speed is reduced by 1/3");
        speed /= 3;
    }

    // increase speed by one third
    public void increaseSpeed() {
        System.out.println("Speed is increased by 1/3");
        speed *= 4;
        speed /= 3;
        System.out.println("Increase in speed: " + speed);
    }

    // generate claw speed
    public void generateClawSpeed() {
        if (speed > 0) {
            speed += (speed / 3);
        } else {
            speed = 0;
        }
    }
}

