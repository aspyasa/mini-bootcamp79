package com.example.basedomains.dto;

import lombok.Data;

@Data
public class OrderEvent {
        private String message;
        private String status;
        private Order order;
}
