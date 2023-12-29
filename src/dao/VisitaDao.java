package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import model.VisitaModel;

public class VisitaDao {
     private EntityManagerFactory emf= Persistence.createEntityManagerFactory("gestaopenitenciario2023PU");
    private EntityManager em = emf.createEntityManager();    
    
    public void Gravar(VisitaModel visita){
        try{
            em.getTransaction().begin();
            em.persist(visita);
            em.getTransaction().commit();
            em.close();
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "VISITA NAO REGISTADA \n"+ erro);    
        }
    }    
      
    public List<VisitaModel> listar(){
        em.getTransaction().begin();
        Query consulta = em.createQuery("select visita from VisitaModel visita");
        List<VisitaModel> lista = consulta.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return lista;
        
    }
        
}
