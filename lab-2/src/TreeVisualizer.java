import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.Graph;
import guru.nidi.graphviz.model.Node;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static guru.nidi.graphviz.model.Factory.*;

public class TreeVisualizer {

    private static Node dfs(Tree tree, Map<String, Integer> nodeNameToCount) {
        ArrayList<Node> children = new ArrayList<>();

        for (Tree child : tree.getChildren()) {
            children.add(dfs(child, nodeNameToCount));
        }

        int cnt = nodeNameToCount.containsKey(tree.getNode())
                ? nodeNameToCount.get(tree.getNode()) + 1
                : 1;

        nodeNameToCount.put(tree.getNode(), cnt);

        return node(tree.getNode() + "_" + cnt).link(children);
    }

    public static void visualize(Parser parser, String expr, File outputFile) {
        InputStream inputStream = new ByteArrayInputStream(expr.getBytes(StandardCharsets.UTF_8));

        try {
            Tree tree = parser.parse(inputStream);

            Node root = dfs(tree, new HashMap<>());
            Graph graph = graph("tree").strict().with(root);

            Graphviz.fromGraph(graph).width(900).render(Format.PNG).toFile(outputFile);
        } catch (ParseException e) {
            System.err.println("Parse error happened " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Io exception happened " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Parser parser = new Parser();

        visualize(parser, " x | x & x", new File("examples/tree1.png"));

        visualize(parser, "x | y ^ x & z", new File("examples/tree2.png"));

        visualize(parser, "x & (y | z)", new File("examples/tree3.png"));

        visualize(parser, "x == y & z", new File("examples/tree4.png"));
    }
}
