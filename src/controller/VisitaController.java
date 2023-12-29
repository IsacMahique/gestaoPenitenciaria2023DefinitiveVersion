package controller;

import dao.ProcessoDao;
import dao.VisitaDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.ProcessoModel;
import model.VisitaModel;

/**
 *
 * @author Kito Mahique
 */
public class VisitaController {
    
    public List<ProcessoModel> procura(String nome){
        ProcessoDao p = new ProcessoDao();
        List<ProcessoModel> resultado = p.procuraVisita(nome);
        
        return resultado;
    }
    
     /*
    
    */
    
    public String data(){
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        String dataFormatada = formatar.format(data);
        /*
        y ano
        M mes do ano
        D dia do ano
        d dia do mes
        H hora do dia
        h hora am/pm
        m minuto da hora
        s segundos do minuto
        S milisegundos
        */
        
        return dataFormatada;
    }
    
    /*
    
    */
    public void gravar(Object... valor){
        VisitaDao v = new VisitaDao();
        VisitaModel m = new VisitaModel();
        
        m.setIdProcesso(Integer.parseInt((String) valor[0]));
        m.setNomeProcesso((String) valor[1]);
        m.setNomeVisitantes((String) valor[2]);
        m.setParentesco((String) valor[3]);
        m.setData((String) valor[4]);
        
        v.Gravar(m);
    }
    
    public List<VisitaModel> listar(){
        VisitaDao v = new VisitaDao();
        List<VisitaModel> lista = v.listar();
        
        return lista;
    }
    
}
