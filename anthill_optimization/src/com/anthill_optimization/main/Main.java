package com.anthill_optimization.main;

import java.util.ArrayList;

public class Main {
	
	/** 
    * This is the main method which creates a graph of nodes and connects them to model
    * an ant hill. 
    * @param args Unused 
    * @return None 
    */
	public static void main(String[] args) {
		Node node1  = new Node(1);
		Node node2  = new Node(2);
		Node node3  = new Node(3);
		Node node4  = new Node(4);
		Node node5  = new Node(5);
		Node node6  = new Node(6);
		Node node7  = new Node(7);
		Node node8  = new Node(8);
		Node node9  = new Node(9);
		Node node10  = new Node(10);
		Node node11  = new Node(11);
		Node node12  = new Node(12);
		Node node13  = new Node(13);
		Node node14  = new Node(14);
		Node node15  = new Node(15);
		Node node16  = new Node(16);
		Node node17  = new Node(17);
		Node node18  = new Node(18);
		Node node19  = new Node(19);
		Node node20  = new Node(20);
		Node node21  = new Node(21);
		Node node22  = new Node(22);
		Node node23  = new Node(23);
		Node node24  = new Node(24);
		Node node25  = new Node(25);
		Node node26  = new Node(26);
		Node node27  = new Node(27);
		Node node28  = new Node(28);
		Node node29  = new Node(29);
		Node node30  = new Node(30);
		Node node31  = new Node(31);
		Node node32  = new Node(32);
		Node node33  = new Node(33);
		Node node34  = new Node(34);
		Node node35  = new Node(35);
		Node node36  = new Node(36);
		Node node37  = new Node(37);
		Node node38  = new Node(38);
		Node node39  = new Node(39);
		Node node40  = new Node(40);
		Node node41  = new Node(41);
		Node node42  = new Node(42);
		Node node43  = new Node(43);
		Node node44  = new Node(44);
		Node node45  = new Node(45);
		Node node46  = new Node(46);
		Node node47  = new Node(47);
		Node node48  = new Node(48);
		Node node49  = new Node(49);
		Node node50  = new Node(50);
		Node node51  = new Node(51);
		Node node52  = new Node(52);
		Node node53  = new Node(53);
		Node node54  = new Node(54);
		Node node55  = new Node(55);
		Node node56  = new Node(56);
		Node node57  = new Node(57);
		Node node58  = new Node(58);
		Node node59  = new Node(59);
		Node node60  = new Node(60);
		Node node61  = new Node(61);
		Node node62  = new Node(62);
		
		node1.connectNode(node3);
		node3.connectNode(node4);
		node4.connectNode(node5);
		node5.connectNode(node6);
		node6.connectNode(node7);
		node7.connectNode(node23);
		node23.connectNode(node24);
		node24.connectNode(node25);
		node25.connectNode(node26);
		node26.connectNode(node27);
		node27.connectNode(node28);
		node28.connectNode(node29);
		node29.connectNode(node30);
		node30.connectNode(node31);
		node31.connectNode(node32);
		node32.connectNode(node33);
		node33.connectNode(node34);
		node34.connectNode(node35);
		node35.connectNode(node36);
		node36.connectNode(node37);
		node37.connectNode(node38);
		node38.connectNode(node39);
		node39.connectNode(node41);
		node41.connectNode(node40);
		node40.connectNode(node31);
		node41.connectNode(node42);
		node43.connectNode(node44);
		node44.connectNode(node36);
		node36.connectNode(node45);
		node45.connectNode(node46);
		node46.connectNode(node22);
		node22.connectNode(node7);
		node22.connectNode(node21);
		node21.connectNode(node59);
		node59.connectNode(node60);
		node60.connectNode(node61);
		node61.connectNode(node62);
		node62.connectNode(node17);
		node17.connectNode(node16);
		node16.connectNode(node15);
		node15.connectNode(node14);
		node14.connectNode(node2);
		node14.connectNode(node13);
		node13.connectNode(node12);
		node12.connectNode(node9);
		node9.connectNode(node10);
		node10.connectNode(node11);
		node11.connectNode(node3);
		node9.connectNode(node20);
		node20.connectNode(node19);
		node19.connectNode(node18);
		node18.connectNode(node17);
		node42.connectNode(node43);
		node42.connectNode(node51);
		node51.connectNode(node52);
		node52.connectNode(node53);
		node53.connectNode(node54);
		node54.connectNode(node55);
		node55.connectNode(node47);
		node47.connectNode(node45);
		node45.connectNode(node48);
		node48.connectNode(node49);
		node49.connectNode(node50);
		node50.connectNode(node42);
		node55.connectNode(node56);
		node56.connectNode(node57);
		node57.connectNode(node58);
		node6.connectNode(node8);
		node8.connectNode(node9);
		node2.connectNode(node3);
		
		shortestPath(node14, 30);
	}
	
	/** 
	* This method is uses the search method in the Node class to get the shortest 
	* path between two nodes and displays the path to the console.
	* @param node This is the root node where the search begins from
	* @param targetID This is the the ID of the target node 
	* @return None
	*/
	public static void shortestPath(Node node, int targetID) {
		ArrayList<Node> path = node.search(new ArrayList<Node>(), targetID);
		for(Node i : path) {
			System.out.print(" -> " + i.nodeID);
		}
		System.out.println();
	}
}
