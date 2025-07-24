package com.github.keler147.ws_course_java.repositories;
import com.github.keler147.ws_course_java.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
