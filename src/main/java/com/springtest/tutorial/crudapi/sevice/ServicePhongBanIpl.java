package com.springtest.tutorial.crudapi.sevice;

import com.springtest.tutorial.crudapi.entity.PhongBan;
import com.springtest.tutorial.crudapi.repository.RepositoryPhongBan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicePhongBanIpl implements IServicePhongBan{
    @Autowired
    private RepositoryPhongBan repositoryPhongBan;
    @Override
    public PhongBan addPhongBan(PhongBan phongban) {
        if (phongban!= null){
            return repositoryPhongBan.save(phongban);
        }
        return null;
    }

    @Override
    public PhongBan updatePhongBan(String maPb, PhongBan phongban) {
        if (phongban != null){
            PhongBan phongban1 = repositoryPhongBan.getById(maPb);
            if (phongban != null){
                phongban1.setMaPb(phongban.getMaPb());
                phongban1.setTenPb(phongban.getTenPb());

                return repositoryPhongBan.save(phongban1);
            }
        }
        return null;
    }

    @Override
    public boolean deletePhongBan(String maPb) {
        if (Integer.parseInt(maPb) >= 1){
            PhongBan phongban = repositoryPhongBan.getById(maPb);
    if (phongban!= null){
        repositoryPhongBan.delete(phongban);
        return true;
    }
        }
        return false;
    }

    @Override
    public List<PhongBan> getAllPhongBan() {
        return repositoryPhongBan.findAll();
    }

    @Override
    public PhongBan getOnePhongBan(String maPb) {
        return repositoryPhongBan.getById(maPb);
    }
}
