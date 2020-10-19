package com.nghich.banned.configurations;

import com.nghich.banned.exceptions.BeanNotFoundException;
import com.nghich.banned.repositories.FilmRepository;
import com.nghich.banned.repositories.impl.FilmRepositoryImpl;
import com.nghich.banned.services.FilmService;
import com.nghich.banned.services.impl.FilmServiceImpl;

public class BookingTicketApplicationContext {

    private BookingTicketApplicationContext() {
    }

    public static BookingTicketApplicationContext getInstance() {
        return ApplicationContextHelper.APPLICATION_CONTEXT_INSTANCE;
    }

    //class helper for create single instance of BookingTicketApplicationContext
    private static class ApplicationContextHelper {
        public static final BookingTicketApplicationContext APPLICATION_CONTEXT_INSTANCE = new BookingTicketApplicationContext();
        public static final FilmRepository FILM_REPOSITORY_INSTANCE = new FilmRepositoryImpl();
        public static final FilmService FILM_SERVICE_INSTANCE = new FilmServiceImpl(FILM_REPOSITORY_INSTANCE);
    }

    public Object getBean(String beanName) {
        switch (beanName) {
            case "filmService":
                return ApplicationContextHelper.FILM_SERVICE_INSTANCE;
            default:
                throw new BeanNotFoundException(String.format("Not found bean with name %s.", beanName));
        }
    }

}
