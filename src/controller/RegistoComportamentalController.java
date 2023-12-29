/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ProcessoDao;
import dao.RegistoComportamentalDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import model.ProcessoModel;
import model.RegistoComportamentalModel;

/**
 *
 * @author User
 */
public class RegistoComportamentalController {
    
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
    
    public void gravar(Object... valor){
        RegistoComportamentalDao r = new RegistoComportamentalDao();
        RegistoComportamentalModel m = new RegistoComportamentalModel();
        
        m.setIdProcesso(Integer.parseInt((String) valor[0]));
        m.setNomeProcesso((String) valor[1]);
        m.setOcorrencia((String) valor[2]);
        m.setData((String) valor[3]);
        
        r.Gravar(m);
    }
    
    public List<RegistoComportamentalModel> listar(){
        RegistoComportamentalDao v = new RegistoComportamentalDao();
        List<RegistoComportamentalModel> lista = v.listar();
        
        return lista;
    }
}
