package com.example.librarycatalogarchitectureapp.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.ConstructorParameters;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="books_t")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_f", nullable = false)
    private String name;

    @Column(name = "author_f", nullable = false)
    private String author;

    @Column(name = "year_f", nullable = false)
    private Integer year;
}