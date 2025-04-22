package com.udacity.jdnd.course3.critter.pet;

import com.udacity.jdnd.course3.critter.user.Customer;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PetType type;

    private String name;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Customer owner;

    private LocalDate birthDate;
    private String notes;

    // Getters and Setters...
}
