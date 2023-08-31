package com.async.orderservice.dto;

import com.async.orderservice.model.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {


    private String id;
    private Item[] items;

}