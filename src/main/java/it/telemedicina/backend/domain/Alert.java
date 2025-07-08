package it.telemedicina.backend.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "alerts")
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alert_seq_id")
    private Long id;

    private Date date;
}
