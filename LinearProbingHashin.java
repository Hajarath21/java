
import java.util.*;
public class LinearProbingHashing {
	public static int[] arr;
    public static int n;
    LinearProbingHashing(int n) {
        this.n = n;
        arr = new int[this.n];
    }
    public static void insert(int element){
    	double Y = 0.618033;
    	int X = (int) (n*((element*Y)%1));
    	if(arr[X]==0) {
    		arr[X]=element;
    	}
    	else {
    		while(arr[X]!=0){       		
                if(X<n){
                	X++;
                    if(X==n){
                    	X=0;
                    }
                }
        	}
            arr[X]=element;
    	}
    }
    private static void printTable() {
        System.out.println("Hash Table = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        LinearProbingHashing hash = new LinearProbingHashing(4);
        char choice;
        do {
        	 System.out.println(" Insert element: ");
             insert(scan.nextInt());
             printTable();
             System.out.println("\nPress 'y' or 'n' to continue \n");
             choice = scan.next().charAt(0);
        } while (choice == 'n' || choice == 'y');     
    }
}