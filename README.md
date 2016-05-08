# treeSearcher

### Goal of this Project  
  The java package generates a random binary tree with <int> as each node's value. The goal of this project is to implement search function for RC admission. There are two requirments for the search function to be finished: 1) return the node if it is found 2) return null if it is not found in the given tree.  

### How to run this package  
    1. download the whole zip file to your local path. Unzip it.  
    2. open Eclipse.  
    3. Click on "File"-->"Import"-->"Exsiting projects into workspace"-->"select root directory"
    4. Choose the folder you just unzip, then finish.
    5. run Main.java for a demo of searchNode function. A node 58 should be "found", while a node 101 should be "not found".
    6. run TreeTester.java for unit test on searchTree class.

### node.java  
  1. node.java contains class for tree node  
  @val:  
    1. <int> value for the node  
    2. <node> left for left child   
    3. <node> right for right child  
 
 @functions:  
  1. getLeft():  
    get the left child of node  
  2. getRight():  
    get the right child of node  
  3. addRight(<node>):  
    add the given node as current node's left child  
  4. addRight(<node>):   
    add the given node as current node's right child  
 

### Main.java  
  It contains Main class that should run first. The Main java creats a tree with 100 nodes. then it tests "searchNode" function with a node with value 58 and a node with value 101. 58 should be "found" while 101 should not be "found".

### searchTree.java  
  searchTree.java contains searchTree.class, this class implements functions for building a tree, search for a node in a given tree.  
  @val:  
    1. <node> head for the head of the tree  
  @functions:  
    1. searchNode(<node> cur, <node> start):  
      perform a Depth first search for given node cur based on value.  
    2. addNode(<node> cur):  
      add a node to the current tree. If current tree doesn't have a node, then the node is used as head.  
    3. DFS(<node> cur):  
      Helper method perform depth-first-search for the current tree.  
    4. printTree():  
      Use DFS to perform a pre-order traversal of the tree.  
    5. searchHash(<node>):
      This is a more general method that use hashMap to search the node. The hash map is created when the node is inserted.
    6. getHead():  
    return the head node. 

### treeTester.java  
  it tests whether the tree is robust for empty tree. It also test whether the search tree can perform the search function. This java class implements a jUnit test.
