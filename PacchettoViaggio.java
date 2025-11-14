import java.util.Date;

public abstract class PacchettoViaggio {

    private Date dataInizioViaggio;
    private Date dataFineViaggio;
    private double costoBase;
    String viaggio;
    PacchettoViaggio tipoDiViaggio;
    private Date dataRicorrenza;
    private int numeroMinori;

    public void setDataInizioViaggio(Date dataInizioViaggio) {
        this.dataInizioViaggio = dataInizioViaggio;
    }

    public Date getDataInizioViaggio() {
        return dataInizioViaggio;
    }

    public void setDataFineViaggio(Date dataFineViaggio) {
        this.dataFineViaggio = dataFineViaggio;
    }

    public Date getDataFineViaggio() {
        return dataFineViaggio;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public PacchettoViaggio(Date dataInizioViaggio, Date dataFineViaggio, String viaggio){
        this.dataInizioViaggio = dataInizioViaggio;
        this.dataFineViaggio = dataFineViaggio;
        this.viaggio = viaggio;

        switch (viaggio) {
            case "Familiare":
                tipoDiViaggio = new PacchettoFamiliare(dataInizioViaggio, dataFineViaggio, int numeroMinori);
                break;

            case "Romantico":
                tipoDiViaggio = new PacchettoRomantico(dataInizioViaggio, dataFineViaggio, Date dataRicorrenza);
                break;

            case "Lavoro":
                tipoDiViaggio = new PacchettoLavoro(dataInizioViaggio, dataFineViaggio);
                break;

            default:
                tipoDiViaggio = null;
                break;
        }
    }

    public boolean equals(PacchettoViaggio pacchettoViaggioCOnfrontato) {
        return dataInizioViaggio == pacchettoViaggioCOnfrontato.dataInizioViaggio && dataFineViaggio == pacchettoViaggioCOnfrontato.dataFineViaggio;
    }

    public String toString() {
        return "[La data di inizio del viaggio è: " + dataInizioViaggio + ", mentre la data di fine del viagio è: " + dataFineViaggio + "]";
    }
}
