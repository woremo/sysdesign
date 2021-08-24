import java.lang.IndexOutOfBoundsException

data class DoubleLinkedListNode<T>(
    val prev: DoubleLinkedListNode<T>? = null
    val next: DoubleLinkedListNode<T>? = null
    val data: DoubleLinkedListNode<T>? = null
)


class DoubleLinkedList<T>{
    var head: DoubleLinkedListNode<T>?
    var tail: DoubleLinkedListNode<T>?
    var size: Int = 0

    constructor(){
        this.head = null
        this.tail = null
        size = 0
    }

    fun getElement(index:Int){

        val node = getNode(index)
        return node.data
    }

    private fun getNode(index: Int): DoubleLinkedListNode{
        if(index > this.size){
            throw IndexOutOfBoundsException
        }

        val currentNode = this.head
        val countIndex = 0

        while(True){
            if(countIndex == index){
                break
            }else{
                currentNode = currentElement.next
                countIndex++
            }

        }

        return currentNode

    }

    fun putFirst(element:T){

        val prevNode = null
        val nextNode = null

        if(size < 1){
            val node
            this.head = DoubleLinkedListNode(prev = prevNode, next =nextNode, data= element )
            this.tail = this.head
        }else{
            nextNode = this.head
            this.head = DoubleLinkedListNode(prev = prevNode, next =nextNode, data= element )

        }
        size = size + 1

    }

    fun putLast(element:T){

        val prevNode = this.tail
        val nextNode = null

        if(size < 1){
            val node
            this.tail = DoubleLinkedListNode(prev = prevNode, next =nextNode, data= element )
            this.head = this.tail
        }else{
            prevNode = this.tail
            this.tail = DoubleLinkedListNode(prev = prevNode, next =nextNode, data= element )

        }
        size = size + 1

    }

    fun putAfter(element:T, index: Int){
        if(index > this.size){
            throw IndexOutOfBoundsException
        }

        val currentNode = getNode(index)

        val prevNode = currentNode.prev
        val nextNode = currentNode.next

        val newNode = DoubleLinkedListNode(prev = currentNode, next =currentNode.next, data= element )

        currentNode.next = newNode

        size = size + 1

    }

    fun putBefore(element:T, index: Int){

        //getNode checks for out of bounds exception
        val currentNode = getNode(index)

        val prevNode = currentNode.prev
        val nextNode = currentNode.next

        val newNode = DoubleLinkedListNode(prev = currentNode.prev, next =currentNode, data= element )

        currentNode.prev = newNode

        size = size + 1

    }

    fun T display(): MutableList<T>{

        val displayDLL: MutableList<T> = mutableListOf()
        val count = 0
        val currentElement = this.head

        while(count <= 0){
            displayDLL.add(currentElement.data)
            currentElement= currentElement.next
            count++
        }

        return displayDLL

    }

    fun getSize(){
        return this.size
    }

    override fun toString(): String {
        return super.toString()
    }

    fun delete(index){

        //get node
        //unlink prev
        // set next of prev node to the next of current node
        //set previous of next node to prev of current node
        val node: DoubleLinkedListNode = getNode(index = index)
        val prevNodeOfCurrent = node.prev
        val nextNodeOfCurrent = node.next
        prevNode.next = nextNodeOfCurrent
        nextNode.prev = prevNodeOfCurrent
        node = null
        this.size = this.size - 1


    }

}

