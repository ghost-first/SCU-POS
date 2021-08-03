package project03;

public class POSSystem {
    Sale curSale;
    ProductCatalog catalog;
    EndSaleFrame ef = EndSaleFrame.getInstance();

    public POSSystem(){}

    public void makeNewSale()
    {
        curSale = new Sale();
    }

    public void enterItem(String id, int qty)
    {
        ProductDescription desc = catalog.getProductDesc(id);
        curSale.makeLineItem(desc,qty);
    }
    public void startUp()
    {
        catalog = new ProductCatalog();//加载产品目录
    }
    public void endPurchase()
    {
        curSale.beComplete();
        System.out.println("总金额——"+curSale.getTotal());
        //计算应付额，并显示在“结算界面pf”上 TODO
        ef.setCurSaleTotal(curSale.getTotal());
//        ef.setCurSaleTotal(curSale.getTotal());
    }
    public void makePayment(float cash)
    {
        curSale.makePayment(cash);
        System.out.println("应该找零——"+curSale.getBalance());
        //计算应找零金额，并显示在“结算界面pf”上 TODO
        ef.setBalance(curSale.getBalance());
    }
    public void finishASale()
    {
        curSale.finishASale();
    }


}
