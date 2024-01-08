package nit.collection.java;

public class customcollectionTest extends GrowableArray {
	public static void main(String[]args) {
		customcollectionTest col=new customcollectionTest();
		System.out.println("capacity:"+col.capacity());
		System.out.println("size:"+col.size());
		System.out.println("capacity"+col.capacity());
		System.out.println("eles"+col);
		col.add("a");System.out.println(col);
		col.add("b");System.out.println(col);
		col.add(5);System.out.println(col);
		col.add(null);System.out.println(col);
		col.add(new EX(5,6));System.out.println(col);
		col.add(new EX(6,6));System.out.println(col);
		col.add(5.64);System.out.println(col);
		col.add('a');System.out.println(col);
		col.add(-125);System.out.println(col);
		col.add("98");System.out.println(col);
		col.add(129);System.out.println(col);
		
		
		
		
		
		
		
	}

}
