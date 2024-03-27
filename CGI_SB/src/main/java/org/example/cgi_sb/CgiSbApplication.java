package org.example.cgi_sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Controller
public class CgiSbApplication {
    private List<Film> filmid = Arrays.asList(
            new Film("JW 1", 18, "ENG", 1),
                new Film("JW 2", 16, "ENG", 2),
                new Film("JW 3", 14, "EE", 3)
        );
    private int piletiteArv;
    private Film valitudFilm;

    public static void main(String[] args) {
        SpringApplication.run(CgiSbApplication.class, args);
    }



    @GetMapping("/")
    public String Start(Model model) {
        model.addAttribute("filmid", filmid);
        return "index";
    }

    @GetMapping("/films/{id}")
    public String showFilmDetails(@PathVariable("id") int id, @RequestParam(value = "kohtadeArv", defaultValue = "1") String kohtadeArv, Model model) {
        Film film = null;
        for (Film i : filmid) {
            if (i.getId() == id){
                film = i;
                valitudFilm = i;
            }
        }

        model.addAttribute("film", film);
        model.addAttribute("kohtadeArv","Valisite " + kohtadeArv);
        model.addAttribute("kohad", film.getKohad());
        return "response"; // Return the Thymeleaf template name for film details
    }

    @PostMapping("/films/{id}")
    public String kohtValitud(@PathVariable("id") int id, @RequestParam(value = "kohtadeArv", defaultValue = "1") String kohtadeArv, @RequestParam(value = "valik") String valik, Model model) {
        Film film = null;
        for (Film i : filmid) {
            if (i.getId() == id){
                film = i;
                valitudFilm = i;
            }
        }
        piletiteArv = Integer.parseInt(kohtadeArv);
        String[] xy = valik.split(" ");
        System.out.println(Arrays.toString(xy));
        for (int i = 0; i < piletiteArv; i++) {
            film.getKohad().setPositionToOne(Integer.parseInt(xy[0])-1, Integer.parseInt(xy[1])-1+i);
        }

        model.addAttribute("film", film);
        model.addAttribute("kohtadeArv","Valisite " + kohtadeArv);
        model.addAttribute("kohad", film.getKohad());
        return "response"; // Return the Thymeleaf template name for film details
    }






}
