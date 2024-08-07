package com.example.userServiceEcom.Feign;

import com.example.userServiceEcom.dto.CategoryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;


@FeignClient(name = "categoryService",url = "http://35.154.241.152:5002")
public interface CategoryClient {
    @GetMapping("/categories")
    List<CategoryDTO> getAllCategories();
    @GetMapping("/categories/{id}")
    Optional<CategoryDTO> getCategoryById(@PathVariable("id") int id);
}
