package dao;

import controller.FuncionarioController;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import model.FuncionarioModel;
import view.Funcionario;

/**
 *
 * @author User
 */
public class FuncionarioDao {
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("gestaopenitenciario2023PU");
    private EntityManager em = emf.createEntityManager();    
    
    public void Gravar(FuncionarioModel funcionario){
        try{
            em.getTransaction().begin();
            em.persist(funcionario);
            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(null, "FUNCIONARIO REGISTADO");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "FUNCIONARIO NAO REGISTADO \n"+ erro);    
        }
        
    }
    
    public void actualizar(FuncionarioModel funcionario){
        try{
            em.getTransaction().begin();
            em.merge(funcionario);
            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(null, "FUNCIONARIO ACTUALIZADO");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "FUNCIONARIO NAO ACTUALIZADO \n"+ erro);    
        }
    }
    
    public List<FuncionarioModel> listar(){
        em.getTransaction().begin();
        Query consulta = em.createQuery("select funcionario from FuncionarioModel funcionario WHERE funcionario.existe = true");
        List<FuncionarioModel> lista = consulta.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return lista;
        
    }
    
    public List<FuncionarioModel> procurar(){
        em.getTransaction().begin();
        Query consulta = em.createQuery("select funcionario from FuncionarioModel funcionario WHERE funcionario.existe = true");
        List<FuncionarioModel> lista = consulta.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return lista;
    }
    
    public void eliminar(int id){
         try{
            em.getTransaction().begin();
            FuncionarioModel funcionario = em.find(FuncionarioModel.class, id);
            funcionario.setExiste(false);
            em.merge(funcionario);
            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(null, "FUNCIONARIO ELIMINADO COM SUCESSO!");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "FUNCIONARIO NAO ELIMINADO \n"+ erro);    
        }
    }
    
     public List<FuncionarioModel> listarEliminados(){
        em.getTransaction().begin();
        Query consulta = em.createQuery("select funcionario from FuncionarioModel funcionario WHERE funcionario.existe = false");
        List<FuncionarioModel> lista = consulta.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return lista;
        
    }
     
     public void restaurar(int id){
         try{
            em.getTransaction().begin();
            FuncionarioModel funcionario = em.find(FuncionarioModel.class, id);
            funcionario.setExiste(true);
            em.merge(funcionario);
            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(null, "FUNCIONARIO RESTAURADO COM SUCESSO!");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "FUNCIONARIO NAO RESTAURADO \n"+ erro);    
        }
    }
    
//    public void procurarPorId(int id){
//        FuncionarioModel c= null;
//        try{
//            c = em.find(FuncionarioModel.class, id);
//            em.close();
//            if(c!=null){
//                System.out.println(c.getAno());
//            }else{
//                System.out.println("Nao encontrado para o id " + id);
//            }
//        }catch(Exception erro){
//            System.out.println("Ocorreu um erro na procura. " + erro);
//        }
//    }
    
//    public void actualizar(FuncionarioModel funcionario){
//        try{
//            em.getTransaction().begin();
//            em.merge(funcionario);
//            em.getTransaction().commit();
//            em.close();
//            JOptionPane.showMessageDialog(null, "Actualizado com sucesso.");
//        }catch(Exception erro){
//            JOptionPane.showMessageDialog(null, "Erro ao actualizar. /n" + erro);
//        }
//    }
    
    
}
