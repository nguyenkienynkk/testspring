package com.springtest.tutorial.crudapi.entity;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "phongban")
public class PhongBan {
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ma_pb")
    private String maPb;

    @Column(name = "ten_pb")
    private String tenPb;

    public PhongBan() {
    }

    public PhongBan(String maPb, String tenPb) {
        this.maPb = maPb;
        this.tenPb = tenPb;
    }

    public String getMaPb() {
        return this.maPb;
    }

    public void setMaPb(String maPb) {
        this.maPb = maPb;
    }

    public String getTenPb() {
        return this.tenPb;
    }

    public void setTenPb(String tenPb) {
        this.tenPb = tenPb;
    }
}
