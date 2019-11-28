
class Node {
    int value;
    Node left;
    Node right;
 
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}

public class main {
	public static void main(String[ ] args) {
		Btree bt = new Btree();
	    bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);
	    
	    bt.BFT();
	    bt.DFS();
	    
        int[] arr={10,9,8,7,6,5,4,3,2,1,0};
        SortAlgorithm s = new SortAlgorithm();
        
        s.printArray(s.quicksort(arr,0,arr.length-1));
        s.printArray(s.bubble(arr));
        s.printArray(s.select(arr));
        s.printArray(s.heapsort(arr)); 
        
    }
}

