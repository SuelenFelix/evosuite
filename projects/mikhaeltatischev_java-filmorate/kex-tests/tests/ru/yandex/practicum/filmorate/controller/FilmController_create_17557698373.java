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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FilmController_create_17557698373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366;
     Object term367;

    public FilmController_create_17557698373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        setField(term366, term366.getClass(), "filmService", null);
        Long term368 = new Long(1967728129628047933L);
        Integer term398 = new Integer(1227103734);
        Integer term401 = new Integer(-1339778481);
        HashMap term416 = new HashMap();
        Set<Object> term473 =  ((Map) term416).keySet();
        HashSet term415 = new HashSet((Collection<? extends Object>) term473);
        HashMap term425 = new HashMap();
        Set<Object> term474 =  ((Map) term425).keySet();
        HashSet term424 = new HashSet((Collection<? extends Object>) term474);
        Integer term441 = new Integer(-522618178);
        term367 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term394 = newInstance(Class.forName("java.time.LocalDate"));
        Object term400 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term367, term367.getClass(), "id", term368);
        setField(term367, term367.getClass(), "name", "MxlszYVzRf");
        setField(term367, term367.getClass(), "description", "LQFpaHEwXR");
        setIntField(term394, term394.getClass(), "year", 2020);
        setShortField(term394, term394.getClass(), "month", (short) 11);
        setShortField(term394, term394.getClass(), "day", (short) 22);
        setField(term367, term367.getClass(), "releaseDate", term394);
        setField(term367, term367.getClass(), "duration", term398);
        setField(term400, term400.getClass(), "id", term401);
        setField(term400, term400.getClass(), "name", "oVcInYnLWB");
        setField(term367, term367.getClass(), "mpa", term400);
        setField(term367, term367.getClass(), "genres", term415);
        setField(term367, term367.getClass(), "likes", term424);
        setField(term367, term367.getClass(), "rate", term441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Object[] args = new Object[1];
        args[0] = term367;
        callMethod(klass, "create", argTypes, term366, args);
    }

};


