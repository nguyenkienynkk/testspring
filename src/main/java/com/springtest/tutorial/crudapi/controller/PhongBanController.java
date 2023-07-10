package com.springtest.tutorial.crudapi.controller;

import com.springtest.tutorial.crudapi.entity.PhongBan;
import com.springtest.tutorial.crudapi.sevice.IServicePhongBan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/aoma")
public class PhongBanController {
    @Autowired
    private IServicePhongBan iServicePhongBan;

    @GetMapping("/")
    public String test() {
        return "Tôi là kiên";
    }

    @PostMapping("/add")
    public PhongBan addPhongBan(@RequestBody PhongBan phongBan) {
        return iServicePhongBan.addPhongBan(phongBan);
    }

    @PutMapping("/update")
    public PhongBan updatePhongBan(@RequestParam("ma_pb") String maPb, @RequestBody PhongBan phongBan) {
        return iServicePhongBan.updatePhongBan(maPb, phongBan);
    }

    @DeleteMapping("/delete/{ma_pb}")
    public boolean deletePhongBan(@PathVariable("ma_pb") String maPb) {
        return iServicePhongBan.deletePhongBan(maPb);
    }

    @GetMapping("/list")
    public List<PhongBan> getAllPhongBan() {
        return iServicePhongBan.getAllPhongBan();
    }

}
