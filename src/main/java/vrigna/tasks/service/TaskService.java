package vrigna.tasks.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import vrigna.tasks.entity.TaskEntity;
import vrigna.tasks.repository.TaskRepository;

@ApplicationScoped
@Transactional
public class TaskService {

    @Inject
    TaskRepository taskRepository;
    
    public TaskEntity add(
        TaskEntity taskEntity
    ){
        taskRepository.persist(taskEntity);
        return taskEntity;
    }

    public List<TaskEntity> listAll(){
        return taskRepository.listAll();
    }

}
