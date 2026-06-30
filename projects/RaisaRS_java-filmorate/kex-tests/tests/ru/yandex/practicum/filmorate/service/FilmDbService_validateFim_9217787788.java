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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FilmDbService_validateFim_9217787788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304;
     Object term305;

    public FilmDbService_validateFim_9217787788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmDbService"));
        setField(term304, term304.getClass(), "filmStorage", null);
        setField(term304, term304.getClass(), "userService", null);
        setField(term304, term304.getClass(), "genreStorage", null);
        HashMap term363 = new HashMap();
        Set<Object> term442 =  ((Map) term363).keySet();
        HashSet term362 = new HashSet((Collection<? extends Object>) term442);
        HashMap term372 = new HashMap();
        Set<Object> term443 =  ((Map) term372).keySet();
        HashSet term371 = new HashSet((Collection<? extends Object>) term443);
        term305 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term336 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term305, term305.getClass(), "id", 6811161968424632369L);
        setField(term305, term305.getClass(), "name", "ZiaGIbnzTs");
        setField(term305, term305.getClass(), "description", "tbcdzjIfER");
        setIntField(term331, term331.getClass(), "year", 2021);
        setShortField(term331, term331.getClass(), "month", (short) 1);
        setShortField(term331, term331.getClass(), "day", (short) 18);
        setField(term305, term305.getClass(), "releaseDate", term331);
        setIntField(term305, term305.getClass(), "duration", 597278769);
        setIntField(term336, term336.getClass(), "id", -1685132342);
        setField(term336, term336.getClass(), "name", "HyxfbSQYBe");
        setField(term336, term336.getClass(), "description", "pCTimMblYc");
        setField(term305, term305.getClass(), "mpa", term336);
        setField(term305, term305.getClass(), "genres", term362);
        setField(term305, term305.getClass(), "likes", term371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.FilmDbService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term305;
        callMethod(klass, "validateFim", argTypes, term304, args);
    }

};


