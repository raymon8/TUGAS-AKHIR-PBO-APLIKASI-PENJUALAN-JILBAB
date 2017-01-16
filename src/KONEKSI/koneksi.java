


package KONEKSI;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class koneksi {
    public Connection cnn;
    public Statement st;
    public ResultSet rs;
        String namaDataBase = "jdbc:mysql://localhost:3306/db_jilbabfik";
    
        public void koneksiDataBase()
        {
            try {
                 cnn = DriverManager.getConnection(namaDataBase,"root","");
           System.out.println("Terkoneksi ke database( Packages Koneksi )");
           st = cnn.createStatement();
           
            } 
            catch (Exception e) {
                System.err.println("Cek url, username host dan password host");
            System.err.println("SQLException:"+e.getMessage());
            }
        }
                
    
}
