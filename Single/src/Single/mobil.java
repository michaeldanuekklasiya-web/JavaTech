package Single;

public class mobil {
    protected String nama;

    public mobil(String nama) { this.nama = nama; }

    public void klakson() {
        System.out.println("Bunyi klakson " + this.nama + " adalah Teet!");
    }
}
