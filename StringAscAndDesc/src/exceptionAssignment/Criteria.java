package exceptionAssignment;

public class Criteria {

	private String processor;
	private String ram;
	private String ssd;
	private String hdd;
	
	public Criteria(String processor, String ram, String ssd, String hdd) {
		super();
		this.processor = processor;
		this.ram = ram;
		this.ssd = ssd;
		this.hdd = hdd;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getSsd() {
		return ssd;
	}

	public void setSsd(String ssd) {
		this.ssd = ssd;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	@Override
	public String toString() {
		return "Criteria [processor=" + processor + ", ram=" + ram + ", ssd=" + ssd + ", hdd=" + hdd + "]";
	}
	
	
	
}
