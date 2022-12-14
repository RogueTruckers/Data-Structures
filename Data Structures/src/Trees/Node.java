package Trees;

/**
 *
 * @author s31011
 * @version 8-22-18
 */
public class Node {
    Node left, right;
    int data;
    
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
    
    public void insert(int value){
        if(value <= data){
            if(left == null){
                left = new Node(value);
            }else{
                left.insert(value);
            }
        }else{
            if(right == null){
                right = new Node(value);
            }else{
                right.insert(value);
            }
        }
    }
    
    public boolean contains(int value){
        if(value == data){
            return true;
        }else if( value < data) {
            if(left == null){
                return false;
            }else{
                return left.contains(value);
            }
        }else{
            if(right == null){
                return false;
            }else{
                return right.contains(value);
            }
        }
    }
    
    public void printInOrder(){
        if(left != null){
            left.printInOrder();
        }
        System.out.println(data);
        if(right != null){
            right.printInOrder();
        }
    }
}
