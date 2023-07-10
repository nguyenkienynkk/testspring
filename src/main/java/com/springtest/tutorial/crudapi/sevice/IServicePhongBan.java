package com.springtest.tutorial.crudapi.sevice;

import com.springtest.tutorial.crudapi.entity.PhongBan;

import java.util.List;

public interface IServicePhongBan {
    public PhongBan addPhongBan(PhongBan phongban);
    public PhongBan updatePhongBan(String maPb ,PhongBan phongban);
    public boolean deletePhongBan(String maPb);
    public List<PhongBan> getAllPhongBan();
    public PhongBan getOnePhongBan(String maPb);

}
