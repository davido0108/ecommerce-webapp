package com.backend.orderservice.dto;

import com.backend.orderservice.model.OrderLineItems;
import lombok.Data;

import java.util.List;

@Data

public class OrderResponse {
    private String orderNumber;
    private List<OrderLineItems> orderLineItemsList;
}
