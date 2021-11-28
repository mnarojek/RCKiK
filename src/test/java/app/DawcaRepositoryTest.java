package app;

import app.dawca.Dawca;
import app.dawca.DawcaRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class DawcaRepositoryTest {

    @Autowired private DawcaRepository repo;

    @Test
    public void testAddNew(){
        Dawca dawca = new Dawca();
        dawca.setPESEL("96052312477");
        dawca.setName("Mateusz");
        dawca.setLastname("Narojek");
        dawca.setSex("M");

        Dawca zapisanyDawca = repo.save(dawca);

        Assertions.assertThat(zapisanyDawca).isNotNull();
        Assertions.assertThat(zapisanyDawca.getId()).isGreaterThan(0);
    }
}
