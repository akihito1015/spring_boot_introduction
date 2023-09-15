package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    
    @GetMapping("/request_test")
    // 返り値をレスポンスとして扱います
    @ResponseBody
    // name ... 名前、 bloodType ... 血液型
    // パラメータ名と仮引数名が同じな場合、@RequestParam String nameのようにパラメータ名の指定を省略できます
    public String getTest(@RequestParam("name") String name
                          , @RequestParam("bloodType") String bloodType) {
        return "名前: " + name + "<br>血液型: " + bloodType;
    }
}
