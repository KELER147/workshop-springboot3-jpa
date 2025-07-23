package com.github.keler147.ws_course_java.repositories;
import com.github.keler147.ws_course_java.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
