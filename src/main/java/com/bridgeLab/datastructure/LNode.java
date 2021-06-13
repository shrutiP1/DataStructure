package com.bridgeLab.datastructure;

public interface LNode<K>
{
    K getKey();
    void setKey(K key);

    LNode<K> getNext();
    void setNext(LNode<K> next);
}
