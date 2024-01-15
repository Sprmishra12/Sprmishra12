package nit.collection.java;

public class ToStringColection {
	private Object[] elementData;
	private int elementCount;
	@SuppressWarnings("unused")
	private Object Stringbuilder;
	public ToStringColection(){
		elementData=new Object[10];
	}
	public void add(Object obj) {
		if (size()==capacity()) {
			increaseCapacity();
		}
		elementData[elementCount]=obj ;
		     elementCount++;
	}
		private void increaseCapacity() {
			Object[] nextArray=new Object[capacity()*2];
			for(int i=0;i<elementData.length;i++) {
				nextArray[i]=elementData[i];
		}
			elementData=nextArray;
			
		}
		public int capacity() {
			return elementData.length;
			
		}
		public int size() {
			return elementCount;
		}
		@override
		public String toString() {
			if(elementCount==0)
			return  "[]";
			StringBuilder sb=new StringBuilder();
			sb.append("[");
			for(int i=0;i< elementData.length;i++) {//copying elemenet datafrom collection object
				sb.append(elementData[i]);
				//Stringbuilder object for for printing object data
				sb.append(",");
		   
		}
			int index=sb.lastIndexOf(",");
			//for finding last space 
			sb.delete(index, index+2);
			//removing last space 
			sb.append("[");
			return sb.toString();
			//for converting stringbuilder object to string object
		}
	




}
