package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lesson")
public class LessonController {

    @GetMapping("/sample")
    // Model型の値を必ず仮引数に持つ
    public String sample(Model model) {
        // 変数定義
        String text = "Hello Spring Boot!!";
        // messageという属性名、Hello Spring Boot!!という値を追加します
        model.addAttribute("message", text);
        return "index";
    }
}