package ru.yandex.practicum.filmorate.controller;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static ru.yandex.practicum.filmorate.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FilmController_postNewFilm_11274998613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344;
     Object term346;

    public FilmController_postNewFilm_11274998613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        Object term345 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term345, term345.getClass(), "userStorage", null);
        setField(term345, term345.getClass(), "storage", null);
        setField(term344, term344.getClass(), "filmService", term345);
        HashMap term379 = new HashMap();
        Set<Object> term411 =  ((Map) term379).keySet();
        HashSet term378 = new HashSet((Collection<? extends Object>) term411);
        HashMap term385 = new HashMap();
        Set<Object> term412 =  ((Map) term385).keySet();
        HashSet term384 = new HashSet((Collection<? extends Object>) term412);
        term346 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term371 = newInstance(Class.forName("java.time.LocalDate"));
        Object term376 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term346, term346.getClass(), "name", "flxyYxBRtu");
        setField(term346, term346.getClass(), "description", "OclPbYPkcH");
        setIntField(term371, term371.getClass(), "year", 2020);
        setShortField(term371, term371.getClass(), "month", (short) 5);
        setShortField(term371, term371.getClass(), "day", (short) 14);
        setField(term346, term346.getClass(), "releaseDate", term371);
        setLongField(term346, term346.getClass(), "duration", 6967924379644551255L);
        setField(term376, term376.getClass(), "name", null);
        setIntField(term376, term376.getClass(), "id", 0);
        setField(term346, term346.getClass(), "mpa", term376);
        setField(term346, term346.getClass(), "genres", term378);
        setField(term346, term346.getClass(), "likedUsers", term384);
        setIntField(term346, term346.getClass(), "id", 865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term346;
        callMethod(klass, "postNewFilm", argTypes, term344, args);
    }

};


