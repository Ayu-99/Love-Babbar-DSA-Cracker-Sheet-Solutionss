class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here	
	   Node current = head;
	   while(current.next != null){
	       if(current.data == current.next.data){
	           current.next = current.next.next;
	       }else{
	           current = current.next;
	       }
	   }
	   
	   return head;
    }
}