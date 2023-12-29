package controller;

import dao.ProcessoDao;
import java.util.List;
import javax.swing.JOptionPane;
import model.ProcessoModel;
import view.RelatorioGeral;

public class ProcessoController {
    
    List<ProcessoModel> lista;
    
     /*
    
    */
    
    public void gravar(Object... valor){
        
        ProcessoModel p = new ProcessoModel();
        ProcessoDao d = new ProcessoDao();
        
        p.setId(0);
        p.setNomeCompleto((String) valor[0]);
        p.setNumeroBi((String) valor[1]);
        p.setNaturalidade((String) valor[2]);
        p.setNacionalidade((String) valor[3]);
        p.setLocalResidencia((String) valor[4]);
        p.setGenero((String) valor[5]);
        p.setDataDeNascimento((String) valor[6]);
        p.setDoenca((String) valor[7]);
        if("".equals(valor[8])){
            p.setNomeDoenca("nenhum");
        }else{
            p.setNomeDoenca((String) valor[8]);
        }
        if("".equals(valor[9])){
            p.setCuidadosBasicos("nenhum");
        }else{
             p.setCuidadosBasicos((String) valor[9]);
        }
        
        p.setAntecedentesCriminais((String) valor[10]);
        if("".equals(valor[11])){
            p.setCrimesCometidos("nenhum");
        }else{
            p.setCrimesCometidos((String) valor[11]);
        }
        p.setExiste(true);
        
        d.Gravar(p);

    }
    
     /*
    
    */
    
    public static List<ProcessoModel> listar(){
        ProcessoDao d = new ProcessoDao();
       List<ProcessoModel> lista = d.listar();
       return lista;
    }
    
     /*
    
    */
        
    public void eliminar(int id){
        
        ProcessoDao d = new ProcessoDao();
        ProcessoController pc= new ProcessoController();
        ProcessoModel m = new ProcessoModel();
        
        lista = pc.listar();
        
            for(int i=0; i<lista.size(); i++){
                if(id==lista.get(i).getId()){
        
       m.setId(id);
                m.setNomeCompleto(lista.get(i).getNomeCompleto());
                m.setNumeroBi(lista.get(i).getNumeroBi());
                m.setNaturalidade(lista.get(i).getNaturalidade());
                m.setNacionalidade(lista.get(i).getNacionalidade());
                m.setLocalResidencia(lista.get(i).getLocalResidencia());
                m.setGenero(lista.get(i).getGenero());
                m.setDataDeNascimento(lista.get(i).getDataDeNascimento());
                m.setDoenca(lista.get(i).getDoenca());
                m.setNomeDoenca(lista.get(i).getNomeDoenca());
                m.setCuidadosBasicos(lista.get(i).getCuidadosBasicos());
                m.setAntecedentesCriminais(lista.get(i).getAntecedentesCriminais());
                m.setCrimesCometidos(lista.get(i).getCrimesCometidos());
                m.setExiste(false);
                 d.eliminar(m);
                }
            }
    }
    
     /*
    
    */
    
    public void actualizar(Object... valor){
        ProcessoModel pA = new ProcessoModel();
        ProcessoDao dA = new ProcessoDao();
        
        pA.setId( Integer.parseInt((String) valor[0]));
        pA.setNomeCompleto((String) valor[1]);
        pA.setNumeroBi((String) valor[2]);
        pA.setNaturalidade((String) valor[3]);
        pA.setNacionalidade((String) valor[4]);
        pA.setLocalResidencia((String) valor[5]);
        pA.setGenero((String) valor[6]);
        pA.setDataDeNascimento((String) valor[7]);
        pA.setDoenca((String) valor[8]);
        if("".equals(valor[9])){
            pA.setNomeDoenca("nenhum");
        }else{
            pA.setNomeDoenca((String) valor[9]);
        }
        if("".equals(valor[10])){
            pA.setCuidadosBasicos("nenhum");
        }else{
             pA.setCuidadosBasicos((String) valor[10]);
        }
        
        pA.setAntecedentesCriminais((String) valor[11]);
        if("".equals(valor[12])){
            pA.setCrimesCometidos("nenhum");
        }else{
            pA.setCrimesCometidos((String) valor[12]);
        }
        pA.setExiste(true);
        
        dA.actualizar(pA);
    }
    
    public List<ProcessoModel> listarEliminados(){
        ProcessoDao d = new ProcessoDao();
       List<ProcessoModel> lista = d.listarEliminados();
       return lista;
    }
    
    public void restaurar(int id){
         ProcessoDao dE = new ProcessoDao();
         dE.restaurar(id);
     }
    
    public void relatorio(int nivel){
        int masculino=0;
        int feminino=0;
        int problemaSaude = 0;
        int antecedentes = 0;
        
       ProcessoDao dRelatorio = new ProcessoDao();
       List<ProcessoModel> listaRelatorio = dRelatorio.relatorio();
       
       for(int i=0; i<listaRelatorio.size(); i++){
           if(listaRelatorio.get(i).getGenero().equalsIgnoreCase("masculino")){
               masculino++;
           }
           if(listaRelatorio.get(i).getGenero().equalsIgnoreCase("feminino")){
               feminino++;
           }
           if(listaRelatorio.get(i).getDoenca().equalsIgnoreCase("sim")){
               problemaSaude++;
           }
           if(listaRelatorio.get(i).getAntecedentesCriminais().equalsIgnoreCase("nao")){
               antecedentes++;
           }
           
       }
            ProcessoDao dR = new ProcessoDao();
            List<ProcessoModel> listaR = dR.listar();
            int activos = listaR.size();
            int total = masculino + feminino;
            RelatorioGeral r = new RelatorioGeral(masculino, feminino, total, 
           problemaSaude, antecedentes, activos);
           r.setNivel(nivel);
       
    }
}
