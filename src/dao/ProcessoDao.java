package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import model.FuncionarioModel;
import model.ProcessoModel;

public class ProcessoDao {
    
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("gestaopenitenciario2023PU");
    private EntityManager em = emf.createEntityManager();    
    
    public void Gravar(ProcessoModel processo){
        try{
            em.getTransaction().begin();
            em.persist(processo);
            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(null, "Processo REGISTADO");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Processo NAO REGISTADO \n"+ erro);    
        }
        
    }
    public List<ProcessoModel> listar(){
        em.getTransaction().begin();
        Query consulta = em.createQuery("select processo from ProcessoModel processo WHERE processo.existe = true");
        List<ProcessoModel> lista = consulta.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return lista;
        
    }
    
    public void eliminar(ProcessoModel Processo){
       try{
            em.getTransaction().begin();
            em.merge(Processo);
            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(null, "Processo Eliminado");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Processo NAO Eliminado \n"+ erro);    
        }
    }
    
    public void actualizar(ProcessoModel Processo){
        try{
            em.getTransaction().begin();
            em.merge(Processo);
            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(null, "Processo Actualizado!");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Processo NAO Actualizado \n"+ erro);    
        }
    }
    
    public List<ProcessoModel> listarEliminados(){
        em.getTransaction().begin();
        Query consulta = em.createQuery("select processo from ProcessoModel processo WHERE processo.existe = false");
        List<ProcessoModel> lista = consulta.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return lista;
        
    }
    
    public void restaurar(int id){
         try{
            em.getTransaction().begin();
            ProcessoModel processo = em.find(ProcessoModel.class, id);
            processo.setExiste(true);
            em.merge(processo);
            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(null, "Processo RESTAURADO COM SUCESSO!");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Processo NAO RESTAURADO \n"+ erro);    
        }
    }
    
    public List<ProcessoModel> relatorio(){
        em.getTransaction().begin();
        Query consulta = em.createQuery("select processo from ProcessoModel processo");
        List<ProcessoModel> lista = consulta.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return lista;
        
    }
    
    public List<ProcessoModel> procuraVisita(String nome){
        em.getTransaction().begin();
            TypedQuery<ProcessoModel> query = em.createQuery("select V from ProcessoModel V WHERE v.nomeCompleto = :nome", ProcessoModel.class);
            query.setParameter("nome", nome);
            
            List<ProcessoModel> resultados = query.getResultList();
            em.getTransaction().commit();
            em.close();
            return resultados;
    }
    
}
