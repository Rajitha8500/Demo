package com.worker.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "worker")
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, unique = true, length = 45)
    private String name;

    @Column(name = "email_id", nullable = false, unique = true,length = 145)
    private String emailId;

    @Column(name = "mobile", nullable = false, unique = true, length = 10)
    private String mobile;

}