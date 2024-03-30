package com.cloudnative.productservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudnative.productservice.domain.Product;
import com.cloudnative.productservice.service.ProductService;
import com.cloudnative.productservice.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
* @author 24957
* @description 针对表【product】的数据库操作Service实现
* @createDate 2024-03-23 17:01:07
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{

}




