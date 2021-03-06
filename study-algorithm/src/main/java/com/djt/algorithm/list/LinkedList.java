package com.djt.algorithm.list;

import lombok.*;

/**
 * 链表结构
 *
 * @author 　djt317@qq.com
 * @since 　 2021-04-29
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LinkedList<V extends Comparable<V>> {

    /**
     * 链表头结点
     */
    private ListNode<V> head;

    /**
     * 链表长度
     */
    private int size = 0;

    /**
     * 插入
     *
     * @param value 待插入值
     */
    public void insert(V value) {
        ListNode<V> node = new ListNode<>(value);
        if (head == null) {
            head = node;
            ++size;
            return;
        }
        ListNode<V> curNode = head;
        while (curNode.getNext() != null) {
            curNode = curNode.getNext();
        }
        curNode.setNext(node);
        ++size;
    }

    /**
     * 链表判空
     *
     * @return true-空 false-非空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 链表反转-非递归
     */
    public void reverse() {
        if (size <= 1) {
            return;
        }
        ListNode<V> newHead = null;
        ListNode<V> curNode = head;
        ListNode<V> nextNode = curNode.getNext();
        while (nextNode != null) {
            curNode.setNext(newHead);
            newHead = curNode;
            curNode = nextNode;
            nextNode = nextNode.getNext();
        }
        curNode.setNext(newHead);
        newHead = curNode;
        head = newHead;
    }

    /**
     * 链表反转-递归
     */
    public void reverse2() {
        if (size <= 1) {
            return;
        }
        head = reverse(head);
    }

    /**
     * 递归反转子链表
     *
     * @param curNode 子链表的起始节点
     * @return 反转后的链表起始节点
     */
    public ListNode<V> reverse(ListNode<V> curNode) {
        if (curNode == null || curNode.getNext() == null) {
            return curNode;
        }
        ListNode<V> nextNode = curNode.getNext();
        ListNode<V> newHead = reverse(nextNode);
        curNode.setNext(null);
        nextNode.setNext(curNode);
        return newHead;
    }

}
