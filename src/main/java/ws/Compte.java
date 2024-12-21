package ws;

import java.util.Date;

public class Compte {

    private int Code;
    private double Solde;
    private Date dateCreation;

    public Compte() {
    }

    public Compte( int code , double solde,Date dateCreation) {
        Solde = solde;
        Code = code;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public double getSolde() {
        return Solde;
    }

    public void setSolde(double solde) {
        Solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
