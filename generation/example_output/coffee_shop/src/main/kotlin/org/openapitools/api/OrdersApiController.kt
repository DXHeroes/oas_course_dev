package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.Order
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
class OrdersApiController() {

    @Operation(
        summary = "Create a new order",
        operationId = "createOrder",
        description = """Allows customers to create a new order in the coffee shop.""",
        responses = [
            ApiResponse(responseCode = "201", description = "Order created successfully", content = [Content(schema = Schema(implementation = kotlin.Int::class))]),
            ApiResponse(responseCode = "400", description = "Bad request (e.g., invalid order data)", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "500", description = "Server error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/orders"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createOrder(@Parameter(description = "", required = true) @Valid @RequestBody order: Order): ResponseEntity<kotlin.Int> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete an order by its ID",
        operationId = "deleteOrderById",
        description = """Removes an order from the coffee shop system using the provided orderId.""",
        responses = [
            ApiResponse(responseCode = "204", description = "Order deleted successfully"),
            ApiResponse(responseCode = "404", description = "Order not found", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "500", description = "Server error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/orders/{orderId}"],
        produces = ["application/json"]
    )
    fun deleteOrderById(@Parameter(description = "", required = true) @PathVariable("orderId") orderId: kotlin.Int): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieve a list of all orders",
        operationId = "getOrders",
        description = """Returns an array of all orders placed in the coffee shop.""",
        responses = [
            ApiResponse(responseCode = "200", description = "List of all orders", content = [Content(array = ArraySchema(schema = Schema(implementation = Order::class)))]),
            ApiResponse(responseCode = "500", description = "Internal server error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/orders"],
        produces = ["application/json"]
    )
    fun getOrders(): ResponseEntity<List<Order>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update an order by its ID",
        operationId = "updateOrderById",
        description = """Updates an order's details using the provided orderId.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Order updated successfully", content = [Content(schema = Schema(implementation = Order::class))]),
            ApiResponse(responseCode = "404", description = "Order not found", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "500", description = "Server error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "basicAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        value = ["/orders/{orderId}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateOrderById(@Parameter(description = "", required = true) @PathVariable("orderId") orderId: kotlin.Int,@Parameter(description = "", required = true) @Valid @RequestBody order: Order): ResponseEntity<Order> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
