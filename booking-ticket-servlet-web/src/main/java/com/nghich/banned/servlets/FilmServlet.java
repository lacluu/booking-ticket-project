package com.nghich.banned.servlets;

import com.nghich.banned.services.FilmService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/films")
public class FilmServlet extends HttpServlet {

    private FilmService filmService;

    @Override
    public void init() throws ServletException {
        super.init();
    }

    
}
