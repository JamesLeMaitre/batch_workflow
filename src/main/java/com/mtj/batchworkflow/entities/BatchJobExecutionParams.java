package com.mtj.batchworkflow.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "BATCH_JOB_EXECUTION_PARAMS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BatchJobExecutionParams implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "JOB_EXECUTION_ID")
    private BatchJobExecution jobExecution;

    @Column(name = "TYPE_CD", nullable = false)
    private String typeCode;

    @Column(name = "KEY_NAME", nullable = false)
    private String keyName;

    @Column(name = "STRING_VAL", length = 250)
    private String stringValue;

    @Column(name = "DATE_VAL")
    private LocalDateTime dateValue;

    @Column(name = "LONG_VAL")
    private Long longValue;

    @Column(name = "DOUBLE_VAL")
    private Double doubleValue;

    // Getters and Setters
}