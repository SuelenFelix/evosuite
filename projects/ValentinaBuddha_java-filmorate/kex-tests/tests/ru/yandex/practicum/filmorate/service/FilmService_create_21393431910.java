package ru.yandex.practicum.filmorate.service;

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
import static ru.yandex.practicum.filmorate.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class FilmService_create_21393431910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270;
     Object term271;

    public FilmService_create_21393431910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term270, term270.getClass(), "filmStorage", null);
        setField(term270, term270.getClass(), "mpaStorage", null);
        setField(term270, term270.getClass(), "genreStorage", null);
        setField(term270, term270.getClass(), "likeStorage", null);
        setField(term270, term270.getClass(), "userStorage", null);
        Integer term272 = new Integer(391863371);
        Integer term302 = new Integer(-1922583790);
        LinkedHashMap term319 = new LinkedHashMap();
        Set<Object> term369 =  ((Map) term319).keySet();
        LinkedHashSet term318 = new LinkedHashSet((Collection<? extends Object>) term369);
        term271 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term298 = newInstance(Class.forName("java.time.LocalDate"));
        Object term304 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term271, term271.getClass(), "id", term272);
        setField(term271, term271.getClass(), "name", "RMFIsYGgne");
        setField(term271, term271.getClass(), "description", "NRdvgJlhkX");
        setIntField(term298, term298.getClass(), "year", 2020);
        setShortField(term298, term298.getClass(), "month", (short) 11);
        setShortField(term298, term298.getClass(), "day", (short) 22);
        setField(term271, term271.getClass(), "releaseDate", term298);
        setField(term271, term271.getClass(), "duration", term302);
        setIntField(term304, term304.getClass(), "id", 1227103734);
        setField(term304, term304.getClass(), "name", "uuaPigETmJ");
        setField(term271, term271.getClass(), "mpa", term304);
        setField(term271, term271.getClass(), "genres", term318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.FilmService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term271;
        callMethod(klass, "create", argTypes, term270, args);
    }

};


