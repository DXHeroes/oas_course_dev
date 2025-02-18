package dev.dxheroes.dto;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DiscountPromotion.class, name = "DISCOUNT"),
    @JsonSubTypes.Type(value = FreeItemPromotion.class, name = "FREE_ITEM")
})
public sealed interface Promotion permits DiscountPromotion, FreeItemPromotion {}

record DiscountPromotion(
    @NotNull Double amount
) implements Promotion {}

record FreeItemPromotion(
    @NotNull String description
) implements Promotion {}
