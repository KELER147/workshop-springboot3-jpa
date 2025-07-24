package com.github.keler147.ws_course_java.entities;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.keler147.ws_course_java.entities.enums.OrderStatus;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    //Attributes
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
        private Instant moment;
        private Integer orderStatus;

    //Associates
        @ManyToOne
        @JoinColumn(name = "client_id")
        private User client;

    //Constructors
        public Order() {
        }
        public Order(Long id, Instant moment, OrderStatus orderStatus,  User client) {
            this.client = client;
            this.id = id;
            this.moment = moment;
            setOrderStatus(orderStatus);
        }

    //Methods
        //HashCod And Equals
        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;

            Order order = (Order) o;
            return Objects.equals(id, order.id) && Objects.equals(moment, order.moment) && Objects.equals(client, order.client);
        }
        @Override
        public int hashCode() {
            int result = Objects.hashCode(id);
            result = 31 * result + Objects.hashCode(moment);
            result = 31 * result + Objects.hashCode(client);
            return result;
        }

        //Getters and Setters
        public User getClient() {
            return client;
        }
        public void setClient(User client) {
            this.client = client;
        }

        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }

        public Instant getMoment() {
            return moment;
        }
        public void setMoment(Instant moment) {
            this.moment = moment;
        }

        public OrderStatus getOrderStatus() {
            return OrderStatus.valueOf(orderStatus);
        }
        public void setOrderStatus(OrderStatus orderStatus) {
            if (orderStatus != null) {
                this.orderStatus = orderStatus.getCode();
            }
        }
}
