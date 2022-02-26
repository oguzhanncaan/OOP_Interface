package com.oguzhan.repository;

import java.util.List;

public interface ICrud {
    /**
     * Kullanılacak methodların kalıplarını tanımlarız.
     * - Interfacelerde methodlara göve girilmez. {} olmaz.
     * - Erişim belirteci eklemek zorunda değilsiniz.
     * - Interfaceler kalıptır.
     */

    void kaydet();          // Create
    List<Object> listele(); // Read
    void duzenle();         // Update
    void sil(long id);      // Delete



}
