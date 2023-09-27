package Hierarchical;

public class Main {
    public static void main(String[] args) {
       Karyawan karyawan = new Karyawan("Wahyu ");
       Karyawan Dosen = new Dosen("Amir ");
       Karyawan Staff = new Staff("Melan ");

       karyawan.kerja();
       Dosen.kerja();
       Staff.kerja();
    }
}
