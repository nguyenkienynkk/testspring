package com.springtest.tutorial.crudapi.repository;
import com.springtest.tutorial.crudapi.entity.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RepositoryPhongBan extends JpaRepository<PhongBan,String> {
}
