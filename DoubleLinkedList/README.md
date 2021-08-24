Notes on Doubly Linked Lists

A Doubly Linked List (DLL) is a data structure made up of nodes that are linked to each other through references. 
where by each node has 3 things:
 - A reference to the previous node
 - A reference to the next node
 - The data element it stores
 
 ![DoubleLinkedList Illustration](`https://images.app.goo.gl/52RHbhTJf7pfh5ih7`)
 

The references used in a DLL allow the elements to be stored in noncontiguous memmory slots. 
This is unlike an array where the data elements have to be stored in contiguous memory slots 

Space Time Analysis 

add at beginning/end is O(1)

read O(n)

delete at beginning/end is O(1)
 
search O(n)