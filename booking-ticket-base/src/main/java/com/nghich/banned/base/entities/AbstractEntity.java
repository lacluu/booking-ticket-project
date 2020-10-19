package com.nghich.banned.base.entities;

import java.time.LocalDateTime;

public abstract class AbstractEntity {
    protected Long id;
    protected String status;
    protected LocalDateTime createAt;
    protected LocalDateTime modifiedAt;



    protected int version;

    public AbstractEntity() {
    }

    public AbstractEntity(Long id, String status, LocalDateTime createAt, LocalDateTime modifiedAt, int version) {
        this.id = id;
        this.status = status;
        this.createAt = createAt;
        this.modifiedAt = modifiedAt;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
