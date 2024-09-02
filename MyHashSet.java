package DS.LAB21bce9468;

import java.util.ArrayList;

class MyHashSet {

    ArrayList<ArrayList<Integer>> hashtable;
    static int hashsize;
    int size;
    
    public MyHashSet() {
        hashsize =  5;
        size = 0;
        hashtable =  new ArrayList<>();
        for(int i=0;i<hashsize;i++){
            hashtable.add(null);
        }                
    }
    public static double hashmul(int key ){
        double hkey = Math.floor(hashsize*((key*0.618033)%1));
        return hkey;
    }
    private int getBucketIndex(int key){
        return (int)hashmul(key);
    }
    
    private double loadFactor(){
        return 1.0*size/hashsize;
    }
    private void rehash(){ 
        ArrayList<ArrayList<Integer>> temp =  hashtable;
        hashtable =  new ArrayList<>();
        hashsize= nextPrime(hashsize*2);
        for(int i=0;i<hashsize;i++){
           hashtable.add(null);
        }
        size = 0;
        for(int i=0;i<temp.size();i++ ){
            ArrayList<Integer> li =  temp.get(i);
            if(li!=null){
                for(int ele :li){
                    add(ele);
                }
            }
        }
    }
    static int nextPrime(int N)
        {
            if (N <= 1)
                return 2;
         
            int prime = N;
            boolean found = false;
            while (!found)
            {
                prime++;
                if (isPrime(prime))
                    found = true;
            }
            return prime;
        }
        static boolean isPrime(int n)
        {
            if (n <= 1) return false;
            if (n <= 3) return true;
            if (n % 2 == 0 || n % 3 == 0) return false;
            for (int i = 5; i * i <= n; i = i + 6)
                if (n % i == 0 || n % (i + 2) == 0)
                return false;
             
            return true;
        }
    public  void linearProb(int index, int key ) {
        ArrayList<Integer> li =  hashtable.get(index);
        while(li!=null){
            index = (index + 1) % hashsize;
        }
        hashtable.set( index, li ); 
    }
    public  void add(int key) {
        double load  =  loadFactor();
        if(load > 0.7){
            rehash();
        }
        int index =  getBucketIndex(key);
        ArrayList<Integer> li =  hashtable.get(index);
        if(li==null){
            li =  new ArrayList<>();
            hashtable.set( index, li );                        
        }
        else{
         linearProb(index, key);
        }
        for(int i=0;i<li.size();i++ ){
            if(li.get(i)==key ){
                return;
           }
        }
        size++;
        li.add(key);    
    }
    public void displayMul(){
        System.out.println("\n HashTable : ");
        System.out.println(hashtable);
    }
    
}
public class LinearProbingHashing {

    static MyHashSet rh = new MyHashSet();

    public static void main(String[] args) {
        rh.add(10);
        rh.add(20);
        rh.add(30);
        rh.add(40);
        rh.add(50);
        rh.add(60);
        rh.add(70);
        rh.displayMul();
        System.out.println("The new hashsize is : "+MyHashSet.hashsize);
        
    }

}