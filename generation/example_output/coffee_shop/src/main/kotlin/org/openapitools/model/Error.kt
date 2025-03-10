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
 * @param code Error code
 * @param message Error message
 */
data class Error(

    @Schema(example = "500", required = true, description = "Error code")
    @get:JsonProperty("code", required = true) val code: kotlin.Int,

    @Schema(example = "Internal server error", required = true, description = "Error message")
    @get:JsonProperty("message", required = true) val message: kotlin.String
    ) {

}

