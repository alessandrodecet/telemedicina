package it.telemedicina.backend.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "rilevazioni_glicemiche")
public class RilevazioneGlicemica {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rilevazioni_seq_id")
    private Long id;

    private BigDecimal valore;

    private Boolean prePasto;

    private String descrizione;

    @ManyToOne
    @JoinColumn(name = "paziente_id")
    private Paziente paziente;
}
