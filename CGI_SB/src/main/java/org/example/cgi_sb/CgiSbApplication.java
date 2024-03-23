package org.example.cgi_sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
public class CgiSbApplication {

    public static void main(String[] args) {
        SpringApplication.run(CgiSbApplication.class, args);
    }



    @GetMapping("/html")
    public String dynamicHtml() {
        return "index";
    }

    @PostMapping("/html")
    public String handleSubmit(@RequestParam("name") String name, Model model) {
        Kino kino = new Kino();
        model.addAttribute("message", name + ", siin on sulle filmid, mida vaadata: " + kino.getFilmid());
        return "response";
    }


}
