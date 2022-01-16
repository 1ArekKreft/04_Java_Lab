import java.time.LocalDate;

public interface StudentI extends CzlowiekI
{
    public int ObliczSrednia(int[] oceny);
    public long ObliczCzasDoNastepnegoKolosa(LocalDate dataNastepnego);
    public long ObliczCzasJakiUplynalOdOstatniejSesji(LocalDate dataOstatniej);
}
