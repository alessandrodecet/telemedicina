package it.telemedicina.backend;

import it.telemedicina.backend.domain.Diabetologo;
import it.telemedicina.backend.domain.Paziente;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class TestDataUtil {
    private TestDataUtil() {}

    //Funzione che crea Diabetologo
    public static Diabetologo createTestDiabetologo() {
        return Diabetologo.builder()
                .nome("Mario")
                .cognome("Rossi")
                .contatto("mariorossi@gmail.com")
                .build();
    }

    //Funzione che crea un Paziente
    public static Paziente createTestPaziente(Diabetologo doc) {
        return Paziente.builder()
                .nome("Eugenio")
                .cognome("Filos")
                .diabetologo(doc)
                .dataNascita(LocalDate.of(2001,11,10))
                .build();
    }
}
