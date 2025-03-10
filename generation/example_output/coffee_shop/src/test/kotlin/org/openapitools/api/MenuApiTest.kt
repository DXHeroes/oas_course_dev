package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.MenuItem
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class MenuApiTest {

    private val api: MenuApiController = MenuApiController()

    /**
     * To test MenuApiController.createMenuItem
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createMenuItemTest() {
        val menuItem: MenuItem = TODO()
        val response: ResponseEntity<MenuItem> = api.createMenuItem(menuItem)

        // TODO: test validations
    }

    /**
     * To test MenuApiController.getMenu
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getMenuTest() {
        val response: ResponseEntity<List<MenuItem>> = api.getMenu()

        // TODO: test validations
    }

    /**
     * To test MenuApiController.getMenuById
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getMenuByIdTest() {
        val menuId: kotlin.Int = TODO()
        val response: ResponseEntity<MenuItem> = api.getMenuById(menuId)

        // TODO: test validations
    }

    /**
     * To test MenuApiController.updateMenu
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateMenuTest() {
        val menuId: kotlin.Int = TODO()
        val menuItem: MenuItem = TODO()
        val response: ResponseEntity<MenuItem> = api.updateMenu(menuId, menuItem)

        // TODO: test validations
    }
}
