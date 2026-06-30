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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class FilmController_create_7919935490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226;
     Object term228;

    public FilmController_create_7919935490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        Object term227 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term227, term227.getClass(), "filmStorage", null);
        setField(term227, term227.getClass(), "mpaStorage", null);
        setField(term227, term227.getClass(), "genreStorage", null);
        setField(term227, term227.getClass(), "likeStorage", null);
        setField(term227, term227.getClass(), "userStorage", null);
        setField(term226, term226.getClass(), "filmService", term227);
        Integer term229 = new Integer(1484323161);
        Integer term259 = new Integer(391863371);
        LinkedHashMap term276 = new LinkedHashMap();
        Set<Object> term328 =  ((Map) term276).keySet();
        LinkedHashSet term275 = new LinkedHashSet((Collection<? extends Object>) term328);
        term228 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term255 = newInstance(Class.forName("java.time.LocalDate"));
        Object term261 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term228, term228.getClass(), "id", term229);
        setField(term228, term228.getClass(), "name", "SzjVpOQTyS");
        setField(term228, term228.getClass(), "description", "MjGYSRKTNF");
        setIntField(term255, term255.getClass(), "year", 2021);
        setShortField(term255, term255.getClass(), "month", (short) 1);
        setShortField(term255, term255.getClass(), "day", (short) 18);
        setField(term228, term228.getClass(), "releaseDate", term255);
        setField(term228, term228.getClass(), "duration", term259);
        setIntField(term261, term261.getClass(), "id", 1725571209);
        setField(term261, term261.getClass(), "name", "hRNSzYYIrc");
        setField(term228, term228.getClass(), "mpa", term261);
        setField(term228, term228.getClass(), "genres", term275);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term228;
        callMethod(klass, "create", argTypes, term226, args);
    }

};


