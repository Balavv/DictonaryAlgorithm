package com.algorithm;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Dictionary<K, V> {

	private List<Entry<K, V>> set;

	public Dictionary() {
		this.set = new LinkedList<Entry<K, V>>();
	}

	/**
	 * find(k): if the dictionary has an entry with key k, returns it, else, returns
	 * null
	 */
	public Entry<K, V> find(K key) {

		return set.stream().filter(e -> e.key().equals(key)).findFirst().orElse(null);

	}

	/**
	 * insert(k, o): inserts and returns the entry (k, o)
	 */
	public Entry<K, V> insert(K key, V value) {
		Entry<K, V> obj = new Entry<K, V>(key, value);
		set.add(obj);
		return obj;
	}

	/**
	 * remove(e): remove the entry e from the dictionary
	 */
	public boolean remove(K key) {
		return set.removeIf(e -> e.key().equals(key));
	}

	public int size() {
		return set.size();
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public String toString() {
		return set.toString();
	}
}
