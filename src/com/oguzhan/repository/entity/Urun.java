package com.oguzhan.repository.entity;

public class Urun {
    long id;
    String marka;
    String model;
    int stok;

    public Urun(long id, String marka, String model, int stok) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.stok = stok;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
