package exceptionAssignment;

public class ItemBought4 {

	private int itemid;
	private int itemqty;

	public ItemBought4(int itemid, int itemqty) {
		super();
		this.itemid = itemid;
		this.itemqty = itemqty;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public int getItemqty() {
		return itemqty;
	}

	public void setItemqty(int itemqty) {
		this.itemqty = itemqty;
	}

	@Override
	public String toString() {
		return "ItemBought [itemid=" + itemid + ", itemqty=" + itemqty + "]";
	}

}
