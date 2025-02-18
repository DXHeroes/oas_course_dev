package dev.dxheroes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import dev.dxheroes.dto.MenuItem;

@Service
public class MenuService {
    private final List<MenuItem> menuItems = new ArrayList<>();
    private final AtomicInteger idGenerator = new AtomicInteger(1);

    public MenuItem sample() {
        return new MenuItem() {{
            setId(1);
            setName("Cappuccino");
            setDescription("A delicious cappuccino made with our finest espresso");
            setPrice(3.50);
        }};
    }
    
}
