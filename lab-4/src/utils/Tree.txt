package parser;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private final String name;
    private final String text;
    private final List<Tree> children = new ArrayList<>();
    public double val;

    public Tree(String name) {
        this.name = name;
        this.text = null;
    }

    public Tree(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public void addChild(Tree child) {
        children.add(child);
    }

    public String getName() {
        return this.name;
    }

    public String getText() {
        return this.text;
    }

    public Tree getChild(int i) {
        return this.children.get(i);
    }

    public List<Tree> getChildren() {
        return this.children;
    }
}