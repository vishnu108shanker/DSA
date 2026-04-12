import java.util.ArrayList;
import java.util.PriorityQueue;

class Solution {
    static int[] res ;
    static int z ;
    void rec(Node final , StringBuilder id  ){
            if(final.left== null && final.right == null ){
                  res[z] =  Integer.parseInt(id.toString()) ;
                  z++ ;
                  return ;
            }
    
            rec(final.left , id.append("0") ) ;
            rec(final.right , id.append("1") ) ;

            return ;

        }

    static class Node{
        int sum ;
        char c ;
        Node left ;
        Node right ;
        
        Node(int sum , char c ,Node left ,  Node right ){
            this.sum = sum; 
            this.c = c ;
            this.left = left ;
            this.right = right ;
        }
    }
    public ArrayList<String> huffmanCodes(String s, int f[]) {
        res = new int[f.length] ;
            z= 0 ;
        PriorityQueue<Node> q = new PriorityQueue<>((a.sum , b.sum) -> a.sum - b.sum) ;

        for(int i= 0 ; i<s.length()-1 ; i++){
            q.add(new Node(f[i],s.charAt(i) , null, null)) ;
        }

        while(q.size()!=1){
            Node a = q.poll() ;
            Node b = q.poll() ;
                int newsum = a.sum + b.sum  ;
                Node c = new Node(newsum,   null ,  a.sum>b.sum ? b:a , a.sum>b.sum ?a:b) ;
            q.add(c) ;
        }
        void rec(final , new StringBuilder id  ) ;
        return res ;

    }
}