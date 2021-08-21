public class BinaryTree_test{
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.insert("Deep Learning");
    tree.insert("SQL Server and MySQL");
    tree.insert("Machine Learning");
    tree.insert("Python");
    tree.insert("Java");
    tree.insert("Linux");
    System.out.print("Preorder: ");
    tree.preorder();
    System.out.print("\n\nInorder: ");
    tree.inorder();
    System.out.print("\n\nPostorder: ");
    tree.postorder();
    System.out.print("\n");
  }
}