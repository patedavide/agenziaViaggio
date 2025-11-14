import java.util.Date;

public class PacchettoFamiliare extends PacchettoViaggio{

    private int numeroMinori;
    private Date dataInizio;
    private Date dataFine;
    private double costoFinale;

    public PacchettoFamiliare(Date dataInizio, Date dataFine, int numeroMinori){
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.numeroMinori = numeroMinori;
    }

    public int getNumeroMinori() {
        return numeroMinori;
    }

    public void setNumeroMinori(int numeroMinori) {
        this.numeroMinori = numeroMinori;
    }

    public double calcolaCosto(){
        double costoBase = getCostoBase();

        if(numeroMinori >0){
            if(numeroMinori == 1){
                costoFinale = costoBase - 25;
            } else if (numeroMinori > 1) {
                costoFinale = costoBase - 35;
            }
            return costoFinale;
        }

    }

    public boolean equals(PacchettoFamiliare pacchettoFamiliareCOnfrontato) {
        return pacchettoFamiliareCOnfrontato.costoFinale == costoFinale;
    }

    public String toString() {
        return "[Il viaggio familiare costa è di: "+ costoFinale + "]";
    }
}
