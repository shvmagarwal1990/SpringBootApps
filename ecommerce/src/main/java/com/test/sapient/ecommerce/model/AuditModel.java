package com.test.sapient.ecommerce.model;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)

public abstract class AuditModel implements Serializable {

   @Temporal(TemporalType.TIMESTAMP)
   @Column(insertable = true, updatable = false, name="created_at")
   @CreatedDate
   private Date createdAt;

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name="updated_at", insertable = true, updatable = true)
   @LastModifiedDate
   private Date updatedAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
