/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class MonitoramentoModel {
// cadeia - String 
// inteiro - int 
// real - float ou double
// logico - boolean 
// datas - Dates
private int idMAQUINA;
    private String nomeMaquina, tipoMaquina;

    public MonitoramentoModel(int idMAQUINA, String nomeMaquina, String tipoMaquina) {
        this.idMAQUINA = idMAQUINA;
        this.nomeMaquina = nomeMaquina;
        this.tipoMaquina = tipoMaquina;
    }

  

    
     public MonitoramentoModel() {
         
     }  
     // método getter e setter
     // getter serve para visualizar dados
     // setter serve para inserir dados

    public int getIdMAQUINA() {
        return idMAQUINA;
    }

    public void setIdMAQUINA(int idMAQUINA) {
        this.idMAQUINA = idMAQUINA;
    }

    public String getNomeMaquina() {
        return nomeMaquina;
    }

    public void setNomeMaquina(String nomeMaquina) {
        this.nomeMaquina = nomeMaquina;
    }

    public String getTipoMaquina() {
        return tipoMaquina;
    }

    public void setTipoMaquina(String tipoMaquina) {
        this.tipoMaquina = tipoMaquina;
    }

   
     
}
