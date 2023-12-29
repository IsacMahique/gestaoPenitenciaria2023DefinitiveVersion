package controller;

import dao.FuncionarioDao;
import java.util.List;
import javax.swing.JOptionPane;
import model.FuncionarioModel;
import view.Funcionario;
import view.ListagemFuncionario;

/**
 *
 * @author User
 */
public class FuncionarioController {
    FuncionarioModel f = new FuncionarioModel();
    FuncionarioDao d = new FuncionarioDao();
    
    public FuncionarioController(){
        
    }
    public List<FuncionarioModel> listar(){
        FuncionarioDao d = new FuncionarioDao();
       List<FuncionarioModel> lista = d.listar();
       return lista;
    }
    
     /*
    
    */
    
    public FuncionarioController(Object... valor){
        f.setId((int) valor[0]);
        f.setNomeCompleto((String) valor[1]);
        f.setNumeroBi((String) valor[2]);
        f.setContacto((String) valor[3]);
        f.setNacionalidade((String) valor[4]);
        f.setLocalResidencia((String) valor[5]);
        f.setGenero((String) valor[6]);
        f.setDataDeNascimento((String) valor[7]);
        f.setEstadoCivil((String) valor[8]);
        f.setCategoria((String) valor[9]);
        f.setSenha((String) valor[10]);
        f.setEmail((String) valor[11]);
        f.setExiste(true);
        
        d.Gravar(f);
    }
     public FuncionarioController(String s, int nivel){
         if(s.equals("listar")){
            ListagemFuncionario fL = new ListagemFuncionario();
            fL.setNivel(nivel);
            
         }
     }
     
      /*
    
    */
     
     public void actualizar(Object... valor){
        FuncionarioModel fA = new FuncionarioModel();
        FuncionarioDao dA = new FuncionarioDao();
        
        
        fA.setId(Integer.parseInt((String) valor[0]));
        fA.setNomeCompleto((String) valor[1]);
        fA.setNumeroBi((String) valor[2]);
        fA.setGenero((String) valor[3]);
        fA.setDataDeNascimento((String) valor[4]);
        fA.setNacionalidade((String) valor[5]);
        fA.setLocalResidencia((String) valor[6]);
        fA.setEstadoCivil((String) valor[7]);
        fA.setCategoria((String) valor[8]);
        fA.setSenha((String) valor[9]);
        fA.setContacto((String) valor[10]);
        fA.setEmail((String) valor[11]);
        fA.setExiste(true);
        
        dA.actualizar(fA);
     }
     
     public void eliminar(int id){
         FuncionarioDao dE = new FuncionarioDao();
         dE.eliminar(id);
     }
     
     public List<FuncionarioModel> listarEliminados(){
        FuncionarioDao d = new FuncionarioDao();
       List<FuncionarioModel> lista = d.listarEliminados();
       return lista;
    }
     
     public void restaurar(int id){
         FuncionarioDao dE = new FuncionarioDao();
         dE.restaurar(id);
     }
     
}
