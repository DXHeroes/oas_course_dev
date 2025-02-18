package dev.dxheroes.dto;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

enum ItemSize {
    SMALL,
    MEDIUM,
    LARGE
}

public class MenuItem {
    @JsonProperty("id")
    private Integer id;

    @NotNull
    @Size(min = 3, max = 50)
    @JsonProperty("name")
    private String name;

    @Size(max = 100)
    @JsonProperty("description")
    private String description;

    @NotNull
    @Min(0)
    @JsonProperty("price")
    private Double price;

    @JsonProperty("size")
    private ItemSize size;

    @Size(min = 1, max = 5)
    @JsonProperty("extraItems")
    private List<String> extraItems;

    @JsonProperty("modifiers")
    private List<Modifier> modifiers;

    @JsonProperty("promotion")
    private Promotion promotion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
