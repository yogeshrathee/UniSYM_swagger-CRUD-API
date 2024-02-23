package org.example.ums.Services;

import org.example.ums.Model.Ums;

import java.util.List;

public interface UmsService {
    public String createDetails(Ums ums);
    public String updateDetails(Ums ums);

    public Ums deleteById(int regNo);

    public List<Ums> deleteAll();


    public Ums getById(int regNo);

    public List<Ums> getAll();
}
