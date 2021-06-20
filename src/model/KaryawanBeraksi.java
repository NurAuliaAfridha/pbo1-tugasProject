package model;

public class KaryawanBeraksi extends Karyawan{
    String jabatan;
    int gapok,pajak,tunjangan;

    public void tampilInfo(){
        System.out.println("Ini Gaji" + namaLengkap);
        System.out.println("JABATAN :" +jabatan);
        System.out.println("GAJI POKOK Rp." + gapok);
        System.out.println("PAJAK Rp." + pajak);
        System.out.println("TUNJANGAN Rp." + tunjangan);
    }
    public int hitungGaji(){
        return gapok-pajak+tunjangan;
    }

    @Override
    public boolean create() {
        String tambah = "INSERT INTO karyawan VALUES ('"+id+"', '"+namaLengkap+"', '"+tempatLahir+"', '"+alamatKaryawan+"', '"+teleponKaryawan+"', '"+gender+"', '"+status+"', '"+namaAyah+"', '"+namaIbu+"', '"+alamatOrtu+"', '"+teleponOrtu+"', '"+tglLahir+"')";
        System.out.println(tambah);
        return super.create();
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGapok() {
        return gapok;
    }

    public void setGapok(int gapok) {
        this.gapok = gapok;
    }

    public int getPajak() {
        return pajak;
    }

    public void setPajak(int pajak) {
        this.pajak = pajak;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    @Override
    public boolean delete() {
        return super.delete();
    }
}
