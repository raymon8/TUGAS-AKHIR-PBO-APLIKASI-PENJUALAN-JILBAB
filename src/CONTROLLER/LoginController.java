
package CONTROLLER;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import MODEL.LoginModel;
import KONEKSI.koneksi;

public class LoginController {
 koneksi cnn = new koneksi();
    
    public void LoginData(LoginModel LM)
    {
        cnn.koneksiDataBase();
        String sql ="select * from tbl_login "
                  + "where username = ('"+LM.getUsername()+"'),"
                  + "and password =('"+LM.getPassword()+"')";
        
        try 
        {
            cnn.st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Berhasil Login");
            
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Username atau Password Salah");
            System.err.println(""+e);
        }
    }
}
