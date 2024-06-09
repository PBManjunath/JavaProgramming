package com.apple.programs.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsDfs {

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();

        for(int i =0 ;i<5;i++){
            adjList.add(new ArrayList<Integer>());
        }

        adjList.get(0).add(1);
        adjList.get(0).add(4);
        adjList.get(1).add(0);
        adjList.get(1).add(4);
        adjList.get(1).add(2);
        adjList.get(2).add(1);
        adjList.get(2).add(3);
        adjList.get(2).add(4);
        adjList.get(3).add(2);
        adjList.get(3).add(4);
        adjList.get(4).add(0);
        adjList.get(4).add(1);
        adjList.get(4).add(2);
        adjList.get(4).add(3);

        BfsDfs bfsDfs = new BfsDfs();
        ArrayList<Integer> list = bfsDfs.BfsOfGraph(5,adjList);
        for(Integer i : list){
            System.out.println(i);
        }

        ArrayList<Integer> list2 = bfsDfs.DfsOfGraph(5,adjList);
        System.out.println("DFS traversal");
        for(Integer i : list2){
            System.out.print(i);
        }
    }

    public ArrayList<Integer> BfsOfGraph(int v,ArrayList<ArrayList<Integer>> adjList){

        boolean[] visited = new boolean[v];
        ArrayList<Integer> vertices = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()){
            Integer node = queue.poll();
            vertices.add(node);

            for(Integer i:adjList.get(node)){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        return vertices;
    }

    public ArrayList<Integer> DfsOfGraph(int v,ArrayList<ArrayList<Integer>> adjList){

        boolean[] visited = new boolean[v];
        ArrayList<Integer> vertices = new ArrayList<>();
        dfs(0,visited,adjList,vertices);
        return vertices;
    }

    public static void dfs(int node,boolean[] vis,ArrayList<ArrayList<Integer>> adj,
                           ArrayList<Integer> ls) {
        vis[node] = true;
        ls.add(node);

        for(Integer i : adj.get(node)){
            if (vis[i]!= true){
                dfs(i,vis,adj,ls);
            }
        }
    }
}