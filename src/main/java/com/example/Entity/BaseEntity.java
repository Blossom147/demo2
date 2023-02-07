package com.example.Entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "createBy")
    private String createBy;
    @Column(name = "createDate")
    private Date createDate;

    public Long getId() {
        return id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
