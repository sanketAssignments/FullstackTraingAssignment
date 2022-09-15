package Assignment24_8;

public class Patient12 {
	    
	    private String patientName;
	    private double height;
	    private double weight;
	    
	    public Patient12(String patientName, double height, double weight) {
	        super();
	        this.patientName = patientName;
	        this.height = height;
	        this.weight = weight;
	    }
	    
	    public double computeBMI()
	    {
	        return this.weight/(this.height*this.height);
	    }
	    
	    
	    public static void main(String[] args) {
	        
	        Patient12 p=new Patient12("Shubham", 5.8, 75);
	        
	        double computeBMI = p.computeBMI();
	        System.out.println(computeBMI);
	        
	    }



	}

