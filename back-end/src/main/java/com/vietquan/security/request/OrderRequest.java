package com.vietquan.security.request;

import com.vietquan.security.enumPackage.OrderStatus;
import com.vietquan.security.enumPackage.PaymentMethod;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;
@Data
public class OrderRequest {
    private Integer id;
    private String orderDescription;
    private Date date;
    private Double amount;
    private String address;
    @Enumerated(
            EnumType.STRING
    )
    private PaymentMethod payment;
    @Enumerated(
            EnumType.STRING
    )
    private OrderStatus orderStatus;
    private Double totalAmount;
    private Double discount;
    private UUID trackingId;

    private String username;
    private String couponName;
    private String phoneNumber;
    private boolean isPayed;
    private Date deliveriedDate;
    private List<CartItemsRequest> carts;
    private boolean isReviewed;
}
