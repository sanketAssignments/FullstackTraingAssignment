package stringAssignment;

public class DemoGarbage7 {

		   String st;

		   public DemoGarbage7(String st) {
		        super();
		        this.st = st;
		    }
		   @Override
		    protected void finalize() throws Throwable {
		       
		        super.finalize();
		        System.out.println("Garbage collected");
		    }

		   public static void main(String[] args) {

		       DemoGarbage7 gc = new DemoGarbage7("reference");
		        gc = null;
		        System.gc();



		   }



		}

