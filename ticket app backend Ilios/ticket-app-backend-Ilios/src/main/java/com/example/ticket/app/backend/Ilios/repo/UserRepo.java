package com.example.ticket.app.backend.Ilios.repo;
import com.example.ticket.app.backend.Ilios.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
