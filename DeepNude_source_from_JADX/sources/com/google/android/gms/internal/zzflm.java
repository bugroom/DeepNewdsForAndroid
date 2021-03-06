package com.google.android.gms.internal;

public abstract class zzflm<M extends zzflm<M>> extends zzfls {
    protected zzflo zzpvl;

    public /* synthetic */ Object clone() {
        return zzdck();
    }

    public final <T> T zza(zzfln<M, T> zzfln) {
        zzflo zzflo = this.zzpvl;
        if (zzflo == null) {
            return null;
        }
        zzflp zzmz = zzflo.zzmz(zzfln.tag >>> 3);
        return zzmz == null ? null : zzmz.zzb(zzfln);
    }

    public void zza(zzflk zzflk) {
        if (this.zzpvl != null) {
            for (int i = 0; i < this.zzpvl.size(); i++) {
                this.zzpvl.zzna(i).zza(zzflk);
            }
        }
    }

    protected final boolean zza(zzflj zzflj, int i) {
        int position = zzflj.getPosition();
        if (!zzflj.zzlg(i)) {
            return false;
        }
        int i2 = i >>> 3;
        zzflu zzflu = new zzflu(i, zzflj.zzao(position, zzflj.getPosition() - position));
        zzflp zzflp = null;
        zzflo zzflo = this.zzpvl;
        if (zzflo == null) {
            this.zzpvl = new zzflo();
        } else {
            zzflp = zzflo.zzmz(i2);
        }
        if (zzflp == null) {
            zzflp = new zzflp();
            this.zzpvl.zza(i2, zzflp);
        }
        zzflp.zza(zzflu);
        return true;
    }

    public M zzdck() {
        zzflm zzflm = (zzflm) super.zzdcl();
        zzflq.zza(this, zzflm);
        return zzflm;
    }

    public /* synthetic */ zzfls zzdcl() {
        return (zzflm) clone();
    }

    protected int zzq() {
        if (this.zzpvl == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzpvl.size(); i2++) {
            i += this.zzpvl.zzna(i2).zzq();
        }
        return i;
    }
}
