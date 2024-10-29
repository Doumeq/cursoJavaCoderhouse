package com.tuhotel.dao;

import com.tuhotel.modelo.Huesped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class HuespedDAO {
    private EntityManager em;

    public HuespedDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadDePersistencia");
        em = emf.createEntityManager();
    }

    public void agregarHuesped(Huesped huesped) {
        em.getTransaction().begin();
        em.persist(huesped);
        em.getTransaction().commit();
    }

    public void actualizarHuesped(Huesped huesped) {
        em.getTransaction().begin();
        em.merge(huesped);
        em.getTransaction().commit();
    }

    public void eliminarHuesped(Long id) {
        em.getTransaction().begin();
        Huesped huesped = em.find(Huesped.class, id);
        if (huesped != null) {
            em.remove(huesped);
        }
        em.getTransaction().commit();
    }

    public Huesped obtenerHuespedPorId(Long id) {
        return em.find(Huesped.class, id);
    }

    public List<Huesped> obtenerTodosLosHuespedes() {
        return em.createQuery("SELECT h FROM Huesped h", Huesped.class).getResultList();
    }
}
