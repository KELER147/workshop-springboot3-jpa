package com.github.keler147.ws_course_java.entities.pk;
import com.github.keler147.ws_course_java.entities.Order;
import com.github.keler147.ws_course_java.entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderItemPK implements Serializable {
    //Attributes
        @ManyToOne
        @JoinColumn(name = "order_id")
        private Order order;

        @ManyToOne
        @JoinColumn(name = "product_id")
        private Product product;

    //Methods
        //Equal and HashCode
        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;

            OrderItemPK that = (OrderItemPK) o;
            return Objects.equals(order, that.order) && Objects.equals(product, that.product);
        }
        @Override
        public int hashCode() {
            int result = Objects.hashCode(order);
            result = 31 * result + Objects.hashCode(product);
            return result;
        }

        //Getters and Setters
        public Order getOrder() {
            return order;
        }
        public void setOrder(Order order) {
            this.order = order;
        }

        public Product getProduct() {
            return product;
        }
        public void setProduct(Product product) {
            this.product = product;
        }
}
