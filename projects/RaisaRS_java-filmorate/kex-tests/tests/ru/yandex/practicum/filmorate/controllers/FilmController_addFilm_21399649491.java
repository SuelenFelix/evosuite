package ru.yandex.practicum.filmorate.controllers;

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
import static ru.yandex.practicum.filmorate.controllers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FilmController_addFilm_21399649491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;
     Object term10;

    public FilmController_addFilm_21399649491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controllers.FilmController"));
        setField(term9, term9.getClass(), "filmService", null);
        HashMap term68 = new HashMap();
        Set<Object> term141 =  ((Map) term68).keySet();
        HashSet term67 = new HashSet((Collection<? extends Object>) term141);
        HashMap term83 = new HashMap();
        Set<Object> term142 =  ((Map) term83).keySet();
        HashSet term82 = new HashSet((Collection<? extends Object>) term142);
        term10 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term36 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term10, term10.getClass(), "id", 2442117782898005296L);
        setField(term10, term10.getClass(), "name", "PAEBtnZtTD");
        setField(term10, term10.getClass(), "description", "sjlJAEtRrb");
        setIntField(term36, term36.getClass(), "year", 2012);
        setShortField(term36, term36.getClass(), "month", (short) 8);
        setShortField(term36, term36.getClass(), "day", (short) 25);
        setField(term10, term10.getClass(), "releaseDate", term36);
        setIntField(term10, term10.getClass(), "duration", 1162663216);
        setIntField(term41, term41.getClass(), "id", 1484323161);
        setField(term41, term41.getClass(), "name", "MuLcgQHgqz");
        setField(term41, term41.getClass(), "description", "xxtlPwDYFs");
        setField(term10, term10.getClass(), "mpa", term41);
        setField(term10, term10.getClass(), "genres", term67);
        setField(term10, term10.getClass(), "likes", term82);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controllers.FilmController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term10;
        callMethod(klass, "addFilm", argTypes, term9, args);
    }

};


