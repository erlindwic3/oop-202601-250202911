package id.ac.upb.asetpinjam.model;

import id.ac.upb.asetpinjam.config.Varian;

public class AlatLab extends Aset {

    private final String laboratorium;
    private final TingkatRisiko tingkatRisiko;

    public AlatLab(String kode, String nama, String laboratorium, TingkatRisiko tingkatRisiko) {
        super(kode, nama);
        if (laboratorium == null || laboratorium.isBlank())
            throw new IllegalArgumentException("laboratorium tidak boleh null atau kosong");
        if (tingkatRisiko == null)
            throw new IllegalArgumentException("tingkat risiko tidak boleh null");
        this.laboratorium = laboratorium.trim();
        this.tingkatRisiko = tingkatRisiko;
    }

    public String getLaboratorium() { return laboratorium; }
    public TingkatRisiko getTingkatRisiko() { return tingkatRisiko; }

    @Override
    public JenisAset getJenis() {
        return JenisAset.ALAT_LAB;
    }

    @Override
    public long hitungDenda(int hariTerlambat) {
        if (hariTerlambat < 0)
            throw new IllegalArgumentException("hariTerlambat tidak boleh negatif");
        return (long) hariTerlambat * 4 * Varian.aktif().dendaPerHari;
    }
}