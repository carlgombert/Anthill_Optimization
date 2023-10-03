package com.anthill_optimization.main;

import java.util.ArrayList;
import java.util.HashSet;
/**
 * The Node class is used to create a graph data structure with a built in method
 * to find the shortest path between two vertices
 */
public class Node {
	//hashset connected contains a set of nodes that are connected to this node
	HashSet<Node> connected = new HashSet<>();
	//int nodeID contains an ID to keep track of each node
	int nodeID;
	
	public Node(int nodeID) {
		this.nodeID = nodeID;
	}
	
	/** 
    * This method is used to create a connection(edge) between two nodes(vertices)
    * @param node This is the node being connected to the current node 
    * @return returns a string with a result of the connection attempt
    */
	public String connectNode(Node node) {
		if(node.equals(this)) {
			return "cannot connect node to itself";
		}
		else if(!connected.contains(node)) {
			connected.add(node);
			node.connectNode(this);
			return "added";
		}
		return "already exists";
	}
	
	/** 
    * This method is used to find the shortest path from a starting node to a target
    * node and return each node in the path. When the target node is reached it
    * returns the path that was taken to reach that target node. as the path is being
    * returned it is compared to other paths to the target node and only the shortest
    * path is kept.
    * @param path This is a list of all the nodes traveled through to reach the current node
    * @param seachID This is the nodeID of the target node
    * @return returns an arraylist of the shortest path to reach the target from this point
    */
	public ArrayList<Node> search(ArrayList<Node> path, int searchID) {
		path.add(this);
		if(searchID == this.nodeID) {
			//current node is the target
			return(path);
		}
		ArrayList<Node> shortestPath = null;
		for(Node node : connected) {
			if(path.contains(node) == false) {
				/*a path can only travel in one direction, it should never loop on itself, this
				makes sure that a node isn't searched that has already existed in the path.*/
				ArrayList<Node> tempPath = node.search((ArrayList<Node>) path.clone(), searchID);
				if(tempPath != null) {
					//checking to see that the path reached the target
					if(shortestPath == null) {
						//if there isn't yet a shortest path
						shortestPath = tempPath;
					}
					else if(shortestPath.size() > tempPath.size()) {
						//if the current path is shorter than the shortest path
						shortestPath = tempPath;
					}
				}
			}
		}
		//returns shortest path from this position to the target. If no path is possible, returns null
		return shortestPath;
	}

}
