package org.example.ums.Services.Impl;

import org.example.ums.Model.Ums;
import org.example.ums.Repository.UmsRepo;
import org.example.ums.Services.UmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsImpl implements UmsService {

    @Autowired
    UmsRepo umsRepo;
    public UmsImpl(UmsRepo umsRepo){
        this.umsRepo=umsRepo;
    }


    @Override
    public String createDetails(Ums ums) {
        umsRepo.save(ums);
        return null;
    }

    @Override
    public String updateDetails(Ums ums) {
        umsRepo.save(ums);
        return null;
    }

    @Override
    public Ums deleteById(int regNo) {
        umsRepo.deleteById(regNo);
        return null;
    }

    @Override
    public List<Ums> deleteAll() {
        umsRepo.deleteAll();
        return null;
    }

    @Override
    public Ums getById(int regNo) {
        return umsRepo.findById(regNo).get();
    }

    @Override
    public List<Ums> getAll() {
        return umsRepo.findAll();
    }
}
