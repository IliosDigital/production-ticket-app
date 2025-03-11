package com.example.ticket.app.backend.Ilios.repo;

import com.example.ticket.app.backend.Ilios.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(String status);


    List<Task> findByAssignedName(String assignedName);
}
