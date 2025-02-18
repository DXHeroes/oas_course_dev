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
}
