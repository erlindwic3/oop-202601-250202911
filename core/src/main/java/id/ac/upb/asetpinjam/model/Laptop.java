package id.ac.upb.asetpinjam.model;

/** Minggu 3: aset berupa laptop. Spesifikasi dan nomor inventaris tidak boleh kosong. */
public class Laptop extends Aset {

    private final String spesifikasi;
    private final String nomorInventaris;

    public Laptop(String kode, String nama, String spesifikasi, String nomorInventaris) {
        super(kode, nama);
        if (spesifikasi == null || spesifikasi.isBlank()) {
            throw new IllegalArgumentException("spesifikasi tidak boleh null atau kosong");
        }
        if (nomorInventaris == null || nomorInventaris.isBlank()) {
            throw new IllegalArgumentException("nomor inventaris tidak boleh null atau kosong");
        }
        this.spesifikasi = spesifikasi.trim();
        this.nomorInventaris = nomorInventaris.trim();
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public String getNomorInventaris() {
        return nomorInventaris;
    }

    @Override
    public JenisAset getJenis() {
        return JenisAset.LAPTOP;
    }

    // TODO minggu 4: override hitungDenda(int).
}