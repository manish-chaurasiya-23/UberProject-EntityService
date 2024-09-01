package com.example.UberProjectEntityService.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseModel {
    @Id  // this annotation makes primary key of our table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identity --> auto_increment
    protected Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // this annotation tells spring about the formats of Date object to be stored i.e. Date / Time ? Timestamp
    @CreatedDate // this annotation tells spring that only handle it for object creation
    protected Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate  // this annotation tells spring that only handle it for object update
    protected Date updatedAt;
}
