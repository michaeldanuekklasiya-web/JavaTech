package Hierarchical;

public class Dosen extends Karyawan {
    public Dosen (String nama){
        super(nama);
    }

    public void kerja() {System.out.println(this.nama + "Sedang Mengajar");}

}
