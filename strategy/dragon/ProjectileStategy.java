package strategy.dragon;

public class ProjectileStategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("Fireball attack!");
    }
}
