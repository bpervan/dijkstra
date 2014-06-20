package hr.fer.zpr.nasp.lab.lab3;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author bpervan
 * 
 * */
public class Node implements Comparable<Node>{
	
	/** HashMap sadrži parove Key - Value gdje su
	 * Key - susjedni èvor ovom èvoru
	 * Value - udaljenost do tog èvora*/
	private Map<Node, Integer> neighbours;
	private String nodeName;
	
	/** Udaljenost od polaznog do ovog èvora*/
	private int distance;
	
	/** Prethodni èvor ovom èvoru koji je u najkraæem
	 * lancu do krajnjeg èvora*/
	private Node previous;
	
	public Node(){
		this.neighbours = new HashMap<Node, Integer>();
		this.distance = Integer.MAX_VALUE;
	}
	/** Constructor */
	public Node(String name){
		this.nodeName = name;
		this.neighbours = new HashMap<Node, Integer>();
		this.distance = Integer.MAX_VALUE;
	}
	
	public Map<Node, Integer> getNeighbours(){
		return this.neighbours;
	}
	
	public void addNeighbour(Node neighbour, int distance){
		neighbours.put(neighbour, distance);
	}

	public String getNodeName(){
		return this.nodeName;
	}
	
	@Override
	public String toString(){
		return this.nodeName;
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o)
			return true;
		return false;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public int compareTo(Node o) {
		return Integer.compare(this.distance, o.distance);
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}
}
