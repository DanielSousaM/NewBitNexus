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
    private int idPLANOS;
    private String nomePlano;
    private String driscricaoplano;
    private String valorPlano;
    private String taxaPlano;
    private String statusPlano;

    public cadastrodeplano(int idPLANOS, String nomePlano, String driscricaoplano, String valorPlano, String taxaPlano, String statusPlano) {
        this.idPLANOS = idPLANOS;
        this.nomePlano = nomePlano;
        this.driscricaoplano = driscricaoplano;
        this.valorPlano = valorPlano;
        this.taxaPlano = taxaPlano;
        this.statusPlano = statusPlano;
    }

    

    
    public cadastrodeplano(){
        
    }

    public int getIdPLANOS() {
        return idPLANOS;
    }

    public void setIdPLANOS(int idPLANOS) {
        this.idPLANOS = idPLANOS;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public String getDriscricaoplano() {
        return driscricaoplano;
    }

    public void setDriscricaoplano(String driscricaoplano) {
        this.driscricaoplano = driscricaoplano;
    }

    public String getValorPlano() {
        return valorPlano;
    }

    public void setValorPlano(String valorPlano) {
        this.valorPlano = valorPlano;
    }

    public String getTaxaPlano() {
        return taxaPlano;
    }

    public void setTaxaPlano(String taxaPlano) {
        this.taxaPlano = taxaPlano;
    }

    public String getStatusPlano() {
        return statusPlano;
    }

    public void setStatusPlano(String statusPlano) {
        this.statusPlano = statusPlano;
    }

    

    
    
    
            
}
