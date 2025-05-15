/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class cadastrodeplano {
    private String nomeplano;
    private String driscricaodoplano;
    private String valormensal;
    private String taxaadesao;
    private String statusplano;

    public cadastrodeplano(String nomeplano, String driscricaodoplano, String valormensal, String taxaadesao, String statusplano) {
        this.nomeplano = nomeplano;
        this.driscricaodoplano = driscricaodoplano;
        this.valormensal = valormensal;
        this.taxaadesao = taxaadesao;
        this.statusplano = statusplano;
    }

    public String getNomeplano() {
        return nomeplano;
    }

    public void setNomeplano(String nomeplano) {
        this.nomeplano = nomeplano;
    }

    public String getDriscricaodoplano() {
        return driscricaodoplano;
    }

    public void setDriscricaodoplano(String driscricaodoplano) {
        this.driscricaodoplano = driscricaodoplano;
    }

    public String getValormensal() {
        return valormensal;
    }

    public void setValormensal(String valormensal) {
        this.valormensal = valormensal;
    }

    public String getTaxaadesao() {
        return taxaadesao;
    }

    public void setTaxaadesao(String taxaadesao) {
        this.taxaadesao = taxaadesao;
    }

    public String getStatusplano() {
        return statusplano;
    }

    public void setStatusplano(String statusplano) {
        this.statusplano = statusplano;
    }
    
    
            
}
