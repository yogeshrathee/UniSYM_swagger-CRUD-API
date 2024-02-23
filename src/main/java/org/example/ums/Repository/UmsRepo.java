package org.example.ums.Repository;

import org.example.ums.Model.Ums;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UmsRepo extends JpaRepository<Ums,Integer> {
    Ums deleteById(int regNo);
}
