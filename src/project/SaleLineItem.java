package project;

public class SaleLineItem {
    int qty;
    ProductDescription pd;
    public SaleLineItem(ProductDescription desc,int qty){
        this.qty = qty;
        this.pd = desc;
    }
    public float getSubtotal(){
        return qty*pd.getPrice();
    }

}
