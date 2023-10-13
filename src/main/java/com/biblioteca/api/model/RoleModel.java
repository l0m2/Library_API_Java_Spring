package com.biblioteca.api.model;

import com.biblioteca.api.model.enums.RoleName;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "Roles")
public class RoleModel implements GrantedAuthority, Serializable {
    private static final long seriaV =  1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID role_id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private RoleName roleName;


    @Override
    public String getAuthority() {
        return roleName.toString();
    }

    public UUID getRole_id() {
        return role_id;
    }

    public void setRole_id(UUID role_id) {
        this.role_id = role_id;
    }

    public RoleName getRoleName() {
        return roleName;
    }

    public void setRoleName(RoleName roleName) {
        this.roleName = roleName;
    }
}
