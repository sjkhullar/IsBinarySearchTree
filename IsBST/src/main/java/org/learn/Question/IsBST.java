
package org.learn.Question;
import org.learn.PrepareTree.Node;

public class IsBST {
	public static boolean isBST(Node node) {
		return IsBST.isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	private static boolean isBST(Node node, int min, int max) {	
		if(node == null) 
			return true;
		
		if(node.data < min || node.data > max)
			return false;
		
		boolean isLeft = isBST(node.left,min,node.data);
		if(!isLeft)
			return isLeft;
		
		boolean isRight = isBST(node.right, node.data, max);
		if(!isRight)
			return isRight;
		
		return true;
	}
}
