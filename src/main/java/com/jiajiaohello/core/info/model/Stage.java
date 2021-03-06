package com.jiajiaohello.core.info.model;

/**
 *
 * 阶段（小学、中学、高中、大学、其它）
 *
 * User: bohan
 * Date: 10/27/14
 * Time: 6:09 PM
 */

import com.jiajiaohello.support.core.CommonHelper;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Stage {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    @OneToMany(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    List<Course> courses;
    private Date createdAt;
    private Date updatedAt;

    public void init() {
        this.createdAt = CommonHelper.now();
        this.updatedAt = CommonHelper.now();
    }

    @Override
    public String toString() {
        return "Stage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", courses=" + courses +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
