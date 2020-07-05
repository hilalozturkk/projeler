
    package veri;


    public class Kisi{
    String isim;
    String sifre;

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    public Kisi(){
        System.out.println("kişi oluşturuldu");
    }
    public boolean sifreKontrol(){
        DbKatmani dbk = new DbKatmani();
        return  dbk.kullaniciKontrol(isim,sifre);
   }
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public static void main(String args[]){
        Kisi k=new Kisi();
        k.setIsim("abc");
        k.setSifre("123");
        System.out.println(k.sifreKontrol());
        
    }
}
    

