package com.github.keler147.ws_course_java.entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_product")
public class Product implements Serializable {
    //Attributes
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String description;
        private Double price;
        private String imgUrl;

    //Associates
        @Transient
        private Set<Category> categories = new HashSet<>();

    //Constructors
        public Product() {
        }
        public Product(Long id, String name, String description, Double price, String imgUrl) {
            this.description = description;
            this.id = id;
            this.imgUrl = imgUrl;
            this.name = name;
            this.price = price;
        }

    //Methods
        //HashCod And Equals
        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;

            Product product = (Product) o;
            return Objects.equals(id, product.id);
        }
        @Override
        public int hashCode() {
            return Objects.hashCode(id);
        }

        //Getters and Setters
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }

        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }

        public String getImgUrl() {
            return imgUrl;
        }
        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }
        public void setPrice(Double price) {
            this.price = price;
        }

        public Set<Category> getCategories() {
            return categories;
        }
}
