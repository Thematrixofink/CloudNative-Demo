package com.cloudnative.productclient.model;

import java.io.Serializable;
import lombok.Data;

/**
 * 商品
 * @TableName product
 */
@Data
public class Product implements Serializable {
    /**
     * 商品的id
     */
    private Integer id;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品价格
     */
    private Double price;


    private static final long serialVersionUID = 1L;
}
