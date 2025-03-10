package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.Order
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class OrdersApiTest {

    private val api: OrdersApiController = OrdersApiController()

    /**
     * To test OrdersApiController.createOrder
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createOrderTest() {
        val order: Order = TODO()
        val response: ResponseEntity<kotlin.Int> = api.createOrder(order)

        // TODO: test validations
    }

    /**
     * To test OrdersApiController.deleteOrderById
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteOrderByIdTest() {
        val orderId: kotlin.Int = TODO()
        val response: ResponseEntity<Unit> = api.deleteOrderById(orderId)

        // TODO: test validations
    }

    /**
     * To test OrdersApiController.getOrders
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrdersTest() {
        val response: ResponseEntity<List<Order>> = api.getOrders()

        // TODO: test validations
    }

    /**
     * To test OrdersApiController.updateOrderById
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOrderByIdTest() {
        val orderId: kotlin.Int = TODO()
        val order: Order = TODO()
        val response: ResponseEntity<Order> = api.updateOrderById(orderId, order)

        // TODO: test validations
    }
}
