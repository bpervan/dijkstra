package hr.fer.zpr.nasp.lab.lab3;

import java.util.List;

public interface SPAlgorithm {
	public List<Node> getShortestPath(Graph g, String startNode, String endNode);
}
