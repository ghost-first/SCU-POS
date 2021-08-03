package project03;

public class SaleLineItem {
    int qty;
    ProductDescription pd;
    public SaleLineItem(ProductDescription desc, int qty){
        this.qty = qty;
        this.pd = desc;
    }
    public float getSubtotal(){
        return qty*pd.getPrice();
    }

    @Override
    public String toString() {
        return pd.toString() + "  数量：" + qty;
    }
}
