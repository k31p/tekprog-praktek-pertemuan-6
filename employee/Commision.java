/**
 * Class Commision
 * @author Yobel El'Roy Doloksaribu | 231524029
 */
public class Commision extends Hourly{
    // Attributes
    private double totalSales = 0;
    private double commisionRate;

    /**
     * Constructor dari class Commision
     * @param eName - Nama employee
     * @param eAddress - Alamat employee
     * @param ePhone - Nomor telepon employee
     * @param socSecNumber - Security number employee
     * @param rate - Gaji employee perjam
     * @param commisionRate - Persenan komisi employee
     */
    public Commision(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commisionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commisionRate = commisionRate;
    }

    /**
     * Menambahkan totalSales yang sebelumnya
     * @param totalSales
     */
    public void addSales(double totalSales){
        this.totalSales += totalSales;
    }

    /**
     * Menghitung jumlah pembayaran employee
     */
    public double pay(){
        double pay = super.pay() + totalSales * commisionRate;
        totalSales = 0;
        return pay;
    }

    /**
     * Menampilkan informasi employee
     */
    public String toString()
    {
        String currentString = super.toString();
        currentString += "\nTotal Sales: " + this.totalSales;
        return currentString;
    }
}