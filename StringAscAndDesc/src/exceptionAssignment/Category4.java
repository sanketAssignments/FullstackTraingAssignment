package exceptionAssignment;

public class Category4 {

	private int catid;
	private String categoryName;
	
	public Category4(int catid, String categoryName) {
		super();
		this.catid = catid;
		this.categoryName = categoryName;
	}

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Category [catid=" + catid + ", categoryName=" + categoryName + "]";
	}
	
	
}
