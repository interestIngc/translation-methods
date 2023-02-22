import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tree {
    private final String node;
    private final List<Tree> children = new ArrayList<>();

    public Tree(String node) {
        this.node = node;
    }

    public void addChild(Tree child) {
        children.add(child);
    }

    public String getNode() {
        return this.node;
    }

    public List<Tree> getChildren() {
        return Collections.unmodifiableList(children);
    }
}
