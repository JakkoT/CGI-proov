package org.example.cgi_sb;

import java.util.ArrayList;

public class Kino {
    public ArrayList<String> filmid;

    public Kino() {
        this.filmid = new ArrayList<>();
        this.filmid.add("JW1");
        this.filmid.add("JW2");
    }

    public ArrayList<String> getFilmid() {
        return filmid;
    }
}

