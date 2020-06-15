
public class urun {
private int id;
private String kategori;
private String urunİsmi;
private String stokSayisi;
private String fiyat;
private String magazaİsmi;


    public urun(int id, String kategori, String urunİsmi, String stokSayisi, String fiyat, String magazaİsmi) {
        this.id = id;
        this.kategori = kategori;
        this.urunİsmi = urunİsmi;
        this.stokSayisi = stokSayisi;
        this.fiyat = fiyat;
        this.magazaİsmi = magazaİsmi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getUrunİsmi() {
        return urunİsmi;
    }

    public void setUrunİsmi(String urunİsmi) {
        this.urunİsmi = urunİsmi;
    }

    public String getStokSayisi() {
        return stokSayisi;
    }

    public void setStokSayisi(String stokSayisi) {
        this.stokSayisi = stokSayisi;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public String getMagazaİsmi() {
        return magazaİsmi;
    }

    public void setMagazaİsmi(String magazaİsmi) {
        this.magazaİsmi = magazaİsmi;
    }
}
