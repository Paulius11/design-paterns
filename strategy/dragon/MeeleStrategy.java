package strategy.dragon;

public class MeeleStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("Sword attack!");
    }
}
