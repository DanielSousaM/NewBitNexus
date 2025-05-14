/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class RelatorioModel {
    String maquina, datainicial, datafinal, horainicial, horafinal, status;

    public RelatorioModel(String maquina, String datainicial, String datafinal, String horainicial, String horafinal, String status) {
        this.maquina = maquina;
        this.datainicial = datainicial;
        this.datafinal = datafinal;
        this.horainicial = horainicial;
        this.horafinal = horafinal;
        this.status = status;
    }
    public RelatorioModel(){
        
    }  
}