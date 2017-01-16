

package MODEL;



public class TransaksiModel {
    private String KodeJilbab,Keterangan,JumlahBeli;
    private int idJilbab,HargaSatuan,TotalBayar,JumlahBayar,Kembalian;

    public String getKodeJilbab() {
        return KodeJilbab;
    }

    public void setKodeJilbab(String KodeJilbab) {
        this.KodeJilbab = KodeJilbab;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

    public String getJumlahBeli() {
        return JumlahBeli;
    }

    public void setJumlahBeli(String JumlahBeli) {
        this.JumlahBeli = JumlahBeli;
    }

    public int getIdJilbab() {
        return idJilbab;
    }

    public void setIdJilbab(int idJilbab) {
        this.idJilbab = idJilbab;
    }

    public int getHargaSatuan() {
        return HargaSatuan;
    }

    public void setHargaSatuan(int HargaSatuan) {
        this.HargaSatuan = HargaSatuan;
    }

    public int getTotalBayar() {
        return TotalBayar;
    }

    public void setTotalBayar(int TotalBayar) {
        this.TotalBayar = TotalBayar;
    }

    public int getJumlahBayar() {
        return JumlahBayar;
    }

    public void setJumlahBayar(int JumlahBayar) {
        this.JumlahBayar = JumlahBayar;
    }

    public int getKembalian() {
        return Kembalian;
    }

    public void setKembalian(int Kembalian) {
        this.Kembalian = Kembalian;
    }
    
}
