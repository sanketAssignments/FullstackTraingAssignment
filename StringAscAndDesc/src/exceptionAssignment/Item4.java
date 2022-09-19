package exceptionAssignment;

import java.util.Scanner;

public class Item4 {

	private String itemname;
    private int itemprice;
    private static int maxitembrought=9;
    private ItemBought4 itemb;
    public String getItemname() {
        return itemname;
    }
    public void setItemname(String itemname) {
        this.itemname = itemname;
    }
    public int getItemprice() {
        return itemprice;
    }
    public void setItemprice(int itemprice) {
        this.itemprice = itemprice;
    }
    
    public ItemBought4 getItemb() {
        return itemb;
    }
    public void setItemb(ItemBought4 itemb) {
        this.itemb = itemb;
    }
    
    public Item4(String itemname, int itemprice, ItemBought4 itemb) {
        super();
        this.itemname = itemname;
        this.itemprice = itemprice;
        this.itemb = itemb;
    }
    
    
    @Override
    public String toString() {
        return "Item [itemname=" + itemname + ", itemprice=" + itemprice + ", maxitembrought=" + maxitembrought
                + ", itemb=" + itemb + "]";
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        Item4[] it = new Item4[2];
        int bill=0;int flag=0;
        for(int i=0;i<2;i++) {
    
            
            System.out.println("Enter item "+i +"id");
            int itemid=sc.nextInt();
            
            
            System.out.println("Enter item quantity");
            int itemqunty=sc.nextInt();



           try {
                if(itemqunty>maxitembrought) {
                    throw new ItemPurches4("ItemPurchaseLimitExceed");}
                else { flag=1;}
            }catch(ItemPurches4 e)
            { System.out.println(e.getMessage());
            break;
            }
        
        System.out.println("Enter name of item");
        String name=sc.next();
        System.out.println("Enter price of item");
     int price=sc.nextInt();
        try {
        if(price<=0)
        {
        throw new ItemPurches4("you should enter value greater than 0");
        }else { flag=1;}
        }catch(ItemPurches4 e)
        {
            System.out.println(e.getMessage()); break;
        }
        
        
        it[i] = new Item4(name,price,new ItemBought4(itemid,itemqunty));
        
        
        
     bill=(it[i].getItemprice()*it[i].itemb.getItemqty());
    //System.out.println(it[i]);
        }
        if(flag>0) {
        for(int i=0;i<2;i++)
        {
            System.out.println(it[i]+""+bill);    
        }
    }
        
}
    
        
}
	
