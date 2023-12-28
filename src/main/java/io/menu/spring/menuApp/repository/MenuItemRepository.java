package io.menu.spring.menuApp.repository;

import io.menu.spring.menuApp.model.MenuItem;
import org.springframework.data.repository.CrudRepository;

public interface MenuItemRepository extends CrudRepository<MenuItem, Long> {
}
