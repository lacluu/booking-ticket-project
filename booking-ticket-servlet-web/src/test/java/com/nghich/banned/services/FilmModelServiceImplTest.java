package com.nghich.banned.services;

import com.nghich.banned.configurations.BookingTicketApplicationContext;
import com.nghich.banned.entities.FilmModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FilmModelServiceImplTest {
    private BookingTicketApplicationContext bookingTicketApplicationContext;
    private FilmService filmService;

    @BeforeEach
    public void init() {
        bookingTicketApplicationContext = BookingTicketApplicationContext.getInstance();
        filmService = (FilmService) bookingTicketApplicationContext.getBean("filmService");
    }

    @Test
    public void testGetFilmShowing(){
        List<FilmModel> showingFilmModelHomepage = filmService.getShowingFilmHomepage();
        assertThat(showingFilmModelHomepage.size(), is(22));
    }

    private static Stream<Arguments> provideDataForGetFilmShowing() {
        return Stream.of(
                Arguments.of(null, true)
        );
    }

}
