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
 * @param name Name of the modifier
 * @param options Possible options for the modifier
 */
data class MenuItemModifiersInner(

    @Schema(example = "null", required = true, description = "Name of the modifier")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Possible options for the modifier")
    @get:JsonProperty("options", required = true) val options: kotlin.collections.Set<kotlin.String>
    ) {

}

