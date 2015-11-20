package controller;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import repository.ProductRepository;

/**
 * Created by Zane on 11/19/2015.
 */
@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @RequestMapping("/create")
    @ResponseBody
    public String create(int id, String desc) {
        Product product = null;
        try {
            product = new Product();
            product.setId(id);
            product.setDescription(desc);
            productRepository.save(product);
        }
        catch (Exception ex) {
            return "Error creating the product: " + ex.toString();
        }
        return "Product successfully created! (id = " + product.getId() + ")";
    }
}
