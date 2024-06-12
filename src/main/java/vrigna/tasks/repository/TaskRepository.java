package vrigna.tasks.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import vrigna.tasks.entity.TaskEntity;

@ApplicationScoped
public class TaskRepository implements PanacheRepositoryBase<TaskEntity, Long>{
    
}
