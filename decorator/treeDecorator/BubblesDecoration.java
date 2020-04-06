package decoratorius;

public class BubblesDecoration extends TreeDecorator implements Tree {
    public BubblesDecoration(Tree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return "/ Adding bubbles " + super.decorate();
    }
}
