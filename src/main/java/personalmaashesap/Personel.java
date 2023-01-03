package personalmaashesap;

/*
1. Personel ve yönetim adinda 2 class olsun
2.Yönetim hesabindan yapilan girisle (isim,maas,aylik calisma suresi,ise giris tarihi ) yapilsin
3.vergi hesaplansin(2000 € dan fazla maas aliyorsa %10 vergi)
4.30 saatten fazla calisirsa saat basi 30€ prim hesaplansin
5.10 yildan fayzla calisiyorsa %5
10 ile 20 yil arasi %10
20 yil uzeri %15 kidem primi alsin
6.Yönetim hesabindan yapilan girisle
a)kisinin odemesi gereken vergi
b)prim tutari
c)kidem parasi
d)net maasini gorelim
 */
public class Personel {
    public Personel() {
    }

    private String isim;
    private int maas;
    private int calismasaati;
    private int isegirisyil;

    //constructor

    public Personel(String isim, int maas, int calismasaati, int isegirisyil) {
        this.isim = isim;
        this.maas = maas;
        this.calismasaati = calismasaati;
        this.isegirisyil = isegirisyil;
    }

    //getter setter

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getCalismasaati() {
        return calismasaati;
    }

    public void setCalismasaati(int calismasaati) {
        this.calismasaati = calismasaati;
    }

    public int getIsegirisyil() {
        return isegirisyil;
    }

    public void setIsegirisyil(int isegirisyil) {
        this.isegirisyil = isegirisyil;
    }

//3.vergi hesaplansin(2000 € dan fazla maas aliyorsa %10 vergi)
    //vergi hesaplayan metod
    public double vergiHesapla(double maas){
        if (maas>2000){return maas*0.1;}else return 0;
    }
    //4.30 saatten fazla calisirsa saat basi 30€ prim hesaplansin
    public double primHesapla(int saat){
        if (saat>30){return (saat-30)*30;}return 0;
    }
    //5.10 yildan fayzla calisiyorsa %5
   // 10 ile 20 yil arasi %10
       //     20 yil uzeri %15 kidem primi alsin
    public double kidemPrim(int yil){
        int calYil=2023-yil;
        if (calYil>5){return 0.05*maas;} else if (calYil>10&&calYil<20) {return maas*0.1;
            
        } else if (calYil>19) {return maas*0.15;
            
        }else return 0;
        /*
        * 6.Yönetim hesabindan yapilan girisle
a)kisinin odemesi gereken vergi
b)prim tutari
c)kidem parasi
d)net maasini gorelim*/
    }public void netMaasGöster(){
        System.out.println("Ödenmesi gereken vergi tutari : "+ vergiHesapla(maas));
        System.out.println("Alinmasi  gereken Prim tutari : "+ primHesapla(calismasaati));
        System.out.println("Alinacak kidem  tutari : "+ kidemPrim(isegirisyil));
        System.out.println("Personele ödenecek Net maas  : "+(maas+primHesapla(calismasaati)+kidemPrim(isegirisyil)-vergiHesapla(maas)));
    }
    public  void keyfi(){
        int maas=2345;
        System.out.println(maas);
    }
}