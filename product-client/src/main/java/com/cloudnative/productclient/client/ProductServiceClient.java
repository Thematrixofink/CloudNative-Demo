package com.cloudnative.productclient.client;


import com.cloudnative.productclient.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;


/**
 商品服务远程调用客户端
 */
@FeignClient(name="product-service",path = "/product")
public interface ProductServiceClient {

    /**
     * 根据Id获取商品对象
     * @param productId
     * @return
     */
    @GetMapping("/findByProductId/{productId}")
    Product findByProductId(@RequestParam(value = "productId") Long
                                    productId);

    /**
     * 获取所有商品集合
     * @return
     */
    @GetMapping("/queryAllProduct")
    List<Product> queryAllProduct();
}
