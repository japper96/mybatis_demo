package com.test.mybatis.pojo;

import java.util.Date;
import java.util.List;

public class Order {
    private Integer id;
    private Long userId;
    private String orderNumber;
    private Date created;
    private Date updated;
    private User user;
    private List<OrderDetail> detailList;

}
