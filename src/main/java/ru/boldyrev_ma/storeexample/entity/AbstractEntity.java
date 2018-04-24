package ru.boldyrev_ma.storeexample.entity;

import javax.persistence.*;

@MappedSuperclass
public class AbstractEntity {

    private Long id;
    private String name = "";
    private String caption = "DefaultCaption";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    public String getCaption() {
        return caption;
    }

    public void setCaption(String description) {
        this.caption = description;
    }
}
