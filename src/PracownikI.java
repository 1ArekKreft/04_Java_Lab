import java.time.LocalDate;

public interface PracownikI extends CzlowiekI
{
    long ObliczStazPracy(LocalDate rozpoczeciePracy);
    String WypiszId(int id_pracownika);
    String ObliczIleCzasuZajmujeMuDrogaDoPracy(int odleglosc);
}
