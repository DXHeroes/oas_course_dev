package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MenuItemModifiersInner
import org.openapitools.model.MenuItemPromotion
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
 * A schema representing a menu item.
 * @param id Menu item ID
 * @param name Name of the item
 * @param price Price of the item
 * @param description Description of the item
 * @param propertySize Size of the item
 * @param extraItems Additional items that can be added to the menu item
 * @param modifiers Modifiers for the menu item
 * @param promotion 
 */
data class MenuItem(

    @Schema(example = "456", required = true, description = "Menu item ID")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(min=3,max=50)
    @Schema(example = "Cappuccino", required = true, description = "Name of the item")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:DecimalMin("0")
    @Schema(example = "3.5", required = true, description = "Price of the item")
    @get:JsonProperty("price", required = true) val price: java.math.BigDecimal,

    @get:Size(max=100)
    @Schema(example = "A delicious cappuccino made with our finest espresso.", description = "Description of the item")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "Medium", description = "Size of the item")
    @get:JsonProperty("size") val propertySize: MenuItem.PropertySize? = null,

    @get:Size(min=0,max=5) 
    @Schema(example = "[\"Extra Shot\",\"Soy Milk\"]", description = "Additional items that can be added to the menu item")
    @get:JsonProperty("extraItems") val extraItems: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Modifiers for the menu item")
    @get:JsonProperty("modifiers") val modifiers: kotlin.collections.List<MenuItemModifiersInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("promotion") val promotion: MenuItemPromotion? = null
    ) {

    /**
    * Size of the item
    * Values: Small,Medium,Large
    */
    enum class PropertySize(@get:JsonValue val value: kotlin.String) {

        Small("Small"),
        Medium("Medium"),
        Large("Large");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): PropertySize {
                return values().first{it -> it.value == value}
            }
        }
    }

}

