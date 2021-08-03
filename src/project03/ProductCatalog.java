package project03;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private Map<String, ProductDescription> descriptions = new HashMap<>();

    public ProductCatalog()
    {
        System.out.println("ProductCatalog构造了");
        loadCatalog();
    }

    public ProductDescription getProductDesc(String id) {
        return descriptions.get(id);
    }

    private void loadCatalog(){
        String id1 = "100";
        ProductDescription desc1
                = new ProductDescription(id1,(float)2.5,"辣条");
        descriptions.put(id1,desc1);

        String id2 = "101";
        ProductDescription desc2
                = new ProductDescription(id1,(float)4.0,"泡面");
        descriptions.put(id2,desc2);
    }
}
