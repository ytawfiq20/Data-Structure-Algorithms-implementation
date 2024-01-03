package com.BinaryTree;

public class BinaryTree {

    public Node generateNode(int value) {
        Node newNode = new Node(value);
        return newNode;
    }
/*
 * 
 * insert element to tree
 * 
 */
    public void add(Node startNode, Node newNode) {
        if (startNode == null) {
            startNode = newNode;
            return;
        }
        if (startNode.getValue() > newNode.getValue()) {
            if (startNode.getLeftNode() == null) {
                startNode.setLeftNode(newNode);
                return;
            }
            add(startNode.getLeftNode(), newNode);
        }
        if (startNode.getValue() < newNode.getValue()) {
            if (startNode.getRightNode() == null) {
                startNode.setRightNode(newNode);
                return;
            }
            add(startNode.getRightNode(), newNode);
        }
    }
/*
 * 
 * search for element in tree
 * 
 */
    public int search(int value, Node startNode) {
        if (startNode == null) {
            return -1;
        }
        else if (value == startNode.getValue()) {
            return value;
        }
        else if (value > startNode.getValue()) {
            return search(value, startNode.getRightNode());
        }
        return search(value, startNode.getLeftNode());
    }
/*
 * 
 * print tree
 * 
 */
////////////preorder traversal
    public void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.getValue()+"\t");
        preorder(root.getLeftNode());
        preorder(root.getRightNode());
    }
////////////inorder traversal
    public void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.getLeftNode());
        System.out.print(root.getValue()+"\t");
        inorder(root.getRightNode());
    }
////////////postorder traversal
    public void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.getLeftNode());
        postorder(root.getRightNode());
        System.out.print(root.getValue()+"\t");
    }
/*
 * 
 * get minium value
 * 
 */
    public Node getMinValue(Node root){
        if(root==null){
            return null;
        }
        else if(root.getLeftNode()==null){
            return root;
        }
        return getMinValue(root.getLeftNode());
    }
/*
 * 
 * get maxium value
 * 
 */
    public int getMaxValue(Node root){
        if(root==null){
            return -1;
        }
        else if(root.getRightNode()==null){
            return root.getValue();
        }
        return getMaxValue(root.getRightNode());
    }
/*
 * 
 * get tree height
 * 
 */
    public int getMax(int a, int b){
        return a > b ? a : b;
    }
    public int getTreeHeight(Node root){
        int leftHeight = 0;
        int rightHeight = 0;
        if(root == null){
            return getMax(leftHeight, rightHeight);
        }
        while(root.getLeftNode()!=null){
            leftHeight++;
            root = root.getLeftNode();
        }
        while(root.getRightNode()!=null){
            rightHeight++;
            root = root.getRightNode();
        }
        return getMax(leftHeight, rightHeight);
    }
/*
 * 
 * Delete item
 * 
 */
     public Node delete(Node root, int target){
        
        int find = search(target, root);
        if(find==-1){
            return null;
        } 
        else{
            if(root==null){
                return null;
            }
            else if(root.getValue()>target){
                root.setLeftNode(delete(root.getLeftNode(), target));
            }
            else if(root.getValue()<target){
                root.setRightNode(delete(root.getRightNode(), target));
            }
            else{
                if(root.getLeftNode()==null&&root.getRightNode()==null){
                    root = null;
                    return root;
                }
                else if(root.getLeftNode()==null){
                    root = root.getRightNode();
                    return root;
                }
                else if(root.getRightNode()==null){
                    root = root.getLeftNode();
                    return root;
                }
                else{
                    root.setValue(getMinValue(root.getRightNode()).getValue());
                    root.setRightNode(delete(root.getRightNode(), root.getValue()));
                }
            }
        }
        return root;

    }
    
}
