package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param type Type of promotion
 * @param amount Discount amount
 */
data class MenuItemPromotionOneOf(

    @Schema(example = "null", required = true, description = "Type of promotion")
    @get:JsonProperty("type", required = true) val type: MenuItemPromotionOneOf.Type,

    @Schema(example = "null", required = true, description = "Discount amount")
    @get:JsonProperty("amount", required = true) val amount: java.math.BigDecimal
    ) {

    /**
    * Type of promotion
    * Values: discount
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        discount("discount");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().first{it -> it.value == value}
            }
        }
    }

}

