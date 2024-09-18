package com.transporte.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "paraderos_a")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ParaderoA implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 2, max = 70)
    private String nombre;
    @NotNull
    private float posicion;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime hora;
    @NotNull
    private int horaDiferencia;
    @NotNull
    private float kilometraje;
    @NotNull
    private float kilometrajeDiferencia;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime creado;
    @Column(name = "estatus")
    private int estatus;
}
