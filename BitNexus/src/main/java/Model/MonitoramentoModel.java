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
private int idMAQUINAS;
private String nomeMaquinas;
private String tipoMaquina;

    public MonitoramentoModel(int idMAQUINAS, String nomeMaquinas, String tipoMaquina) {
        this.idMAQUINAS = idMAQUINAS;
        this.nomeMaquinas = nomeMaquinas;
        this.tipoMaquina = tipoMaquina;
    }

   
     public MonitoramentoModel() {
         
     }  
     // método getter e setter
     // getter serve para visualizar dados
     // setter serve para inserir dados

    public int getIdMAQUINAS() {
        return idMAQUINAS;
    }

    public void setIdMAQUINAS(int idMAQUINAS) {
        this.idMAQUINAS = idMAQUINAS;
    }

    public String getNomeMaquinas() {
        return nomeMaquinas;
    }

    public void setNomeMaquinas(String nomeMaquinas) {
        this.nomeMaquinas = nomeMaquinas;
    }

    public String getTipoMaquina() {
        return tipoMaquina;
    }

    public void setTipoMaquina(String tipoMaquina) {
        this.tipoMaquina = tipoMaquina;
    }

  
     
}
