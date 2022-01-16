public class Kwadrat extends Figura
{
    int dlugosc_podstawy, wysokosc;

    public Kwadrat(int dlugosc_podstawy, int wysokosc)
    {
        this.dlugosc_podstawy = dlugosc_podstawy;
        this.wysokosc = wysokosc;
    }

    @Override
    public int Pole()
    {
        return wysokosc*dlugosc_podstawy;
    }

    @Override
    public int Obwod()
    {
        return (2*wysokosc) + (2*dlugosc_podstawy);
    }
}
