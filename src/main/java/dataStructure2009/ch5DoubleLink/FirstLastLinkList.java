package dataStructure2009.ch5DoubleLink;

import dataStructure2009.ch4linkList.Node;

/*
 * 双端链表
 * 双端链表：链表中保存着对最后一个链接点引用的链表；1，2，3，4四个结点，1指向2和4；ps:1不是结点？是火车头，车厢才是结点么？

从头部进行插入：要对链表进行判断，如果为空则设置尾节点为新添加的节点；

从尾部进行插入：如果链表为空，则直接设置头节点为新添加的结点，否则设置尾节点后的一个结点为新添加的结点；

从头部进行删除：判断头结点是否有下一个结点，如果没有则设置结点为null；
 */
public class FirstLastLinkList {
    //头结点
    private Node first;
    //尾结点
    private Node last;

    public FirstLastLinkList() {
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
        }
        first = tmp.next;
        return tmp;
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
        Node previous = first;
        while(current.data != value) {
            if(current.next == null) {
                return null;
            }
            previous = current;
            current = current.next;
        }

        if(current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
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
