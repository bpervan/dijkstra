package hr.fer.zpr.nasp.lab.lab3;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {
	
	public static void main(String[] args){
		Graph graph = new Graph(initDefaultGraphDirected());
		SPAlgorithm spAlgo = new Dijkstra();
		final String startNode = "A";
		final String endNode = "S";

		List<Node> path = spAlgo.getShortestPath(graph, startNode, endNode);
		System.out.println();
		System.out.println("Algoritam finished, printing route from " + startNode + " to " + endNode);
		for(int i = 0, predzadnjiClan = (path.size() - 1); i < path.size(); ++i){
			if(i < predzadnjiClan){
				System.out.print(path.get(i) + " -> ");
			}else{
				System.out.print(path.get(i));
				System.out.println("");
			}
		}
		System.out.println("-------------------------END-------------------------");
	}
	
	
	/**
	 * Usmjereni graf iz materijala
	 * @return Lista èvorova koja predstavlja graf
	 */
	private static List<Node> initDefaultGraphDirected(){
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");
		Node nodeG = new Node("G");
		Node nodeH = new Node("H");
		Node nodeI = new Node("I");
		Node nodeJ = new Node("J");
		Node nodeK = new Node("K");
		Node nodeL = new Node("L");
		Node nodeM = new Node("M");
		Node nodeN = new Node("N");
		Node nodeO = new Node("O");
		Node nodeP = new Node("P");
		Node nodeR = new Node("R");
		Node nodeS = new Node("S");
		
		List<Node> returnGraphList = new ArrayList<Node>();
		
		nodeA.addNeighbour(nodeB, 2);
		nodeA.addNeighbour(nodeC, 6);
		nodeA.addNeighbour(nodeD, 12);

		nodeB.addNeighbour(nodeC, 3);
		nodeB.addNeighbour(nodeE, 9);
		
		nodeC.addNeighbour(nodeF, 1);

		nodeD.addNeighbour(nodeH, 2);

		nodeE.addNeighbour(nodeG, 1);

		nodeF.addNeighbour(nodeE, 2);
		nodeF.addNeighbour(nodeH, 4);

		nodeG.addNeighbour(nodeI, 2);

		nodeH.addNeighbour(nodeI, 3);
		nodeH.addNeighbour(nodeK, 1);
		nodeH.addNeighbour(nodeL, 3);
		nodeH.addNeighbour(nodeM, 2);

		nodeI.addNeighbour(nodeJ, 1);

		nodeJ.addNeighbour(nodeN, 5);

		nodeK.addNeighbour(nodeJ, 5);
		nodeK.addNeighbour(nodeO, 9);

		nodeL.addNeighbour(nodeP, 7);

		nodeM.addNeighbour(nodeL, 2);
		nodeM.addNeighbour(nodeR, 2);

		nodeN.addNeighbour(nodeO, 4); //nije navedeno
		nodeN.addNeighbour(nodeS, 9);

		nodeO.addNeighbour(nodeS, 11);

		nodeP.addNeighbour(nodeS, 6);

		nodeR.addNeighbour(nodeS, 3);
		
		returnGraphList.add(nodeA);
		returnGraphList.add(nodeB);
		returnGraphList.add(nodeC);
		returnGraphList.add(nodeD);
		returnGraphList.add(nodeE);
		returnGraphList.add(nodeF);
		returnGraphList.add(nodeG);
		returnGraphList.add(nodeH);
		returnGraphList.add(nodeI);
		returnGraphList.add(nodeJ);
		returnGraphList.add(nodeK);
		returnGraphList.add(nodeL);
		returnGraphList.add(nodeM);
		returnGraphList.add(nodeN);
		returnGraphList.add(nodeO);
		returnGraphList.add(nodeP);
		returnGraphList.add(nodeR);
		returnGraphList.add(nodeS);
		
		return returnGraphList;
	}
	
	/**
	 * Vraæa graf iz materijala bez negativnih težina i bez smjerova
	 * @return Lista èvorova koja predstavlja graf
	 */
	private static List<Node> initDefaultGraphSimple(){
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");
		Node nodeG = new Node("G");
		Node nodeH = new Node("H");
		Node nodeI = new Node("I");
		Node nodeJ = new Node("J");
		Node nodeK = new Node("K");
		Node nodeL = new Node("L");
		Node nodeM = new Node("M");
		Node nodeN = new Node("N");
		Node nodeO = new Node("O");
		Node nodeP = new Node("P");
		Node nodeR = new Node("R");
		Node nodeS = new Node("S");
		
		List<Node> returnGraphList = new ArrayList<Node>();
		
		nodeA.addNeighbour(nodeB, 2);
		nodeA.addNeighbour(nodeC, 6);
		nodeA.addNeighbour(nodeD, 12);
		
		
		nodeB.addNeighbour(nodeA, 2);
		nodeB.addNeighbour(nodeC, 3);
		nodeB.addNeighbour(nodeE, 9);
		
		
		nodeC.addNeighbour(nodeA, 6);
		nodeC.addNeighbour(nodeB, 3);
		nodeC.addNeighbour(nodeF, 1);
		
		nodeD.addNeighbour(nodeA, 12);
		nodeD.addNeighbour(nodeH, 2);

		
		nodeE.addNeighbour(nodeB, 9);
		nodeE.addNeighbour(nodeF, 2);
		nodeE.addNeighbour(nodeG, 1);

		
		nodeF.addNeighbour(nodeC, 1);
		nodeF.addNeighbour(nodeE, 2);
		nodeF.addNeighbour(nodeH, 4);

		
		nodeG.addNeighbour(nodeE, 1);
		nodeG.addNeighbour(nodeI, 2);

		
		nodeH.addNeighbour(nodeD, 2);
		nodeH.addNeighbour(nodeF, 4);
		nodeH.addNeighbour(nodeI, 3);
		nodeH.addNeighbour(nodeK, 1);
		nodeH.addNeighbour(nodeL, 3);
		nodeH.addNeighbour(nodeM, 2);

		
		nodeI.addNeighbour(nodeG, 2);
		nodeI.addNeighbour(nodeH, 3);
		nodeI.addNeighbour(nodeJ, 1);

		
		nodeJ.addNeighbour(nodeI, 1);
		nodeJ.addNeighbour(nodeK, 5); //nije navedeno
		nodeJ.addNeighbour(nodeN, 5);

		
		nodeK.addNeighbour(nodeH, 1);
		nodeK.addNeighbour(nodeJ, 5);
		nodeK.addNeighbour(nodeO, 9);

		
		nodeL.addNeighbour(nodeH, 3);
		nodeL.addNeighbour(nodeM, 2);
		nodeL.addNeighbour(nodeP, 7);

		
		nodeM.addNeighbour(nodeH, 2);
		nodeM.addNeighbour(nodeL, 2);
		nodeM.addNeighbour(nodeR, 2);

		
		nodeN.addNeighbour(nodeJ, 5);
		nodeN.addNeighbour(nodeO, 4); //nije navedeno
		nodeN.addNeighbour(nodeS, 9);

		
		nodeO.addNeighbour(nodeK, 9);
		nodeO.addNeighbour(nodeN, 4);
		nodeO.addNeighbour(nodeS, 11);

		
		nodeP.addNeighbour(nodeL, 7);
		nodeP.addNeighbour(nodeS, 6);

		nodeR.addNeighbour(nodeM, 2);
		nodeR.addNeighbour(nodeS, 3);

		
		nodeS.addNeighbour(nodeN, 9);
		nodeS.addNeighbour(nodeO, 11);
		nodeS.addNeighbour(nodeP, 6);
		nodeS.addNeighbour(nodeR, 3);
		
		returnGraphList.add(nodeA);
		returnGraphList.add(nodeB);
		returnGraphList.add(nodeC);
		returnGraphList.add(nodeD);
		returnGraphList.add(nodeE);
		returnGraphList.add(nodeF);
		returnGraphList.add(nodeG);
		returnGraphList.add(nodeH);
		returnGraphList.add(nodeI);
		returnGraphList.add(nodeJ);
		returnGraphList.add(nodeK);
		returnGraphList.add(nodeL);
		returnGraphList.add(nodeM);
		returnGraphList.add(nodeN);
		returnGraphList.add(nodeO);
		returnGraphList.add(nodeP);
		returnGraphList.add(nodeR);
		returnGraphList.add(nodeS);
		
		return returnGraphList;
	}
}
