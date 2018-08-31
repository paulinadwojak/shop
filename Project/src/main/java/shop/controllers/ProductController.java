package shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import shop.products.models.Product;
import shop.products.services.ProductService;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public String productList(Model model) {
        List<Product> productList = productService.getProductsList();
        model.addAttribute("productList", productList);

        return "productList";
    }

    @GetMapping("/addProductForm")
    public String addProduct(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "addProductForm";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);

        return "redirect:/list";
    }

    @PostMapping("/deleteProduct")
    public String deleteProduct(@RequestParam("productId") int productId) {
        productService.deleteProduct(productId);

        return "redirect:/list";
    }

    @GetMapping("/updateProduct")
    public String updateProduct(@RequestParam("productId") int productId, Model model) {
        Product product = productService.getProduct(productId);
        model.addAttribute("product", product);
        return "addProductForm";
    }

    @GetMapping("/loginPage")
    public String login() {
        return "loginPage";
    }

    @GetMapping("/registrationForm")
    public String registration() {
        return "registrationForm";
    }
}
