package com.cloudnative.productservice.controller;


import com.cloudnative.productservice.domain.Product;
import com.cloudnative.productservice.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController {

    @Resource
    private ProductService productService;


    /**
     *  根据商品 id
     *  查询商品
     * @param productId
     * @return
     */
    @GetMapping("/findByProductId/{productId}")
    public Product findByProductId(@PathVariable Long productId) {
        log.info("-------------ok queryById----------------");
        Product product = productService.getById(productId);
        return product;
    }


    /**
     *  查询所有商品
     * @return
     */
    @GetMapping("/queryAllProduct")
    public List<Product> findByProductId() {
        List<Product> productList = productService.list();
        log.info("-------------OK queryAllProduct--------------------");
        return productList;
    }

}
