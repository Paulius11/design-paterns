package decoratorius;

public class Run {
    public static void main(String[] args) {
        Tree decoratePineTree = new BubblesDecoration(new FlashingLightsDecoration(new PineTreeImpl()));
        System.out.println(decoratePineTree.decorate());

        Tree decorateSpruceTree = new BubblesDecoration(new SpruceTreeImpl());
        System.out.println(decorateSpruceTree.decorate());
    }
}
