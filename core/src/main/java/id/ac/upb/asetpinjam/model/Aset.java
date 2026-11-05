package id.ac.upb.asetpinjam.model;

import id.ac.upb.asetpinjam.config.Varian;
import id.ac.upb.asetpinjam.kontrak.DapatDipinjam;

public class Aset implements DapatDipinjam {

    private final String kode;
    private String nama;
    private StatusAset status;
    private Kondisi kondisi;

    public Aset(String kode, String nama) {
        this.kode = validasiTeks(kode, "kode");
        this.nama = validasiTeks(nama, "nama");
        this.status = StatusAset.TERSEDIA;
        this.kondisi = Kondisi.BAIK;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public StatusAset getStatus() { return status; }
    public Kondisi getKondisi() { return kondisi; }

    public void setNama(String nama) {
        this.nama = validasiTeks(nama, "nama");
    }

    public void setStatus(StatusAset status) {
        if (status == null) throw new IllegalArgumentException("status tidak boleh null");
        this.status = status;
    }

    public void setKondisi(Kondisi kondisi) {
        if (kondisi == null) throw new IllegalArgumentException("kondisi tidak boleh null");
        this.kondisi = kondisi;
    }

    private static String validasiTeks(String nilai, String namaField) {
        if (nilai == null || nilai.isBlank())
            throw new IllegalArgumentException(namaField + " tidak boleh null atau kosong");
        return nilai.trim();
    }

    @Override
    public boolean bisaDipinjam() {
        throw new UnsupportedOperationException("TODO minggu 5");
    }

    public JenisAset getJenis() {
        throw new UnsupportedOperationException("TODO minggu 3");
    }

    public long hitungDenda(int hariTerlambat) {
        if (hariTerlambat < 0)
            throw new IllegalArgumentException("hariTerlambat tidak boleh negatif");
        return (long) hariTerlambat * Varian.aktif().dendaPerHari;
    }
}