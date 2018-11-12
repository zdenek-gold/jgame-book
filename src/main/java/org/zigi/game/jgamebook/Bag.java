package org.zigi.game.jgamebook;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Bag implements Collection<IBagItem> {
	public static int DEFAULT_CAPACITY = 8;
	private int capacity = DEFAULT_CAPACITY;
	private List<IBagItem> items = new ArrayList<IBagItem>();

	private Bag(int capacity) {
		this.capacity = capacity;
	}

	public static Bag getInstance() {
		return new Bag(DEFAULT_CAPACITY);
	}

	public boolean add(IBagItem e) {
		if (items.size() < capacity)
			return items.add(e);
		return false;
	}

	public boolean addAll(Collection<? extends IBagItem> c) {
		if (c == null)
			return false;
		for (IBagItem i : c)
			if (items.size() >= capacity)
				return false;
			else
				items.add(i);
		return true;
	}

	public void clear() {
		items.clear();
	}

	public boolean contains(Object o) {
		return items.contains(o);
	}

	public boolean containsAll(Collection<?> c) {
		return items.containsAll(c);
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}

	public Iterator<IBagItem> iterator() {
		return items.iterator();
	}

	public boolean remove(Object o) {
		return items.remove(o);
	}

	public boolean removeAll(Collection<?> c) {
		return items.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return items.retainAll(c);
	}

	public int size() {
		return items.size();
	}

	public Object[] toArray() {
		return items.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return items.toArray(a);
	}

	public int getCapacity() {
		return capacity;
	}

}
