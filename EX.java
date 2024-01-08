package nit.collection.java;

public class EX {
	private int x;
	private int y;
	public EX(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getx() {
		return x;
		
	}
	
  public void setX(int x) {
	   this.x=x;
	  
  }
  public int getY() {
		return y;
		
	}
  public void setY(int Y) {
	   this.y=Y;
	  
 }
  @Override
  public String toString() {
	  return "EX("+x+","+y+")";
  }
}
