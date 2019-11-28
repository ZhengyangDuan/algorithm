import java.util.*;
public class Btree {
	Node root;
	private Node addRecursive(Node current, int value) {
	    if (current == null) {
	        return new Node(value);
	    }
	 
	    if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }
	 
	    return current;
	}
	
	public void add(int value) {
	    root = addRecursive(root, value);
	}
	public void BFT() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		Set<Node> seen = new HashSet<Node>();
		
		while (q.size()>0) {
			Node temp = q.remove();
			if(!seen.contains(temp.left)&&temp.left!=null) {
				q.add(temp.left);
				seen.add(temp.left);
			}
			if(!seen.contains(temp.right)&&temp.right!=null) {
				q.add(temp.right);
				seen.add(temp.right);
			}
			System.out.println(Integer.toString(temp.value));
		}
		
		
	}
	
	public void DFS() {
		Stack<Node> s = new Stack<Node>();
		s.add(root);
		
		Set<Node> seen = new HashSet<Node>();
		
		while (s.size()>0) {
			Node temp =  s.pop(); 
			if(!seen.contains(temp.left)&&temp.left!=null) {
				s.add(temp.left);
				seen.add(temp.left);
			}
			if(!seen.contains(temp.right)&&temp.right!=null) {
				s.add(temp.right);
				seen.add(temp.right);
			}
			System.out.println(Integer.toString(temp.value));
		}
	}

}
