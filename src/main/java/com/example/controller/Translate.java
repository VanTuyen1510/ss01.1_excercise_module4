package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Translate {
    public String  translate(String world){
        String [] arrEng = {"Im","am","Iron","Man"};
        String [] arrViet = {"Tôi","là","người","sắt"};

        for (int i = 0; i <arrViet.length ; i++) {
            if(world.equals(arrEng[i])){
                return arrViet[i];
            }
        }
        return "Xin lỗi không thể tìm thấy từ bạn muốn tìm !";
    }
    @GetMapping("/translate/showTran")
    public String showTranslate(){
        return "/translate/showTran";
    }
    @PostMapping("/trans")
    public String translateVietnamese(@RequestParam String world, Model model){
        model.addAttribute("result",translate(world));
        return "/translate/showTran";
    }
}
