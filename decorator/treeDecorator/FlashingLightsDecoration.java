package decoratorius;

public class FlashingLightsDecoration extends TreeDecorator implements Tree {
    public FlashingLightsDecoration(Tree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return "/ Adding flashing lights " + super.decorate();
    }
}
