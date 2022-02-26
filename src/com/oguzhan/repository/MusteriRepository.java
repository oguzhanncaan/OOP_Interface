package com.oguzhan.repository;

import java.util.List;

/**
 *  EXTENDS --> Sınıfları miras almak için kullanılır.
 *  IMPLEMENTS --> Interfaceleri miras almak için kullanılır.
 */

public class MusteriRepository implements ICrud {


    @Override
    public void kaydet() {

    }

    @Override
    public List<Object> listele() {
        return null;
    }

    @Override
    public void duzenle() {

    }

    @Override
    public void sil(long id) {

    }
}
