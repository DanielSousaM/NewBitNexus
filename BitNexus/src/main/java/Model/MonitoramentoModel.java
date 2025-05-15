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
private String maquina, datainicial, datafinal, horainicial, horafinal, status;

    public MonitoramentoModel(String maquina, String datainicial, String datafinal, String horainicial, String horafinal, String status) {
        this.maquina = maquina;
        this.datainicial = datainicial;
        this.datafinal = datafinal;
        this.horainicial = horainicial;
        this.horafinal = horafinal;
        this.status = status;
    }
     public MonitoramentoModel() {
         
     }  
     // método getter e setter
     // getter serve para visualizar dados
     // setter serve para inserir dados

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public String getDatainicial() {
        return datainicial;
    }

    public void setDatainicial(String datainicial) {
        this.datainicial = datainicial;
    }

    public String getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(String datafinal) {
        this.datafinal = datafinal;
    }

    public String getHorainicial() {
        return horainicial;
    }

    public void setHorainicial(String horainicial) {
        this.horainicial = horainicial;
    }

    public String getHorafinal() {
        return horafinal;
    }

    public void setHorafinal(String horafinal) {
        this.horafinal = horafinal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
     
}
