
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class urunİslemleri {
    private Connection con = null;
private Statement statement= null;
private PreparedStatement preparedStatement= null;

public urunİslemleri(){
    String url = "jdbc:mysql://"+dataBase.host+ ":"+dataBase.port+"/"+dataBase.db_ismi;
    try{
        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException ex) {
        System.out.println("Driver bulunamadı");
    }
    try {
        con = DriverManager.getConnection(url, dataBase.kullanici_adi, dataBase.parola);
        System.out.println("Bağlantı başarılı");
    } catch (SQLException ex) {
        System.out.println("Bağlantı başarısız");
    }
    
    
}

public boolean girisYap(String kullanici_adi,String password){
    String sorgu = "Select * From adminler where kullaniciAdi = ? and password = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(urunİslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    
}
public ArrayList<urun> urunleriGetir(){
    ArrayList<urun> cikti = new ArrayList<urun>();
        try {
            statement = con.createStatement();
            String sorgu = "Select * From urunler";
            ResultSet rs = statement.executeQuery(sorgu);
            while(rs.next()){
                int id = rs.getInt("id");
                String kategori = rs.getString("kategori");
                String urunİsmi = rs.getString("urunİsmi");
                String fiyat = rs.getString("fiyat");
                String stokSayisi = rs.getString("stokSayisi");
                String magaza_ismi = rs.getString("magazaİsmi");
                cikti.add(new urun(id, kategori, urunİsmi, fiyat,stokSayisi, magaza_ismi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(urunİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
}
public void urunEkle(String kategori,String marka,String Fiyat,String Stok,String Magaza){
    String sorgu = "Insert Into urunler (kategori,urunİsmi,fiyat,stokSayisi,magazaİsmi) VALUES (?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1,kategori);
            preparedStatement.setString(2, marka);
            preparedStatement.setString(3, Fiyat);
            preparedStatement.setString(4, Stok);
            preparedStatement.setString(5, Magaza);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(urunİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
public void urunGuncelle(int id,String kategori,String marka,String fiyat,String stok,String magaza){
    String sorgu = "Update urunler set kategori = ?,urunİsmi = ?,fiyat = ?,stokSayisi = ?,magazaİsmi = ? where id = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kategori);
            preparedStatement.setString(2, marka);
            preparedStatement.setString(3, fiyat);
            preparedStatement.setString(4, stok);
            preparedStatement.setString(5, magaza);
            preparedStatement.setInt(6, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(urunİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public void urunuSil(int id){
    String sorgu = "Delete from urunler where id = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(urunİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
}

}
