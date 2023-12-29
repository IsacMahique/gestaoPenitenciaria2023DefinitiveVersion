/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import model.RegistoComportamentalModel;

/**
 *
 * @author User
 */
public class RegistoComportamentalDao {
     private EntityManagerFactory emf= Persistence.createEntityManagerFactory("gestaopenitenciario2023PU");
    private EntityManager em = emf.createEntityManager();    
    
    public void Gravar(RegistoComportamentalModel c){
        try{
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
            em.close();
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Ocorrencia NAO REGISTADA \n"+ erro);    
        }
    }    
      
    public List<RegistoComportamentalModel> listar(){
        em.getTransaction().begin();
        Query consulta = em.createQuery("select c from RegistoComportamentalModel c");
        List<RegistoComportamentalModel> lista = consulta.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return lista;
        
    }
}
