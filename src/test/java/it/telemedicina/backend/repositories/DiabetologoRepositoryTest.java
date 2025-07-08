package it.telemedicina.backend.repositories;

import it.telemedicina.backend.domain.Diabetologo;
import jakarta.persistence.Table;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD )

public class DiabetologoRepositoryTest {
    private DiabetologoRepository underTest;

    @Autowired
    public DiabetologoRepositoryTest(DiabetologoRepository underTest) {
        this.underTest = underTest;
    }

    @Test
    public void testDiabetologoCreated() {
        Diabetologo diabetologo = new Diabetologo();

        diabetologo.setCognome("Rossi");
        diabetologo.setName("Mario");
        diabetologo.setContatto("mariorossi@gmail.com");

        Diabetologo savedDiabetologo = underTest.save(diabetologo);

        Optional<Diabetologo> risultato = underTest.findById(savedDiabetologo.getId());
        assertThat(risultato).isPresent();
        assertThat(risultato.get()).isEqualTo(diabetologo);
    }
}



