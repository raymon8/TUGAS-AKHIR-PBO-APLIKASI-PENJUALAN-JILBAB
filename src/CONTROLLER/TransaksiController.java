

package CONTROLLER;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import KONEKSI.koneksi;
import MODEL.TransaksiModel;

public class TransaksiController {
    koneksi cnn = new koneksi();
    
    public void simpan(TransaksiModel JJ)
    {
        cnn.koneksiDataBase();
        String sql ="insert into tbl_transaksi (KodeJilbab,HargaSatuan,JumlahBeli,Keterangan,TotalBayar,JumlahBayar,Kembalian)"
                   + "values ('"+JJ.getKodeJilbab()+"',"
                   + "'"+JJ.getHargaSatuan()+"',"
                   + "'"+JJ.getJumlahBeli()+"',"
                   + "'"+JJ.getKeterangan()+"',"
                   + "'"+JJ.getTotalBayar()+"',"
                   + "'"+JJ.getJumlahBayar()+"',"
                 
                   + "'"+JJ.getKembalian()+"')";
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
     public void update (TransaksiModel JJ)
    {
        cnn.koneksiDataBase();
       /* KodeJilbab,Keterangan,JumlahBeli;*/
        try 
        {
            int idJilbab = JJ.getIdJilbab();
             String kodeJilbab = JJ.getKodeJilbab();
            int hargaSatuan = JJ.getHargaSatuan();
                String jumlahBeli = JJ.getJumlahBeli();
                 String keterangan = JJ.getKeterangan();
            int total = JJ.getTotalBayar();
            int jumlahBayar = JJ.getJumlahBayar();
            int kembalian = JJ.getKembalian();
         
      
            
            String sql = "update tbl_transaksi "
                    + "set KodeJilbab =('" + kodeJilbab + "'),"
                    + "Hargasatuan=('" + hargaSatuan + "'),"
                    + "JumlahBeli=('" + jumlahBeli + "'),"
                    + "Keterangan=('"+ keterangan +"'),"
                    + "TotalBayar=('"+ total +"'),"
                    + "JumlahBayar= ('"+ jumlahBayar +"')"
                    + "Kembalian= ('"+ kembalian +"')"
                    + "where idTransaksi=('" + idJilbab + "')";
            
            cnn.st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
        } 
        catch (SQLException e) 
        {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data tidak terupdate");
        }
    }
      public void hapus(TransaksiModel JJ)
    {
        cnn.koneksiDataBase();
        
        try 
        {
           String sql = "delete from tbl_transaksi where idTransaksi=('"+JJ.getIdJilbab()+"')"; 
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
