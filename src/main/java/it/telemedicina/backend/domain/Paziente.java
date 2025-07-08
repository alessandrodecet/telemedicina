package it.telemedicina.backend.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "pazienti")
public class Paziente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paziente_seq_id")
    private Long id;

    private String nome;

    private String cognome;

    private LocalDate dataNascita;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "comorbidita_paziente", joinColumns = @JoinColumn(name = "paziente_id"))
    @Column(name = "comorbidita")
    @Enumerated(EnumType.STRING)
    private Set<Comorbidita> comorbidita = new HashSet<>();

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "fattori_rischio_paziente", joinColumns = @JoinColumn(name = "paziente_id"))
    @Column(name = "fattori_rischio")
    @Enumerated(EnumType.STRING)
    private Set<FattoriRischio> fattoriRischio = new HashSet<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "diabetologo_id")
    private Diabetologo diabetologo;

    @OneToMany(mappedBy = "paziente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Terapia> terapie = new ArrayList<>();

    @OneToMany(mappedBy = "paziente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RilevazioneGlicemica> rilevazioni = new ArrayList<>();


}
