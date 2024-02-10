package banco;

 
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAOGenerico<T extends Serializable> {

    private final EntityManagerFactory emf;
    private final EntityManager em;

    public DAOGenerico() {

        emf = Persistence.createEntityManagerFactory("TecnoKPU");
        em = emf.createEntityManager();

    }

    private Class<T> clazz;

    public final void setClazz(final Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    public T select(final long id) {
        return em.find(clazz, id);
    }

    public List<T> selectAll() {
        return em.createQuery("from " + clazz.getName()).getResultList();
    }

    public T create(final T entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();

        return entity;
    }

    public T update(final T entity) {
        em.getTransaction().begin();
        T obj = em.merge(entity);
        em.getTransaction().commit();

        return obj;
    }

    public void delete(final T entity) {
        em.getTransaction().begin();
        em.remove(entity);
        em.getTransaction().commit();

    }

    public void deleteById(final long entityId) {
        final T entity = select(entityId);
        delete(entity);
    }
}