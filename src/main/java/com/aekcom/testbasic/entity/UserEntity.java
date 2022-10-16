package com.aekcom.testbasic.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "test_user")
public class UserEntity {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String fname;

    @Column(name = "lname")
    private String lname;

}
