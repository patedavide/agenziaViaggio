import java.util.Date;

public class PacchettoLavoro extends PacchettoViaggio{

    private int numeroPasti;
    private Date dataInizio;
    private Date dataFine;
    private double costoFinale;

    public PacchettoFamiliare(Date dataInizio, Date dataFine, int numeroPasti){
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.numeroPasti = numeroPasti;
    }

    public int getNumeroPasti() {
        return numeroPasti;
    }

    public void setNumeroPasti(int numeroPasti) {
        this.numeroPasti = numeroPasti;
    }

    public double calcolaCosto(){
        double costoBase = getCostoBase();

        costoFinale = costoBase * (numeroPasti*(15/100));

    }
}
