package com.github.keler147.ws_course_java.repositories;
import com.github.keler147.ws_course_java.entities.OrderItem;
import com.github.keler147.ws_course_java.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
