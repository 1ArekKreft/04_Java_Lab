import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pracownik implements PracownikI
{
    LocalDate rozpoczeciePracy;
    int id_pracownika;
    int odleglosc;
    int rokurodzenia;
    String imie;

    public Pracownik(LocalDate rozpoczeciePracy, int id_pracownika, int odleglosc, int rokurodzenia, String imie)
    {
        this.rozpoczeciePracy = rozpoczeciePracy;
        this.id_pracownika = id_pracownika;
        this.odleglosc = odleglosc;
        this.rokurodzenia = rokurodzenia;
        this.imie = imie;
    }

    public LocalDate getRozpoczeciePracy() {
        return rozpoczeciePracy;
    }

    public int getId_pracownika() {
        return id_pracownika;
    }

    public int getOdleglosc() {
        return odleglosc;
    }

    public int getRokurodzenia() {
        return rokurodzenia;
    }

    public String getImie() {
        return imie;
    }

    public void setRozpoczeciePracy(LocalDate rozpoczeciePracy) {
        this.rozpoczeciePracy = rozpoczeciePracy;
    }

    public void setId_pracownika(int id_pracownika) {
        this.id_pracownika = id_pracownika;
    }

    public void setOdleglosc(int odleglosc) {
        this.odleglosc = odleglosc;
    }

    public void setRokurodzenia(int rokurodzenia) {
        this.rokurodzenia = rokurodzenia;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public long ObliczStazPracy(LocalDate rozpoczeciePracy)
    {
        LocalDate now = LocalDate.now();
        return  ChronoUnit.DAYS.between(now, rozpoczeciePracy);
    }
    public String WypiszId(int id_pracownika)
    {
        return "Id pracownika to: "+id_pracownika;
    }
    public String ObliczIleCzasuZajmujeMuDrogaDoPracy(int odleglosc)
    {
        double czas = odleglosc/6;
        return "Srednio przejscie drogi do pracy pieszo zajmie pracownikowi: "+odleglosc+" godziny";
    }
    public int ObliczWiek(int rokurodzenia)
    {
        return 2022-rokurodzenia;
    }
    public void Przywitaj(String imie)
    {
        System.out.print("Hej "+imie+"!");
    }
}
