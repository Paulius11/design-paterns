package strategy.dragon;

public class App {
    public static void main(String[] args) {
        DragonSlayer ds = new DragonSlayer(new ProjectileStategy());
        ds.goTobattle();
        ds = new DragonSlayer(new MeeleStrategy());
        ds.goTobattle();
        ds = new DragonSlayer(() -> System.out.println("Super attack"));
        ds.goTobattle();
    }
}
