
package CONTROLLER;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import KONEKSI.koneksi;
import MODEL.BarangModel;

public class BarangController {
    
    koneksi cnn = new koneksi();
    
    public void simpan(BarangModel JJ)
    {
        cnn.koneksiDataBase();
        String sql ="insert into tbl_barang (KodeJilbab,MerkJilbab,WarnaJilbab,JenisKain,HargaJilbab,StokJilbab)"
                   + "values ('"+JJ.getKodeJilbab()+"',"
                   + "'"+JJ.getMerkJilbab()+"',"
                   + "'"+JJ.getWarnaJilbab()+"',"
                   + "'"+JJ.getJenisKain()+"',"
                   + "'"+JJ.getHargaJilbab()+"',"
                   + "'"+JJ.getStok()+"')";
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
     public void update (BarangModel JJ)
    {
        cnn.koneksiDataBase();
        
        try 
        {
            int id = JJ.getIdJilbab();
            String kode = JJ.getKodeJilbab();
            String jenis = JJ.getMerkJilbab();
            String nama = JJ.getWarnaJilbab();
            String merk = JJ.getJenisKain();
            int harga = JJ.getHargaJilbab();
            int stok = JJ.getStok();
            
            String sql = "update tbl_barang "
                    + "set KodeJilbab =('" + kode + "'),"
                    + "MerkJilbab=('" + jenis + "'),"
                    + "WarnaJilbab=('" + nama + "'),"
                    + "JenisKain=('"+ merk +"'),"
                    + "HargaJilbab=('"+ harga +"'),"
                    + "StokJilbab= ('"+ stok +"')"
                    + "where IdJilbab=('" + id + "')";
            
            cnn.st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
        } 
        catch (SQLException e) 
        {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data tidak terupdate");
        }
    }
      public void hapus(BarangModel JJ)
    {
        cnn.koneksiDataBase();
        
        try 
        {
           String sql = "delete from tbl_barang where IdJilbab=('"+JJ.getIdJilbab()+"')"; 
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
