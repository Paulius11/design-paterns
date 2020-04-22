package strategy.dragon;

public class DragonSlayer {
    private DragonSlayingStrategy dragonSlayStrategy;

    public DragonSlayer(DragonSlayingStrategy dragonSlayStrategy) {
        this.dragonSlayStrategy = dragonSlayStrategy;
    }

    public void setDragonSlayStrategy(DragonSlayingStrategy dragonSlayStrategy) {
        this.dragonSlayStrategy = dragonSlayStrategy;
    }

    public void goTobattle() {
        dragonSlayStrategy.execute();
    }
}
