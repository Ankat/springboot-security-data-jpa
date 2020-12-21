package com.ankat.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "USER")
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USR_ID", nullable = false, updatable = false, unique = true)
    private Long usrId;

    @NonNull
    @Column(name = "USR_NAME", nullable = false)
    private String usrName;

    @Column(name = "USR_AGE")
    private Integer usrAge;

    @NonNull
    @Column(name = "USR_USERNAME", nullable = false, updatable = false, unique = true)
    private String usrUsername;

    @NonNull
    @Column(name = "USR_PASSWORD", nullable = false)
    private String usrPassword;

    @NonNull
    @Column(name = "USR_ROLE", nullable = false)
    private String usrRole;

    @NonNull
    @Column(name = "USR_ACTIVE", nullable = false)
    private Boolean usrActive;
}
