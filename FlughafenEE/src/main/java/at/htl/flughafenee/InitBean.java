package at.htl.flughafenee;

import at.htl.flughafenee.model.Flug;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class InitBean {
    @PersistenceContext
    EntityManager em;

    public void init(@Observes @Initialized(ApplicationScoped.class) Object init){
        System.out.println("IT WORKS!");
        Flug abreisend = new Flug("AUA", "Maier", "Hörsching", "Hörsching");
        Flug ankommend = new Flug("AUA", "Maier", "Mallorca","Hörching");
        em.persist(ankommend);
        em.persist(abreisend);
    }
}
