package io.menu.spring.menuApp.service;

import io.menu.spring.menuApp.model.MenuItem;
import io.menu.spring.menuApp.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MenuService {
   @Autowired
   private MenuItemRepository menuItemRepository;



   public List<MenuItem> getMenus() {
      List<MenuItem> menus =new ArrayList<>();
      menuItemRepository.findAll().forEach(MenuItem->{
         menus.add(MenuItem);

              });
      return menus;
   }

   public MenuItem getMenuItem(Long id) {
      return menuItemRepository.findById(id).orElse(null);
   }

   public void deleteMenuItem(long id) {
      menuItemRepository.deleteById(id);
   }

   public void addMenuItem(MenuItem menuItem) {
      menuItemRepository.save(menuItem);
   }

   public void updateMenuItem(MenuItem menuItem, long id) {
     menuItemRepository.save(menuItem);
         }

}
