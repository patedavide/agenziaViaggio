import java.util.Calendar;
import java.util.Date;

public class PacchettoRomantico extends PacchettoViaggio{

    private Date dataRicorrenza;
    private Date dataInzio;
    private Date dataFine;
    private double costoFinale;

    public PacchettoRomantico(Date dataInzio, Date dataFine,Date dataRicorrenza){
        this.dataInzio = dataInzio;
        this.dataFine = dataFine;
        this.dataRicorrenza = dataRicorrenza;
    }

    public void setDataRicorrenza(Date dataRicorrenza) {
        this.dataRicorrenza = dataRicorrenza;
    }

    public Date getDataRicorrenza(){
        return dataRicorrenza;
    }

    public double calcolaCosto(){
        double costoBase = getCostoBase();

        long dataInizio = getDataInizioViaggio().getTime();
        long dataFine = getDataFineViaggio().getTime();
        long ricorrenza = getDataRicorrenza().getTime();

        if(ricorrenza >= dataInizio && ricorrenza <= dataFine){
            costoFinale = costoBase/2;
        }

        return costoFinale;
    }

    public boolean equals(PacchettoRomantico pacchettoViaggioConfrontato) {
        return pacchettoViaggioConfrontato.costoFinale == costoFinale;
    }

    public String toString() {
        return "[Il viaggio romantico è il giorno: " + dataRicorrenza + " e il suo costo è di: "+ costoFinale + "]";
    }
}
