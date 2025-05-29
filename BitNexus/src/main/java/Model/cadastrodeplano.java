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
    private String nomeplano;
    private String descricaoPlano;
    private String valorPlano;
    private String taxaPlano;
    private String statusplano;

    public cadastrodeplano(int idPLANOS, String nomeplano, String descricaoPlano, String valorPlano, String taxaPlano, String statusplano) {
        this.idPLANOS = idPLANOS;
        this.nomeplano = nomeplano;
        this.descricaoPlano = descricaoPlano;
        this.valorPlano = valorPlano;
        this.taxaPlano = taxaPlano;
        this.statusplano = statusplano;
    }

   
    public cadastrodeplano() {
    }

    public int getIdPLANOS() {
        return idPLANOS;
    }

    public void setIdPLANOS(int idPLANOS) {
        this.idPLANOS = idPLANOS;
    }

    public String getNomeplano() {
        return nomeplano;
    }

    public void setNomeplano(String nomeplano) {
        this.nomeplano = nomeplano;
    }

    public String getDescricaoPlano() {
        return descricaoPlano;
    }

    public void setDescricaoPlano(String descricaoPlano) {
        this.descricaoPlano = descricaoPlano;
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

    public String getStatusplano() {
        return statusplano;
    }

    public void setStatusplano(String statusplano) {
        this.statusplano = statusplano;
    }

   
    
    
            
}
