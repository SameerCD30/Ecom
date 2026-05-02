package com.sameer.Ecom.model.dto;

import java.time.LocalDate;
import java.util.List;

public record OrderResponse(
   String orderID,
   String customerName,
   String email,
   String status,
   LocalDate orderData,
   List<OrderItemRequest> items
) {}
