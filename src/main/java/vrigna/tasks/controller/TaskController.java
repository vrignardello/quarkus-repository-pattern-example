package vrigna.tasks.controller;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import vrigna.tasks.entity.TaskEntity;
import vrigna.tasks.service.TaskService;

@Path("/api/v1/task")
public class TaskController {
    
    @Inject
    TaskService taskService;

    @POST
    @Path("/")
    public Response add(
        TaskEntity task
    ){
        TaskEntity taskEntity = taskService.add(task);
        return Response.ok(taskEntity).build();
    }

    @GET
    @Path("/")
    public Response listAll(){
        List<TaskEntity> taskEntities = taskService.listAll();
        return Response.ok(taskEntities).build();
    }

}
