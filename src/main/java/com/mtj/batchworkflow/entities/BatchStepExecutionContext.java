package com.mtj.batchworkflow.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "BATCH_STEP_EXECUTION_CONTEXT")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BatchStepExecutionContext {

    @Id
    @OneToOne
    @JoinColumn(name = "STEP_EXECUTION_ID")
    private BatchStepExecution stepExecution;

    @Column(name = "SHORT_CONTEXT", nullable = false, length = 2500)
    private String shortContext;

    @Column(name = "SERIALIZED_CONTEXT", columnDefinition = "TEXT")
    private String serializedContext;

    // Getters and Setters
}
