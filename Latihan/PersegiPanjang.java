package Latihan;
public class PersegiPanjang {
    double panjang, lebar;

    //fungsi hitung luas
    double hitungLuas(){
        return panjang * lebar;
    }

    //fungsi hitungKeliling
    double hitungKeliling(){
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 40;
        pp.lebar = 15;
        pp.hitungLuas();
        pp.hitungKeliling();
    }
}
