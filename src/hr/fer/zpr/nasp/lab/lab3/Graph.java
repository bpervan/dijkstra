package hr.fer.zpr.nasp.lab.lab3;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	private List<Node> graphNodes;
	
	public Graph(){
		this.graphNodes = new ArrayList<Node>();
	}
	
	public Graph(List<Node> graphNodes){
		this.graphNodes = graphNodes;
	}
	
	public List<Node> getGraphNodes(){
		return this.graphNodes;
	}
	
	public void addGraphNode(Node nodeToAdd){
		this.graphNodes.add(nodeToAdd);
	}
	
	public Node getNodeByName(String name){
		for(Node n : graphNodes){
			if(n.getNodeName().equals(name))
				return n;
		}
		return null;
	}
}
