package com.sameer.Ecom.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record OrderItemRequest(
        int productId,
        int quantity
) {}