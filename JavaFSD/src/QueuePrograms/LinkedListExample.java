package QueuePrograms;

import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListExample {
	
	 
		 public static void main(String[] args) { 
			 
		     Queue<Book> queue=new PriorityQueue<Book>();
		     
		     
		     //Creating Books  
		     Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
		     Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
		     Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4); 
		     
		     //Adding Books to the queue  
		     queue.add(b1);  
		     queue.add(b2);  
		     queue.add(b3);  
		     
		     //Traversing queue elements 
		     System.out.println("Traversing the queue elements:\n");  
		     
		     for(Book b:queue){  
		    	 System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		     }  
		     
		     //removing element from queue
		     queue.remove();  
		     System.out.println("\n\nAfter removing one book record:");  
		     for(Book b:queue){  
		         System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		         }  
		 }  


}
