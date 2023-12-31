# Anthill Optimization

## details
This is a program that uses a graph to model an anthill and find the shortest path between points    
Created as an interview problem to optimize an anthill.        
[click here to view code](https://github.com/carlgombert/Anthill_Optimization/tree/main/anthill_optimization/src/com/anthill_optimization/main)

## shortest path
The node data structure in the program has a built in method to find the shortest path between nodes given the root starting node and the ID of the target node.    
    
Below is the model I am using for the anthill however the model doesn't have to look like this nor does it have to be an anthill.         
![This is an image](https://github.com/carlgombert/Anthill_Optimization/blob/main/screenshots/anthill_model.jpg)    
If I wanted to find the shortest path from node 15 to node 41 I would write "shortestPath(node15, 41);" and the console would output:    
![This is an image](https://github.com/carlgombert/Anthill_Optimization/blob/main/screenshots/15_to_41_output.png)        
meaning start at node 15, travel to node 16, travel to node 17 ... travel to node 41.        
This shortest path algorithm assumes that all nodes on this model are an equal distance from each other and will only return one path if multiple are the same distance.        
Visualized on the model, the consoles output from Node 15 to 41 would look like:        
![This is an image](https://github.com/carlgombert/Anthill_Optimization/blob/main/screenshots/shortest_path_15_to_41.png) 
