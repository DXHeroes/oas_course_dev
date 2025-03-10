package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MenuItemPromotionOneOf
import org.openapitools.model.MenuItemPromotionOneOf1
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
 * Details of the promotion applied to the menu item
 * @param type Type of promotion
 * @param amount Discount amount
 * @param description Description of the promotion
 */
data class MenuItemPromotion(

    @Schema(example = "null", required = true, description = "Type of promotion")
    @get:JsonProperty("type", required = true) val type: MenuItemPromotion.Type,

    @Schema(example = "null", required = true, description = "Discount amount")
    @get:JsonProperty("amount", required = true) val amount: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "Description of the promotion")
    @get:JsonProperty("description", required = true) val description: kotlin.String
    ) {

    /**
    * Type of promotion
    * Values: discount,bogo
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        discount("discount"),
        bogo("bogo");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().first{it -> it.value == value}
            }
        }
    }

}

