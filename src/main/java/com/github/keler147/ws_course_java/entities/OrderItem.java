package com.github.keler147.ws_course_java.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.keler147.ws_course_java.entities.pk.OrderItemPK;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_order_item")
public class OrderItem {
    //Attributes
        @EmbeddedId
        private OrderItemPK id = new OrderItemPK();
        private Integer quantity;
        private Double price;

    //Associates
        //

    //Constructors
        public OrderItem() {
        }
        public OrderItem(Order order, Product product, Integer quantity, Double price) {
            id.setOrder(order);
            id.setProduct(product);
            this.quantity = quantity;
            this.price = price;
        }

    //Methods
        //HashCod And Equals
        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;

            OrderItem orderItem = (OrderItem) o;
            return Objects.equals(id, orderItem.id);
        }
        @Override
        public int hashCode() {
            return Objects.hashCode(id);
        }

        //Getters and Setters
        @JsonIgnore
        public Order getOrder() {
            return id.getOrder();
        }
        public void setOrder(Order order) {
            this.id.setOrder(order);
        }

        public Product getProduct() {
            return id.getProduct();
        }
        public void setProduct(Product product) {
            this.id.setProduct(product);
        }

        public Integer getQuantity() {
            return quantity;
        }
        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public Double getPrice() {
            return price;
        }
        public void setPrice(Double price) {
            this.price = price;
        }


}
