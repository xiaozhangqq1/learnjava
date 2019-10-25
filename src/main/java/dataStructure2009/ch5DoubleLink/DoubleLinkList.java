package dataStructure2009.ch5DoubleLink;


/*
 * 双向链表
 * 双向链表：每个结点除了保存了对下一个结点的引用，同时还保存对前一个结点的引用；

从头部进行插入：要对链表进行判断，如果为空则设置尾节点为新添加的结点。如果不为空，还需要设置头结点的前一个结点为新添加的结点；

从尾部进行插入：如果链表为空，则直接设置头结点为新添加的结点，否则设置尾节点的后一个结点为新添加结点。同时设置新添加的结点的前一个结点为尾节点；

从头部进行删除：判断头结点是否有下一个结点，如果没有则设置为节点为null。否则设置头结点的下一个结点的previous为null；

从尾部进行删除：如果头结点后没有其他结点，则设置尾节点为null。否则设置尾节点的前一个结点的next为null。设置尾节点为其前一个结点；

删除方法：不需要再使用一个临时的指针域；
 */
public class DoubleLinkList {
    //头结点
    private Node first;
    //尾结点
    private Node last;

    public DoubleLinkList() {
        first = null;
        last = null;
    }

    /**
     * 插入一个结点，在头结点后进行插入
     */
    public void insertFirst(long value) {
        Node node = new Node(value);
        if(isEmpty()) {
            last = node;
        } else {
            first.previous = node;
        }
        node.next = first;
        first = node;
    }

    /**
     * 插入一个结点，从尾结点进行插入
     */
    public void insertLast(long value) {
        Node node = new Node(value);
        if(isEmpty()) {
            first = node;
        } else {
            last.next = node;
            node.previous = last;
        }
        last = node;
    }

    /**
     * 删除一个结点，在头结点后进行删除
     */
    public Node deleteFirst() {
        Node tmp = first;
        if(first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = tmp.next;
        return tmp;
    }

    /**
     * 删除结点，从尾部进行删除
     */
    public Node deleteLast() {
        Node tmp = last;
        if(first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return last;
    }

    /**
     * 显示方法
     */
    public void display() {
        Node current = first;
        while(current != null) {
            current.display();
            current = current.next;
        }
        System.out.println();
    }

    /**
     * 查找方法
     */
    public Node find(long value) {
        Node current = first;
        while(current.data != value) {
            if(current.next == null) {
                return null;
            }
            current = current.next;
        }
        return current;
    }

    /**
     * 删除方法，根据数据域来进行删除
     */
    public Node delete(long value) {
        Node current = first;
        while(current.data != value) {
            if(current.next == null) {
                return null;
            }
            current = current.next;
        }

        if(current == first) {
            first = first.next;
        } else {
            current.previous.next = current.next;
        }
        return current;

    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty() {
        return (first == null);
    }
}
