import java.util.*;

public class buildTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node BuildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }

            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data);
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;

    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;

    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);
        int selfDiam = (leftHt + rightHt) + 1;
        return Math.max(Math.max(rightDiam, leftDiam), selfDiam);
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info Diam2(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = Diam2(root.left);
        Info rightInfo = Diam2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static boolean isIdentical(Node root, Node subroot) {
        if (root == null && subroot == null) {
            return true;
        }

        if (root == null || subroot == null || root.data != subroot.data) {
            return false;
        }

        if (!isIdentical(root.left, subroot.left)) {
            return false;
        }

        if (!isIdentical(root.right, subroot.right)) {
            return false;
        }

        return true;
    }

    public static boolean isSubtree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }

        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static class Info2 {
        Node node;
        int hd;

        public Info2(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {

        Queue<Info2> q = new LinkedList<>();

        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info2(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info2 curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Info2(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {
                    q.add(new Info2(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data);
        }
    }

    public static void KLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data);
            return;
        }

        KLevel(root.left, level + 1, k);
        KLevel(root.right, level + 1, k);
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static Node LCA(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        return path1.get(i - 1);
    }

    public static Node LCA2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLCA = LCA2(root.left, n1, n2);
        Node rightLCA = LCA2(root.right, n1, n2);

        if (rightLCA == null) {
            return leftLCA;
        }
        if (leftLCA == null) {
            return rightLCA;
        }

        return root;
    }

    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }
    }

    public static int minDist(Node root, int n1, int n2) {
        Node lca = LCA2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1 + dist2;
    }

    public static int kAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftDist = kAncestor(root.left, n, k);
        int rightDist = kAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        if (max + 1 == k) {
            System.out.print(root.data);
        }
        return max + 1;
    }

    public static int transform(Node root) {
        if (root == null) {
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = leftChild + newLeft + rightChild + newRight;
        return data;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        int nodes2[] = { 2, 4, -1, -1, 5, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        // tree.levelOrder(root);

        BinaryTree.idx = -1;

        BinaryTree tree2 = new BinaryTree();
        Node root2 = tree2.BuildTree(nodes2);
        // tree2.levelOrder(root2);

        // System.out.println(isSubtree(root, root2));
        // topView(root2);

        // KLevel(root,1,3);
        // System.out.println(LCA2(root, 4, 5).data);
        // System.err.println(minDist(root, 4, 6));
        // kAncestor(root, 5, 1);
        // System.out.print(transform(root));
        transform(root);
        tree.preOrder(root);

    }
}
