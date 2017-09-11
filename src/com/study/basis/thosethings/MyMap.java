package com.study.basis.thosethings;

/**
 * Created by lh on 2017/9/11.
 * Map的实现其实很简单，一个key对应一个value就行
 */
public class MyMap<K, V> {

    //定义一个Node数组用来保存key,value键值对
    private Node<K, V>[] nodes;

    //逻辑长度
    private int size;

    //放入元素，如果元素key已经存在，覆盖value,否则在数组中添加key,value信息
    public void put(K key, V value) {
        if (nodes == null) {//如果数组为空，创建大小为10的数组
            nodes = new Node[10];
        }
        int index = indexOfKey(key);
        if (index != -1) {
            nodes[index].value = value;
        } else {
            nodes[size] = new Node<K, V>(key, value);
            size++;
        }
    }

    //根据key获取value值
    public V get(K key){
        int index = indexOfKey(key);
        if(index!=-1){
            return nodes[index].value;
        }
        return null;
    }

    //获取map长度
    public int size(){
        return size;
    }

    //查找该Key是否已经存在数组nodes中，如果找不到，返回-1，找到则返回数组中的下标
    private int indexOfKey(K key) {
        for (int i = 0; i < size; i++) {
            if (key.equals(this.nodes[i].key)) {
                return i;
            }
        }
        return -1;
    }

    //静态内部类,用于保存Key,Value的值
    private static class Node<K, V> {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

}
