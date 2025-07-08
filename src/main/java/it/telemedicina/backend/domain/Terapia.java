package it.telemedicina.backend.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Terapia {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "terapia_seq_id")
    private Long id;

    private Date data_inizio;

    private Date data_fine;

    private String farmaco;

    private Long dosaggio;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paziente_id")
    private Paziente paziente;



}
