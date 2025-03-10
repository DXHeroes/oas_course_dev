package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.MenuItem
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/v1}")
class MenuApiController() {

    @Operation(
        summary = "Create a new menu item",
        operationId = "createMenuItem",
        description = """Creates a new menu item in the coffee shop.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Menu updated successfully", content = [Content(schema = Schema(implementation = MenuItem::class))]),
            ApiResponse(responseCode = "400", description = "Bad request (e.g., invalid menu data)", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "500", description = "Server error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/menu"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createMenuItem(@Parameter(description = "", required = true) @Valid @RequestBody menuItem: MenuItem): ResponseEntity<MenuItem> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get menu",
        operationId = "getMenu",
        description = """Returns the current menu of the coffee shop.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Menu of the coffee shop", content = [Content(array = ArraySchema(schema = Schema(implementation = MenuItem::class)))]),
            ApiResponse(responseCode = "500", description = "Server error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/menu"],
        produces = ["application/json"]
    )
    fun getMenu(): ResponseEntity<List<MenuItem>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get menu by ID",
        operationId = "getMenuById",
        description = """Returns the menu of the coffee shop by ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Menu of the coffee shop", content = [Content(schema = Schema(implementation = MenuItem::class))]),
            ApiResponse(responseCode = "404", description = "Menu not found", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/menu/{menuId}"],
        produces = ["application/json"]
    )
    fun getMenuById(@Parameter(description = "", required = true) @PathVariable("menuId") menuId: kotlin.Int): ResponseEntity<MenuItem> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update the menu",
        operationId = "updateMenu",
        description = """Updates the entire menu of the coffee shop.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Menu updated successfully", content = [Content(schema = Schema(implementation = MenuItem::class))]),
            ApiResponse(responseCode = "400", description = "Bad request (e.g., invalid menu data)", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "500", description = "Server error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        value = ["/menu/{menuId}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateMenu(@Parameter(description = "", required = true) @PathVariable("menuId") menuId: kotlin.Int,@Parameter(description = "", required = true) @Valid @RequestBody menuItem: MenuItem): ResponseEntity<MenuItem> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
