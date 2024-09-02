import java.util.Stack;

public class BinaryTree {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    void iterativePreorder(Node node) {
        if (node == null)
            return;

        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node currNode = stack.pop();
            System.out.print(currNode.data + " ");

            if (currNode.right != null)
                stack.push(currNode.right);
            if (currNode.left != null)
                stack.push(currNode.left);
        }
    }

    void iterativeInorder(Node node) {
        if (node == null)
            return;

        Stack<Node> stack = new Stack<Node>();
        Node currNode = node;

        while (currNode != null || stack.size() > 0) {
            while (currNode != null) {
                stack.push(currNode);
                currNode = currNode.left;
            }

            currNode = stack.pop();
            System.out.print(currNode.data + " ");

            currNode = currNode.right;
        }
    }

    void iterativePostorder(Node node) {
        if (node == null)
            return;

        Stack<Node> stack1 = new Stack<Node>();
        Stack<Node> stack2 = new Stack<Node>();
        stack1.push(node);

        while (!stack1.isEmpty()) {
            Node currNode = stack1.pop();
            stack2.push(currNode);

            if (currNode.left != null)
                stack1.push(currNode.left);
            if (currNode.right != null)
                stack1.push(currNode.right);
        }

        while (!stack2.isEmpty()) {
            Node currNode = stack2.pop();
            System.out.print(currNode.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Pre-order traversal without recursion: ");
        tree.iterativePreorder(tree.root);
        System.out.println();

        System.out.print("In-order traversal without recursion: ");
        tree.iterativeInorder(tree.root);
        System.out.println();

        System.out.print("Post-order traversal without recursion: ");
        tree.iterativePostorder(tree.root);
        System.out.println();
    }
}
