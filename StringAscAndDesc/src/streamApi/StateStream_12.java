package streamApi;

public class StateStream_12 {

	private int stated;
	private String statename;
	
	public StateStream_12(int stated, String statename) {
		super();
		this.stated = stated;
		this.statename = statename;
	}

	public int getStated() {
		return stated;
	}

	public void setStated(int stated) {
		this.stated = stated;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	@Override
	public String toString() {
		return "StateStream [stated=" + stated + ", statename=" + statename + "]";
	}
	
	
	
}
