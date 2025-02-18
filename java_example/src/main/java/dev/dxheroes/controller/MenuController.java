package dev.dxheroes.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/menu/{menuId}")
    public ResponseEntity<MenuItem> getMenuItem(@PathVariable int menuId) {
        return ResponseEntity.ok(menuService.sample());
    }
}