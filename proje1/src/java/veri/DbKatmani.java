package veri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbKatmani {

    private Connection conn;
    String dburl = "jdbc:derby://localhost:1527/abc";
    String user = "abc";
    String pass = "123";

    public Connection baglan() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            System.out.println("başarılı");
            conn = DriverManager.getConnection(dburl, user, pass);
        } 
        
        catch (Exception e) {
            System.out.println("başarısız");
        }
        return conn;
    }

    public void kullaniciListesi() {
        if (conn == null) {
            System.out.println("başarısız,bağlanıyor");
            baglan();
        }else{
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from kullanici");
            System.out.println("KULLANICIADI " + "SIFRE");
            while (rs.next()) {
                System.out.println("" + rs.getString(1) + "\t " + rs.getString(2));
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }}
    }

    public boolean kullaniciKontrol(String kullaniciadi, String sifre) {
        if (conn == null) {
            System.out.println("başarısız,bağlanıyor");
            baglan();
        }else{
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select sifre from kullanici where kullaniciadi='" + kullaniciadi + "'");
            rs.next();
            return sifre.equals(rs.getString(1));

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }  
        return false;
}

    public static void main(String args[]) {
        DbKatmani dbk = new DbKatmani();
        dbk.kullaniciListesi();
    }
}
