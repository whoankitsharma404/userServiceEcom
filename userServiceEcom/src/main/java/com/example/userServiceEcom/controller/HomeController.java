package com.example.userServiceEcom.controller;


import com.example.userServiceEcom.Feign.CategoryClient;
import com.example.userServiceEcom.Feign.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@CrossOrigin
public class HomeController {

    @Autowired
    private CategoryClient categoryClient;

    @Autowired
    private ProductClient productClient;
    @GetMapping({"/","/home"})
    public String home(Model model){
        return "index1";
    }

    @GetMapping("/shop")
    public String shop(Model model){
        model.addAttribute("categories",categoryClient.getAllCategories());
        model.addAttribute("products",productClient.getAllProduct());
        return "shop";
    }

    @GetMapping("/shop/category/{id}")
    public String shopByCategory(Model model, @PathVariable int id){
        model.addAttribute("categories",categoryClient.getAllCategories());
        model.addAttribute("products",productClient.getAllProductsByCategoryId(id));
        return "shop";
    }

    @GetMapping("/shop/viewproduct/{id}")
    public String viewProduct(Model model, @PathVariable Long id){
        model.addAttribute("product",productClient.getProductById(id));
        return "viewProduct";
    }


}
