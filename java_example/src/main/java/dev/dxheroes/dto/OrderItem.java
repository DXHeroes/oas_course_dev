package dev.dxheroes.dto;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderItem {
    @NotNull
    @JsonProperty("menu_item_id")
    private Integer menuItemId;

    @NotNull
    @JsonProperty("quantity")
    private Integer quantity;
}