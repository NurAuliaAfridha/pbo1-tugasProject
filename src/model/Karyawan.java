package model;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Karyawan {
    //atribut
    public int id;
    public String namaLengkap,tempatLahir;
    public Date tglLahir;
    public String alamatKaryawan,teleponKaryawan;
    public String gender,status;
    public String namaAyah,namaIbu,alamatOrtu,teleponOrtu;



    //method
    public  void ucapan(){
        System.out.println(" SELAMAT DATANG DI PROGRAM DATA "+ namaLengkap);
        System.out.println("==============================================");
        System.out.println();
    }

    public void tampilDataDiri(){
        System.out.println("-----------Data Karyawan-----------");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("ID KARYAWAN :" + id);
        System.out.println("NAMA LENGKAP :" + namaLengkap);
        System.out.println("TEMPAT LAHIR :" + tempatLahir);
        System.out.println("TANGGAL LAHIR :" + simpleDateFormat.format(tglLahir));
        System.out.println("JENIS KELAMIN :" + gender);
        System.out.println("STATUS :" + status);
        System.out.println("ALAMAT :" + alamatKaryawan);
        System.out.println("TELEPON :" + teleponKaryawan);
    }


    public void tampilDataKeluarga(){
        System.out.println("-----------Data Keluarga-----------");
        System.out.println("NAMA AYAH :" + namaAyah);
        System.out.println("NAMA IBU :" + namaIbu);
        System.out.println("ALAMAT :" + alamatOrtu);
        System.out.println("TELEPON :" + teleponOrtu);
    }

    public int hitungUsia(){
        Calendar tLahir = Calendar.getInstance();
        tLahir.setTime(this.tglLahir);
        Calendar hariIni = Calendar.getInstance();

        int selisih = hariIni.get(Calendar.YEAR)-tLahir.get(Calendar.YEAR);
        if (hariIni.get(Calendar.MONTH) < tLahir.get(Calendar.MONTH)){
            selisih--;
        }else {
            if (hariIni.get(Calendar.MONTH) == tLahir.get(Calendar.MONTH) && hariIni.get(Calendar.DAY_OF_MONTH) < tLahir.get(Calendar.DAY_OF_MONTH)) {
                selisih--;
            }
        }
        return selisih;
    }

    //constructor
    public Karyawan() {
        System.out.println("Ini dari constructor");
        id = 0;
        namaLengkap ="Nama Kosong";
        tglLahir = getTglLahir();
    }

    public Karyawan(String namaLengkap, String tempatLahir, Date tglLahir) {
        this.namaLengkap = namaLengkap;
        this.tempatLahir = tempatLahir;
        this.tglLahir = tglLahir;
    }

    public Karyawan(int id, String namaLengkap, String tempatLahir, String alamatKaryawan, String teleponKaryawan, String gender, String status, String namaAyah, String namaIbu, String alamatOrtu, String teleponOrtu, Date tglLahir) {
        this.id = id;
        this.namaLengkap = namaLengkap;
        this.tempatLahir = tempatLahir;
        this.alamatKaryawan = alamatKaryawan;
        this.teleponKaryawan = teleponKaryawan;
        this.gender = gender;
        this.status = status;
        this.namaAyah = namaAyah;
        this.namaIbu = namaIbu;
        this.alamatOrtu = alamatOrtu;
        this.teleponOrtu = teleponOrtu;
        this.tglLahir = tglLahir;
    }

    public Karyawan(int id, String namaLengkap, String tempatLahir, Date tglLahir) {
        this.id = id;
        this.namaLengkap = namaLengkap;
        this.tempatLahir = tempatLahir;
        this.tglLahir = tglLahir;
    }

    //crud
    public boolean create(){
        String tambah = "INSERT INTO karyawan VALUES ('"+id+"', '"+namaLengkap+"', '"+tempatLahir+"', '"+alamatKaryawan+"', '"+teleponKaryawan+"', '"+gender+"', '"+status+"', '"+namaAyah+"', '"+namaIbu+"', '"+alamatOrtu+"', '"+teleponOrtu+"', '"+tglLahir+"')";
        System.out.println(tambah);
        boolean berhasil = true;
        if (berhasil){
            return true;
        }else {
            return false;
        }
    }

    public ArrayList<Karyawan> read(){
        return null;
    }

    public boolean update(){
        return false;
    }

    public boolean delete(){
        String hapus = "DELETE FROM karyawan WHERE id = " +id;
        System.out.println(hapus);
        return false;
    }


    //getAndset
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getAlamatKaryawan() {
        return alamatKaryawan;
    }

    public void setAlamatKaryawan(String alamatKaryawan) {
        this.alamatKaryawan = alamatKaryawan;
    }

    public String getTeleponKaryawan() {
        return teleponKaryawan;
    }

    public void setTeleponKaryawan(String teleponKaryawan) {
        this.teleponKaryawan = teleponKaryawan;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    public void setNamaAyah(String namaAyah) {
        this.namaAyah = namaAyah;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public void setNamaIbu(String namaIbu) {
        this.namaIbu = namaIbu;
    }

    public String getAlamatOrtu() {
        return alamatOrtu;
    }

    public void setAlamatOrtu(String alamatOrtu) {
        this.alamatOrtu = alamatOrtu;
    }

    public String getTeleponOrtu() {
        return teleponOrtu;
    }

    public void setTeleponOrtu(String teleponOrtu) {
        this.teleponOrtu = teleponOrtu;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }
}
