package project03;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<SaleLineItem> lineItems = new ArrayList<>();
    boolean isComplete = false;
    Payment pay;

    public void makeLineItem(ProductDescription desc, int qty)
    {
        lineItems.add(new SaleLineItem(desc, qty));
    }

    public void beComplete(){
        isComplete = true;
    }

    public float  getTotal(){
        float sumUp = 0;
        for(SaleLineItem sli:lineItems)
        {
            sumUp +=sli.getSubtotal();
        }
        return sumUp;
    }
    public  void makePayment(float cash){
        pay = new Payment(cash);
    }

    public float getBalance()
    {
        return pay.getCash() - this.getTotal();
    }

    public void finishASale(){
        Receipt receipt = new Receipt();
        //TODO 原来是s 先暂代
        receipt.print(this);
    }

    public List<SaleLineItem> getLineItems() {
        return lineItems;
    }
}
