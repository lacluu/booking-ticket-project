package com.nghich.banned.clone;

import com.nghich.banned.clone.services.HttpCloneDataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class HttpCloneServiceTest {
    private HttpCloneDataService httpCloneDataService;

    @BeforeEach
    public void init() {
        httpCloneDataService = new HttpCloneDataService();
    }

    @Test
    public void testGetFilmShowing(){
        httpCloneDataService.cloneDataCinemas();

    }

    private static Stream<Arguments> provideDataForGetFilmShowing() {
        return Stream.of(
                Arguments.of(null, true)
        );
    }
}
