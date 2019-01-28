package com.test.mybatis.pojo;

public class OrderDetail {
    private Integer id;
    private Integer orderId;
    private Double totalPrice;
    private Integer status;
    private Item item;
}
class Item {
    private Integer id;
    private String itemName;
    private Float itemPrice;
    private String itemDetail;
}
