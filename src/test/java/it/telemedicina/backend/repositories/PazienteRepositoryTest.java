package it.telemedicina.backend.repositories;

import it.telemedicina.backend.TestDataUtil;
import it.telemedicina.backend.domain.Diabetologo;
import it.telemedicina.backend.domain.Paziente;
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
public class PazienteRepositoryTest {

    private final PazienteRepository underTest;

    @Autowired
    public PazienteRepositoryTest(PazienteRepository underTest) {
        this.underTest = underTest;
    }

    @Test
    //Test per creare un paziente e un diabetologo associato, verificarne l'inserimento e la lettura
    public void testThatPazienteCreated(){
        Diabetologo diabetologo = TestDataUtil.createTestDiabetologo();
        Paziente paziente = TestDataUtil.createTestPaziente(diabetologo);
        underTest.save(paziente);
        Optional<Paziente> risultato = underTest.findById(paziente.getId());
        assertThat(risultato).isPresent();
        assertThat(risultato.get().getNome()).isEqualTo(paziente.getNome());

    }
}
