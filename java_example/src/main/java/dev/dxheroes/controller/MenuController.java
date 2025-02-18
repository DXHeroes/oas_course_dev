package dev.dxheroes.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import dev.dxheroes.dto.MenuItem;
import dev.dxheroes.service.MenuService;

@RestController
public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/")
    public String healthCheck() {
        return "OK";
    }


    @GetMapping("/menu")
    public ResponseEntity<List<MenuItem>> getMenu() {
        return ResponseEntity.ok(menuService.getAllMenuItems());
    }

    @GetMapping("/menu/{menuId}")
    public ResponseEntity<MenuItem> getMenuById(@PathVariable Integer menuId) {
        try {
            MenuItem menuItem = menuService.getMenuItemById(menuId);
            return ResponseEntity.ok(menuItem);
        } catch(ResponseStatusException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Menu item not found");
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid menu item id: " + e.getMessage());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Failed to get menu item: " + e.getMessage());
        }
    }

    @PostMapping("/menu")
    public ResponseEntity<MenuItem> createMenuItem(@Valid @RequestBody MenuItem menuItem) {
        try {
            MenuItem createdItem = menuService.createMenuItem(menuItem);
            return ResponseEntity.ok(createdItem);
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid menu item data: " + e.getMessage());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Failed to create menu item: " + e.getMessage());
        }
    }

    @PutMapping("/menu/{menuId}")
    public ResponseEntity<MenuItem> updateMenu(@PathVariable Integer menuId, @Valid @RequestBody MenuItem menuItem) {
        try {
            MenuItem updatedItem = menuService.updateMenuItem(menuId, menuItem);
            return ResponseEntity.ok(updatedItem);
        } catch(ResponseStatusException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Menu item not found");
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid menu item data: " + e.getMessage());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Failed to update menu item: " + e.getMessage());
        }
    }
}