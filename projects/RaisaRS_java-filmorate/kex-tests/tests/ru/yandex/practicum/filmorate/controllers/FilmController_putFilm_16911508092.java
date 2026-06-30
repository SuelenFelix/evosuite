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

public class FilmController_putFilm_16911508092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143;
     Object term144;

    public FilmController_putFilm_16911508092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controllers.FilmController"));
        setField(term143, term143.getClass(), "filmService", null);
        HashMap term202 = new HashMap();
        Set<Object> term275 =  ((Map) term202).keySet();
        HashSet term201 = new HashSet((Collection<? extends Object>) term275);
        HashMap term213 = new HashMap();
        Set<Object> term276 =  ((Map) term213).keySet();
        HashSet term212 = new HashSet((Collection<? extends Object>) term276);
        term144 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term170 = newInstance(Class.forName("java.time.LocalDate"));
        Object term175 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term144, term144.getClass(), "id", 6375119433582206027L);
        setField(term144, term144.getClass(), "name", "RMFIsYGgne");
        setField(term144, term144.getClass(), "description", "NRdvgJlhkX");
        setIntField(term170, term170.getClass(), "year", 2016);
        setShortField(term170, term170.getClass(), "month", (short) 11);
        setShortField(term170, term170.getClass(), "day", (short) 29);
        setField(term144, term144.getClass(), "releaseDate", term170);
        setIntField(term144, term144.getClass(), "duration", 1227103734);
        setIntField(term175, term175.getClass(), "id", -1339778481);
        setField(term175, term175.getClass(), "name", "uuaPigETmJ");
        setField(term175, term175.getClass(), "description", "MxlszYVzRf");
        setField(term144, term144.getClass(), "mpa", term175);
        setField(term144, term144.getClass(), "genres", term201);
        setField(term144, term144.getClass(), "likes", term212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controllers.FilmController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term144;
        callMethod(klass, "putFilm", argTypes, term143, args);
    }

};


