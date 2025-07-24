package com.github.keler147.ws_course_java.repositories;
import com.github.keler147.ws_course_java.entities.Category;
import com.github.keler147.ws_course_java.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
