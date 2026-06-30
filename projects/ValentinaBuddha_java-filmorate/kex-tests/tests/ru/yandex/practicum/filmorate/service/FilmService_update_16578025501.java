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

public class FilmService_update_16578025501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370;
     Object term371;

    public FilmService_update_16578025501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term370 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term370, term370.getClass(), "filmStorage", null);
        setField(term370, term370.getClass(), "mpaStorage", null);
        setField(term370, term370.getClass(), "genreStorage", null);
        setField(term370, term370.getClass(), "likeStorage", null);
        setField(term370, term370.getClass(), "userStorage", null);
        Integer term372 = new Integer(-616727354);
        Integer term402 = new Integer(-1955890973);
        LinkedHashMap term419 = new LinkedHashMap();
        Set<Object> term469 =  ((Map) term419).keySet();
        LinkedHashSet term418 = new LinkedHashSet((Collection<? extends Object>) term469);
        term371 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term398 = newInstance(Class.forName("java.time.LocalDate"));
        Object term404 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term371, term371.getClass(), "id", term372);
        setField(term371, term371.getClass(), "name", "tbcdzjIfER");
        setField(term371, term371.getClass(), "description", "HyxfbSQYBe");
        setIntField(term398, term398.getClass(), "year", 2015);
        setShortField(term398, term398.getClass(), "month", (short) 9);
        setShortField(term398, term398.getClass(), "day", (short) 19);
        setField(term371, term371.getClass(), "releaseDate", term398);
        setField(term371, term371.getClass(), "duration", term402);
        setIntField(term404, term404.getClass(), "id", 1585847225);
        setField(term404, term404.getClass(), "name", "pCTimMblYc");
        setField(term371, term371.getClass(), "mpa", term404);
        setField(term371, term371.getClass(), "genres", term418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.FilmService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term371;
        callMethod(klass, "update", argTypes, term370, args);
    }

};


