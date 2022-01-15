class Dom implements Budynek
{
    public Dom(double pow, String adres, int okna, int mieszkancy, KolorEnum kolor, String imie, String nazwisko )
    {
        this.adresBudynku(adres);
    }

    public double powierzchnia(double pow)
    {
        return 105.4;
    }
    public String adresBudynku(String adres)
    {
        return adres;
    }
    public int liczbaOkien(int okna)
    {
        return 14;
    }
    public void liczbaMieszkancow(int mieszkancy)
    {
        System.out.print(mieszkancy);
    }
    public void kolorDomu(KolorEnum kolor)
    {
        System.out.print(kolor);
    }
    public String DaneWlasciciela(String imie, String nazwisko)
    {
        return imie + " " + nazwisko;
    }



    @Override
    public String toString() {
        return "Dom ";
    }
}
