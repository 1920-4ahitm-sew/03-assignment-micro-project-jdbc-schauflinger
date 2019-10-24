package at.htl.flughafense.model;

import at.htl.fluaghafense.model.Flug;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class FlugTest {
    static EntityManager em;

    @BeforeAll
    private static void init() {
        em = Persistence
                .createEntityManagerFactory("myPU")
                .createEntityManager();
    }

    @Test
    void test01DatabaseConnection() {
        Flug susi = new Flug("AUA", "Maier", "Linz", "Hörsching");
        em.getTransaction().begin();
        em.persist(susi);
        susi.setPilot("Huber");
        em.getTransaction().commit();
    }

    @Test
    void test02readOneVehicle() {
        Flug susi = em.find(Flug.class, 1L);
        assertThat(susi.getFluglinie(), is("AUA"));
        assertThat(susi.getPilot(), is("Maier"));
    }
}
