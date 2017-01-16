

package CONTROLLER;


import java.sql.SQLException;
import javax.swing.JOptionPane;
import MODEL.PembeliModel;
import KONEKSI.koneksi;

public class PembeliController {
    koneksi cnn = new koneksi();
    
    public void Simpan(PembeliModel PM)
    {
        cnn.koneksiDataBase();
        String sql ="insert into tbl_pembeli(KodeKasir,NamaKasir,NomorTeleponKasir,AlamatKasir)"
                   + "values ('"+PM.getKodeKasir()+"',"
                   + "'"+PM.getNamaKasir()+"',"
                   + "'"+PM.getNomorTeleponKasir()+"',"
                   + "'"+PM.getAlamatKasir()+"')";
        
        try 
        {
            cnn.st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Tidak berhasil disimpan");
            System.err.println(""+e);
        }
    }
    
    public void Update(PembeliModel PM)
    {
        cnn.koneksiDataBase();
        
        try 
        {
            int id = PM.getIdKasir();
            String kode = PM.getKodeKasir();
            String nama = PM.getNamaKasir();
            String nope = PM.getNomorTeleponKasir();
            String alamat = PM.getAlamatKasir();
            
            String sql = "update tbl_kasir "
                    + "set KodeKasir=('" + kode + "'),"
                    + "NamaKasir=('" + nama + "'),"
                    + "NomorTeleponKasir=('" + nope + "'),"
                    + "AlamatKasir=('"+ alamat +"')"
                    + "where idKasir=('" + id + "')";
            
            cnn.st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
        } 
        catch (SQLException e) 
        {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data tidak terupdate");
        }
    }
    
    public void Hapus(PembeliModel PM)
    {
        cnn.koneksiDataBase();
        
        try 
        {
           String sql = "delete from tbl_kasir where idKasir=('"+PM.getIdKasir()+"')"; 
           cnn.st.executeUpdate(sql);
           JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus..");
        } 
        catch (SQLException e) 
        {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data tidak terhapus");
        }
        
    }
    
    
}
