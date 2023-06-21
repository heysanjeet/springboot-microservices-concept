package com.heysanjeet.application.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Setter
@Getter
@ToString
@Document(collation = "Employee")
public class Employee {

    @Id
    private Integer employeeId;
    private String employeeName;
    private String employeeLocation;
    private String employeeDepartment;
}
