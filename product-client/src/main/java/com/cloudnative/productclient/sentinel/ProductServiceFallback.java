package com.cloudnative.productclient.sentinel;

import com.cloudnative.productclient.client.ProductServiceClient;
import com.cloudnative.productclient.model.Product;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ProductServiceFallback implements ProductServiceClient {
    @Override
    public Product findByProductId(Long productId) {
        log.warn("findByProductId callback");
        return null;
    }

    @Override
    public List<Product> queryAllProduct() {
        log.warn("queryAllProduct callback");
        return null;
    }
}
