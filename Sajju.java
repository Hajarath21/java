import java.util.Iterator;
import java.util.LinkedList;

class BFS
{
    private int V;
    private LinkedList<Integer> adj[];
 
    BFS(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
 
    void BFS(int s)
    {
        boolean visited[] = new boolean[V];
 
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        visited[s]=true;
        queue.add(s);
 
        while (queue.size() != 0)
        {
            s = queue.poll();
            int numb = s+65;
            System.out.print((char)numb+" ");
 
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
 
    public static void main(String args[])
    {
        BFS g = new BFS(8);
        
        // A B C D E F G H 
        // 0 1 2 3 4 5 6 7 
        // replacing the nodes with corresponding digits
        g.addEdge(0, 1);
        g.addEdge(7, 1);
        g.addEdge(6, 7);
        g.addEdge(6, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 6);
        g.addEdge(3, 2);
        g.addEdge(7, 2);
        g.addEdge(3, 5);
 
        System.out.println("Following is Breadth First Traversal "+"(starting from vertex A)");
 
        g.BFS(0);
    }
}