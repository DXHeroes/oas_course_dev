package dev.dxheroes.dto;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    @JsonProperty("id")
    private Integer id;

    @NotNull
    @Size(min = 3, max = 50)
    @JsonProperty("customer_name")
    private String customerName;

    @NotNull
    @JsonProperty("items")
    private List<OrderItem> items;

    @NotNull
    @JsonProperty("total_price")
    private Double totalPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
