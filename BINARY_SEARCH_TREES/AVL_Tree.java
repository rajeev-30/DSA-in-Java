// package BINARY_SEARCH_TREES;

// class node4 {
// int data;
// node4 left;
// node4 right;
// int height;

// node4(int data) {
// this.data = data;
// left = null;
// right = null;
// height = 1;
// }
// }

// public class AVL_Tree {

// public static int getHeight(node4 n) {
// if (n == null)
// return 0;
// return n.height;
// }

// public static int getBalenceFactor(node4 n) {
// if (n == null) {
// return 0;
// }
// return getHeight(n.left) - getHeight(n.right);
// }

// public static node4 rightRotate(node4 y) {
// node4 x = y.left;
// node4 t2 = x.right;

// x.right = y;
// y.left = t2;

// y.height = max(getHeight(y.right),getHeight(y.left))+1;
// x.height = max(getHeight(x.right),getHeight(x.left))+1;

// return y;

// }

// public static node4 leftRotate(node4 x) {
// node4 y = x.left;
// node4 t2 = y.right;

// y.left = x;
// x.right = t2;

// y.height = max(getHeight(y.right),getHeight(y.left))+1;
// x.height = max(getHeight(x.right),getHeight(x.left))+1;

// return x;

// }

// public static void main(String[] args) {

// }

// }
