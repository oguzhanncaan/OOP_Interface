package com.oguzhan.repository.entity;

public class Satis {

    long id;
    int adet;
    boolean satis = false;

    public Satis(long id, int adet, boolean satis) {
        this.id = id;
        this.adet = adet;
        this.satis = satis;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public boolean isSatis() {
        return satis;
    }

    public void setSatis(boolean satis) {
        this.satis = satis;
    }
}
