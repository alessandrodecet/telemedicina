package it.telemedicina.backend.domain;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "diabetologi")
public class Diabetologo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "diabetologo_id_seq")
    private Long id;

    private String nome;

    private String cognome;

    private String contatto;


}
