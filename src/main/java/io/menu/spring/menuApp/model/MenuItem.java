package io.menu.spring.menuApp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MenuItem {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private double price;

    // Constructeur par défaut
    public MenuItem() {
    }

    // Constructeur avec tous les champs
    public MenuItem(Long id, String title, double price) {
        super();
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id ;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
