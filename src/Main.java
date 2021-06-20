import model.Karyawan;
import model.KaryawanBeraksi;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {

        Karyawan karyawan1 = new Karyawan();
        SimpleDateFormat tag = new SimpleDateFormat("dd-MM-yyyy");
        karyawan1.id = 1;
        karyawan1.namaLengkap = " Wangi Linda Lestari";
        karyawan1.tempatLahir = " Landasan Ulin";
        karyawan1.tglLahir = tag.parse("01-01-2000");
        karyawan1.ucapan();
        karyawan1.tampilDataDiri();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();


        Karyawan karyawan2 = new Karyawan();
        SimpleDateFormat lahir = new SimpleDateFormat("dd-MM-yyyy");
        karyawan2.id = 2;
        karyawan2.namaLengkap = " Vanisa Aulia Anjani";
        karyawan2.tempatLahir = " Banjarbaru";
        karyawan2.tglLahir = lahir.parse("17-08-1998");
        karyawan2.ucapan();
        karyawan2.tampilDataDiri();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        Karyawan kry1 = new Karyawan();
        SimpleDateFormat tanggal = new SimpleDateFormat("dd-MM-yyyy");
        kry1.id = 3;
        kry1.namaLengkap = "Fathiya Aulia Nissa";
        kry1.tempatLahir = "Rantau";
        kry1.tglLahir = tanggal.parse("28-10-1995");
        kry1.alamatKaryawan = "Tambarangan";
        kry1.teleponKaryawan = "085678879900";
        kry1.gender = "Perempuan";
        kry1.status = "Belum Menikah";
        kry1.namaAyah = "Anita";
        kry1.namaIbu = "Rahman";
        kry1.alamatOrtu = "Tambarangan";
        kry1.teleponOrtu = "085251462285";
        kry1.ucapan();
        kry1.tampilDataDiri();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        Karyawan kry2 = new Karyawan();
        SimpleDateFormat tLahir = new SimpleDateFormat("dd-MM-yyyy");
        kry2.id = 3;
        kry2.namaLengkap = "Nur Aulia Afridha";
        kry2.tempatLahir = "Tapin";
        kry2.tglLahir = tLahir.parse("27-04-2001");
        kry2.alamatKaryawan = "Rantau";
        kry2.teleponKaryawan = "085345641717";
        kry2.gender = "Perempuan";
        kry2.status = "Belum Menikah";
        kry2.namaAyah = "Misran";
        kry2.namaIbu = "Kamariah";
        kry2.alamatOrtu = "Rantau";
        kry2.teleponOrtu = "085246221543";
        kry2.ucapan();
        kry2.tampilDataDiri();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        Karyawan karyawan = new Karyawan();
        SimpleDateFormat tanggalLahir = new SimpleDateFormat("dd-MM-yyyy");
        karyawan.id = 3;
        karyawan.namaLengkap = "Nur Aulia Afridha";
        karyawan.tempatLahir = "Tapin";
        karyawan.tglLahir = tanggalLahir.parse("27-04-2001");
        karyawan.ucapan();
        karyawan.tampilDataDiri();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        Karyawan constructor = new Karyawan();
        SimpleDateFormat tanggalLhr = new SimpleDateFormat("dd-MM-yyyy");
        constructor.id = 3;
        constructor.namaLengkap = "Nur Aulia Afridha";
        constructor.tempatLahir = "Tapin";
        constructor.tglLahir = tanggalLahir.parse("27-04-2001");
        constructor.ucapan();
        constructor.tampilDataDiri();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();


        KaryawanBeraksi karyawanBeraksi = new KaryawanBeraksi();
        SimpleDateFormat tgllhr = new SimpleDateFormat("dd-MM-yyyy");
        karyawanBeraksi.id = 1;
        karyawanBeraksi.namaLengkap = "Mauren";
        karyawanBeraksi.tempatLahir = "kotabaru";
        karyawanBeraksi.tglLahir = tgllhr.parse("25-06-1998");
        karyawanBeraksi.gender = "Perempuan";
        karyawanBeraksi.status = "Belum Menikah";
        karyawanBeraksi.alamatKaryawan = "barabai";
        karyawanBeraksi.teleponKaryawan = "082154133444";
        karyawanBeraksi.getJabatan();
        karyawanBeraksi.setJabatan("Manager");
        karyawanBeraksi.getGapok();
        karyawanBeraksi.setGapok(2500000);
        karyawanBeraksi.getPajak();
        karyawanBeraksi.setPajak(2500);
        karyawanBeraksi.getTunjangan();
        karyawanBeraksi.setTunjangan(75000);
        karyawanBeraksi.getNamaAyah();
        karyawanBeraksi.setNamaAyah("Mulyadi");
        karyawanBeraksi.getNamaIbu();
        karyawanBeraksi.setNamaIbu("Siti Maimunah");
        karyawanBeraksi.getAlamatOrtu();
        karyawanBeraksi.setAlamatOrtu("Binuang");
        karyawanBeraksi.getTeleponOrtu();
        karyawanBeraksi.setTeleponOrtu("08785677423");
        karyawanBeraksi.tampilDataDiri();
        System.out.println("USIA :"+ karyawanBeraksi.hitungUsia()+ " TAHUN");
        karyawanBeraksi.tampilDataKeluarga();
        System.out.println("-----------------------------------------------------------");
        karyawanBeraksi.tampilInfo();
        System.out.println("GAJI BERSIH Rp."+ karyawanBeraksi.hitungGaji());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");



    }
}
