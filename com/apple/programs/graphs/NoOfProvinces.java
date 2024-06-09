package com.apple.programs.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NoOfProvinces {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer> >();

        adj.add(new ArrayList<Integer>());
        adj.get(0).add(0, 1);
        adj.get(0).add(1, 0);
        adj.get(0).add(2, 1);
        adj.add(new ArrayList<Integer>());
        adj.get(1).add(0, 0);
        adj.get(1).add(1, 1);
        adj.get(1).add(2, 0);
        adj.add(new ArrayList<Integer>());
        adj.get(2).add(0, 1);
        adj.get(2).add(1, 0);
        adj.get(2).add(2, 1);

        NoOfProvinces noOfProvinces = new NoOfProvinces();
        int provinces = noOfProvinces.numProvinces(adj);
        System.out.println(provinces);
    }


    public static int numProvinces(ArrayList<ArrayList<Integer>> adj){

        //converting to list from matrix
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();

        for(int i = 0;i<adj.size();i++){
            adjList.add(new ArrayList<>());
        }

        for(int i = 0;i<adj.size();i++){
            for (int j =0;j<adj.size();j++){
                if(adj.get(i).get(j) == 1 && i!=j){
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        int count = 0;
        int vertices = adj.size();
        boolean[] visited = new boolean[vertices];
        for(int i =0;i<vertices;i++)
            if (visited[i] != true) {
                count++;
                bfs(adjList, visited, i);
            }
        return count;
    }

    public static void bfs(ArrayList<ArrayList<Integer>> adjlist,boolean[] vis,int node){

        vis[node] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()){
            Integer i = q.poll();
            for(Integer l : adjlist.get(i)) {
                if (vis[l] != true) {
                    q.add(l);
                    vis[l] = true;
                }
            }
        }
    }

}
