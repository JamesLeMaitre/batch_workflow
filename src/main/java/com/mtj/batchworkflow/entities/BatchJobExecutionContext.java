package com.mtj.batchworkflow.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "BATCH_JOB_EXECUTION_CONTEXT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BatchJobExecutionContext implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "JOB_EXECUTION_ID")
    private BatchJobExecution jobExecution;

    @Column(name = "SHORT_CONTEXT", nullable = false, length = 2500)
    private String shortContext;

    @Column(name = "SERIALIZED_CONTEXT", columnDefinition = "TEXT")
    private String serializedContext;

    // Getters and Setters
}