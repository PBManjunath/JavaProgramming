package com.apple.programs.graphs;


// Adjacency Matrix representation in Java
public class AdjacencyMatrix {
    private int adjacencyMatrix[][];
    private int numVertices;

    public AdjacencyMatrix(int numVertices) {
        adjacencyMatrix = new int[numVertices][numVertices];
        this.numVertices = numVertices;
    }

    public void addEdge(int i,int j){
        adjacencyMatrix[i][j] = 1 ;
        adjacencyMatrix[j][i] = 1 ;
    }

    public void removeEdge(int i,int j){
        adjacencyMatrix[i][j] = 0 ;
        adjacencyMatrix[j][i] = 0 ;
    }

    public void printAdjMatrix(){

    }


    public static void main(String[] args){


    }

}
