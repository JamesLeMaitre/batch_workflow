package com.mtj.batchworkflow.config;

import com.mtj.batchworkflow.entities.Employee;
import com.mtj.batchworkflow.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

@Configuration
@EnableBatchProcessing
@AllArgsConstructor
public class SpringBatchConfig {
    private final JobBuilder jobBuilder;
    private final StepBuilder stepBuilder;
    private final EmployeeRepository repository;



    private FlatFileItemWriter<Employee> reader(){
        FlatFileItemWriter<Employee> itemWriter = new FlatFileItemWriter<>();
        itemWriter.setResource(new FileSystemResource("src/main/resources/static/employee.xlsx"));
        itemWriter.setName("xlsxReader");
        itemWriter.setLinesToskip()
    }
}
