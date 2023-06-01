package may;


import java.util.HashMap;


public class Ex146LRUCache {
	
     Node head;
     Node tail;
     HashMap<Integer, Node> cacheMap ;
     int capacity;
	 public Ex146LRUCache(int capacity) {
	      this.capacity = capacity;
	      this.head = new Node(-1,-1);
	      this.tail = new Node(-1,-1);
	      tail.prev = head;
	      head.next = tail;
	      this.cacheMap = new HashMap<>();
	    }

	 class Node{
		 int key,value;
		 Node next,prev;
		 
		 public Node(int key,int value) {
		   this.key = key;
		   this.value = value;
		}
	 }
	    
	 public int get(int key) {
		 
		 if (!cacheMap.containsKey(key)) {
			return -1;
		}
		 Node current = cacheMap.get(key);
         current.prev.next = current.next;
         current.next.prev = current.prev;
         moveToTail(current);
		 
         return cacheMap.get(key).value;
	        
	    }
	    
	 public void put(int key, int value) {
	        if (get(key)!=-1) {
	        	//value will be changed in Linked List Node also
			    cacheMap.get(key).value = value;	
			    return;
			}
	        if (cacheMap.size() == capacity) {
			    cacheMap.remove(head.next.key);
			    head.next = head.next.next;
			    head.next.prev = head;
			    
			}
	        
	        Node current = new Node(key, value);
	        cacheMap.put(key, current);
	        moveToTail(current);
	        
	    }

	private void moveToTail(Node current) {
		
		current.next = tail;
		tail.prev.next = current;
		current.prev = tail.prev;
		tail.prev = current;
	
	}
	
	
    public void display() {
		
    	Node current  = head;
    	
    	while(current!=null) {
    		System.out.print(current.value+" ");
    		current = current.next;
    	}
    	System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		Ex146LRUCache l = new Ex146LRUCache(3);
		
		l.put(1, 5);
		l.put(2, 7);
		l.put(3, 8);
		l.put(2, 9);
		
		l.display();
		
	}
}
