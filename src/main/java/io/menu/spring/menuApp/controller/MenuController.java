package io.menu.spring.menuApp.controller;

import io.menu.spring.menuApp.model.MenuItem;
import io.menu.spring.menuApp.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;
    @RequestMapping(method = RequestMethod.GET,value = "/menus")
    public List<MenuItem> getMenus() {
        return menuService.getMenus();
    }

    @RequestMapping ("/MenuItem/{id}")
    public MenuItem getMenuItem(@PathVariable Long id) {
        return menuService.getMenuItem(id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "MenuItem/{id}")
    public void deleteMenuItem(@PathVariable long id) {
        menuService.deleteMenuItem(id);
    }
    @RequestMapping(method = RequestMethod.POST,value ="/menus")
    public void addMenuItem(@RequestBody MenuItem MenuItem){
        menuService.addMenuItem(MenuItem);
    }
    @RequestMapping(method =RequestMethod.PUT,value = "MenuItem/{id}")
    public void updateItem(@RequestBody MenuItem menuItem ,@PathVariable long id ) {
        menuService.updateMenuItem(menuItem,id);
    }
}
