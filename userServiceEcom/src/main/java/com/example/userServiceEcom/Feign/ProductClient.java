package com.example.userServiceEcom.Feign;


import com.example.userServiceEcom.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="productService",url="http://13.233.122.254:5001")
public interface ProductClient {
    @GetMapping("/products")
    public List<ProductDTO> getAllProduct();

    @GetMapping("/shop/category/{id}")
    public List<ProductDTO> getAllProductsByCategoryId(@PathVariable int  id);


    @GetMapping("/getProduct/{id}")
    public ProductDTO getProductById(@PathVariable Long id);



}
