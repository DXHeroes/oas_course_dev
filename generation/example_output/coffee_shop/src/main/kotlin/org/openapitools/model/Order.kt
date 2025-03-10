package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OrderItem
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param id Order ID
 * @param customerName Customer name
 * @param items Items in the order
 * @param totalPrice Total order price
 */
data class Order(

    @Schema(example = "123", description = "Order ID")
    @get:JsonProperty("id") val id: kotlin.Int? = null,

    @get:Size(min=3,max=50)
    @Schema(example = "John Doe", description = "Customer name")
    @get:JsonProperty("customer_name") val customerName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Items in the order")
    @get:JsonProperty("items") val items: kotlin.collections.List<OrderItem>? = null,

    @Schema(example = "10.5", description = "Total order price")
    @get:JsonProperty("total_price") val totalPrice: kotlin.Float? = null
    ) {

}

