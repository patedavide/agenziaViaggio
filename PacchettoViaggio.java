import java.util.Date;

public class PacchettoViaggio {

    private Date dataInizioViaggio;
    private Date dataFineViaggio;
    private double costoBase;
    String viaggio;
    PacchettoViaggio tipoDiViaggio;

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
        dataInizioViaggio = this.dataInizioViaggio;
        dataFineViaggio = this.dataFineViaggio;
        viaggio = this.viaggio;

        switch (viaggio) {
            case "Familiare":
                tipoDiViaggio = new PacchettoFamiliare();
                break;

            case "Romantico":
                tipoDiViaggio = new PacchettoRomantico();
                break;

            case "Lavoro":
                tipoDiViaggio = new PacchettoLavoro();
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
