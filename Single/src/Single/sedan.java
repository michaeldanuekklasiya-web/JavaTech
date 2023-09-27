package Single;

public class sedan extends mobil{
    public sedan(String nama) {
        super(nama);
    }

    @Override public void klakson() {
        System.out.println("Bunyi klakson " + this.nama + " adalah tiin!");
    }
}
