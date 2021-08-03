package project;

public class ProductDescription {
    String num,name;
    float price;
    public ProductDescription(String num,float price,String name){
     this.num = num;
     this.price = price;
     this.name = name;
    }

    public float getPrice(){
        return price;
    }

}
