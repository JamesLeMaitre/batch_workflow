package com.mtj.batchworkflow.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "BATCH_JOB_INSTANCE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BatchJobInstance implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JOB_INSTANCE_ID")
    private Long jobInstanceId;

    @Column(name = "VERSION")
    private Long version;

    @Column(name = "JOB_NAME", nullable = false)
    private String jobName;

    @Column(name = "JOB_KEY", nullable = false)
    private String jobKey;

}