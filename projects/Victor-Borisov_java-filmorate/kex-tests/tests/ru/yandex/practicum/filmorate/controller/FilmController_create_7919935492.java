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
import java.lang.Integer;
import java.util.ArrayList;

public class FilmController_create_7919935492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288;
     Object term290;

    public FilmController_create_7919935492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        Object term289 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.film.FilmService"));
        setField(term289, term289.getClass(), "filmStorage", null);
        setField(term289, term289.getClass(), "filmLikeStorage", null);
        setField(term289, term289.getClass(), "genreStorage", null);
        setField(term288, term288.getClass(), "filmService", term289);
        Integer term291 = new Integer(1585847225);
        Integer term323 = new Integer(597278769);
        Integer term340 = new Integer(-1685132342);
        Object term339 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term339, term339.getClass(), "id", term340);
        setField(term339, term339.getClass(), "name", "");
        Integer term344 = new Integer(-1456670397);
        Object term343 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term343, term343.getClass(), "id", term344);
        setField(term343, term343.getClass(), "name", "");
        Integer term348 = new Integer(1622346318);
        Object term347 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term347, term347.getClass(), "id", term348);
        setField(term347, term347.getClass(), "name", "");
        Integer term352 = new Integer(1048535127);
        Object term351 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term351, term351.getClass(), "id", term352);
        setField(term351, term351.getClass(), "name", "");
        Integer term356 = new Integer(-655067527);
        Object term355 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term355, term355.getClass(), "id", term356);
        setField(term355, term355.getClass(), "name", "");
        ArrayList term337 = new ArrayList();
        ((ArrayList) term337).add(term339);
        ((ArrayList) term337).add(term343);
        ((ArrayList) term337).add(term347);
        ((ArrayList) term337).add(term351);
        ((ArrayList) term337).add(term355);
        term290 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term317 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term290, term290.getClass(), "id", term291);
        setField(term290, term290.getClass(), "name", "RMFIsYGgne");
        setField(term290, term290.getClass(), "description", "NRdvgJlhkX");
        setIntField(term317, term317.getClass(), "year", 2020);
        setShortField(term317, term317.getClass(), "month", (short) 11);
        setShortField(term317, term317.getClass(), "day", (short) 22);
        setField(term290, term290.getClass(), "releaseDate", term317);
        setIntField(term290, term290.getClass(), "duration", 568599855);
        setField(term322, term322.getClass(), "id", term323);
        setField(term322, term322.getClass(), "name", "uuaPigETmJ");
        setField(term290, term290.getClass(), "mpa", term322);
        setField(term290, term290.getClass(), "genres", term337);
        setIntField(term290, term290.getClass(), "rate", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term290;
        callMethod(klass, "create", argTypes, term288, args);
    }

};


