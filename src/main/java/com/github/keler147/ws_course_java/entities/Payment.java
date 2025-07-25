package com.github.keler147.ws_course_java.entities;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_payment")
public class Payment implements Serializable {
    //Attributes
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private Instant moment;

    //Associates
        @OneToOne
        @MapsId
        private Order order;

    //Constructors
        public Payment() {}
        public Payment(Long id, Instant moment, Order order) {
            this.id = id;
            this.moment = moment;
            this.order = order;
        }

    //Methods
        //HashCod And Equals
        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;

            Payment payment = (Payment) o;
            return Objects.equals(id, payment.id);
        }
        @Override
        public int hashCode() {
            return Objects.hashCode(id);
        }

        //Getters and Setters
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

        public Order getOrder() {
            return order;
        }
        public void setOrder(Order order) {
            this.order = order;
        }
}
