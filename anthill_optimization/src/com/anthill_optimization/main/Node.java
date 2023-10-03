package com.anthill_optimization.main;

import java.util.ArrayList;
import java.util.HashSet;

public class Node {
	HashSet<Node> connected = new HashSet<>();
	int nodeID;
	
	public Node(int nodeID) {
		this.nodeID = nodeID;
	}
	
	public String connectNode(Node node) {
		if(!connected.contains(node)) {
			connected.add(node);
			node.connectNode(this);
			return "added";
		}
		else if(node.equals(this)) {
			return "cannot connect node to itself";
		}
		return "already exist";
	}
	
	public ArrayList<Node> search(ArrayList<Node> path, int searchID) {
		path.add(this);
		if(searchID == this.nodeID) {
			return(path);
		}
		ArrayList<Node> shortestPath = null;
		for(Node node : connected) {
			if(path.contains(node) == false) {
				ArrayList<Node> tempPath = node.search((ArrayList<Node>) path.clone(), searchID);
				if(tempPath != null) {
					if(shortestPath == null) {
						shortestPath = tempPath;
					}
					else if(shortestPath.size() > tempPath.size()) {
						shortestPath = tempPath;
					}
				}
			}
		}
		return shortestPath;
	}

}
