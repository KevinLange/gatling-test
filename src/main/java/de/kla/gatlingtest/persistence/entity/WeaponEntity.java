package de.kla.gatlingtest.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class WeaponEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NAME")
    private String name;

    public WeaponEntity(String name) {
        this.name = name;
    }
}
