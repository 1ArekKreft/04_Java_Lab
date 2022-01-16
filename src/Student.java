import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Student implements StudentI
{
    int [] oceny;
    LocalDate dataNext;
    LocalDate dataLast;
    String imie;
    int rokurodzenia;

    public Student(int[] oceny, LocalDate dataNext, LocalDate dataLast, String imie, int rokurodzenia)
    {
        this.oceny = oceny;
        this.dataNext = dataNext;
        this.dataLast = dataLast;
        this.imie = imie;
        this.rokurodzenia = rokurodzenia;
    }

    public void setOceny(int[] oceny) {
        this.oceny = oceny;
    }

    public void setDataNext(LocalDate dataNext) {
        this.dataNext = dataNext;
    }

    public void setDataLast(LocalDate dataLast) {
        this.dataLast = dataLast;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setRokurodzenia(int rokurodzenia) {
        this.rokurodzenia = rokurodzenia;
    }

    public int[] getOceny() {
        return oceny;
    }

    public LocalDate getDataNext() {
        return dataNext;
    }

    public LocalDate getDataLast() {
        return dataLast;
    }

    public String getImie() {
        return imie;
    }

    public int getRokurodzenia() {
        return rokurodzenia;
    }



    public int ObliczSrednia(int[] oceny)
    {
        int sum = 0;
        for (int value : oceny)
            sum += value;

        return sum/oceny.length;
    }
    public long ObliczCzasDoNastepnegoKolosa(LocalDate dataNastepnego)
    {
        LocalDate now = LocalDate.now();
        return  ChronoUnit.DAYS.between(now, dataNastepnego);

    }
    public long ObliczCzasJakiUplynalOdOstatniejSesji(LocalDate dataOstatniej)
    {
        LocalDate now = LocalDate.now();
        return  ChronoUnit.DAYS.between(now, dataOstatniej);
    }
    public int ObliczWiek(int rokurodzenia)
    {
        return 2022-rokurodzenia;
    }
    public void Przywitaj(String imie)
    {
        System.out.print("Witaj"+imie+"!");
    }
}
