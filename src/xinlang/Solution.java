package xinlang;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Solution<k,v>extends LinkedHashMap<Integer, Integer> {
	private int capacity;
	private final Lock lock=new ReentrantLock();
    public Solution(int capacity) {
    	super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    public int get(int key) {
        try {
        	lock.lock();
        	return (int) super.get(key);
        	
        }finally {
        	lock.unlock();
        }
    }

    public int put(int key, int value) {
    	try {
        	lock.lock();
        	return  super.put(key,value);
        	
        }finally {
        	lock.unlock();
        }
    }
}