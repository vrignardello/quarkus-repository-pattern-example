package vrigna.tasks.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Task")
@Getter
@Setter
public class TaskEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    private String comment;

}
