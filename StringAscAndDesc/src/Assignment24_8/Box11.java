package Assignment24_8;

public class Box11 {
	    
	    private int width;
	    private int hight;
	    private int depth;
	    
	    
	    public Box11(int width, int hight, int depth) {
	        super();
	        this.width = width;
	        this.hight = hight;
	        this.depth = depth;
	    }
	    
	   public int volume()
	   {
	       return this.width*this.hight*this.depth;
	   }
	   
	     public static void main(String[] args) {
	        
	         Box11 b=new Box11(4, 5, 7);
	         int volume = b.volume();
	         System.out.println(volume);
	         
	    }
	    
	}
	
