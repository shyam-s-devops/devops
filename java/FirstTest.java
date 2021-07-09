
public class FirstTest {
	
	public int getArea(int x, int y) //x and y are formal parameters
	  {
	    return x * y;
	  }

	 public static void main(String args[])
	  {
	    int length = 10, width = 5, area =0 ;
	    FirstTest demo = new FirstTest();
	    
	    //Calling a function
	    area = demo.getArea(length, width); //length and width are actual parameters
	    System.out.println("The Area is: " +area);
	  }
}
