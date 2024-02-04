package lesson_1;

import java.util.ArrayList;

public class Learning_List_Collection {

	public static void main(String[] args) {
		
		listInterface();

	}
	
	
	public static void listInterface() {
		/*List is child of collection
		 * Insertion order preserved
		 * duplicates allowed
		 * classes implemented List is arrayList LinkedList, Vector and stack
		 */
		
		/* These methods are availabe in collection
		 * add( object o)
		 * addAll(collection c)
		 * remove(object o)
		 * removeAll(collection c)
		 * retainAll(coll c)
		 * clear()
		 * isEmpty()
		 * size()
		 * contains(object o)
		 * containsAll(Collection c)
		 * toArray(collection c)-- return object array
		 
	List - Methods available are
		 * add(index, object)
		 * addAll(index, collection c)
		 * remove(index)
		 * get(index)
		 * set(index,new object)
		 */
		
		ArrayList al = new ArrayList();
		ArrayList <Integer> a = new ArrayList();
		a.add(10);
		
		a.add(25);
		a.add(555);
		a.add(15);
		a.add(253);
		a.add(25);
		
		System.out.println(a);
	}
	

}
