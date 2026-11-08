package id.ac.upb.asetpinjam.denda;

import id.ac.upb.asetpinjam.kontrak.AturanDenda;
import id.ac.upb.asetpinjam.model.Aset;

public class DendaProgresif implements AturanDenda {

    @Override
    public long hitung(Aset aset, int hariTerlambat) {
        if (hariTerlambat <= 0) return 0;
        long flat = aset.hitungDenda(1);
        long total = 0;
        for (int i = 1; i <= hariTerlambat; i++) {
            if (i <= 5) {
                total += flat;
            } else {
                total += (long) (flat * 1.5);
            }
        }
        return total;
    }
}