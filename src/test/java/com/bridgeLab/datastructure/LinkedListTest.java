package com.bridgeLab.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest
{
    @Test
    void given3NumbersWhenLinkedPassesLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        LinkedList list = new LinkedList();
        list.add(myFirstNode);
        list.add(mySecondNode);
        list.add(myThirdNode);
        list.printList();
        boolean result = list.head.equals(myThirdNode) &&
                list.head.getNext().equals(mySecondNode) &&
                list.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }
    @Test
    void given3NumbersWhenAppendedPassesLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<> (56);
        MyNode<Integer> mySecondNode = new MyNode<> (30);
        MyNode<Integer> myThirdNode = new MyNode<> (70);
        LinkedList list = new LinkedList();
        list.append(myFirstNode);
        list.append(mySecondNode);
        list.append(myThirdNode);
        System.out.print("When Appended the ");
        list.printList();
        boolean result = list.head.equals(myFirstNode) &&
                list.head.getNext().equals(mySecondNode) &&
                list.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }
}
