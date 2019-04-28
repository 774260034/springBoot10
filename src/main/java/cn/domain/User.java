package cn.domain;

import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
@Entity
public class User implements Serializable {
    private static final long serialVersionUID= 1L;
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = true)
    private String name;
    @Column(nullable = true)
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
