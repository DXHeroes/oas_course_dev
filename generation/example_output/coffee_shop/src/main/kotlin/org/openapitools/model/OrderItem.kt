package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param menuItemId Menu item ID
 * @param quantity Quantity
 */
data class OrderItem(

    @Schema(example = "456", description = "Menu item ID")
    @get:JsonProperty("menu_item_id") val menuItemId: kotlin.Int? = null,

    @Schema(example = "2", description = "Quantity")
    @get:JsonProperty("quantity") val quantity: kotlin.Int? = null
    ) {

}

