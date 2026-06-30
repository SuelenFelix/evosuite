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

public class FilmService_validate_19242876901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194;
     Object term195;

    public FilmService_validate_19242876901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term194, term194.getClass(), "userStorage", null);
        setField(term194, term194.getClass(), "storage", null);
        HashMap term228 = new HashMap();
        Set<Object> term260 =  ((Map) term228).keySet();
        HashSet term227 = new HashSet((Collection<? extends Object>) term260);
        HashMap term234 = new HashMap();
        Set<Object> term261 =  ((Map) term234).keySet();
        HashSet term233 = new HashSet((Collection<? extends Object>) term261);
        term195 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term225 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term195, term195.getClass(), "name", "aJlieCFVtF");
        setField(term195, term195.getClass(), "description", "ZiaGIbnzTs");
        setIntField(term220, term220.getClass(), "year", 2015);
        setShortField(term220, term220.getClass(), "month", (short) 4);
        setShortField(term220, term220.getClass(), "day", (short) 14);
        setField(term195, term195.getClass(), "releaseDate", term220);
        setLongField(term195, term195.getClass(), "duration", 7411271909051562686L);
        setField(term225, term225.getClass(), "name", null);
        setIntField(term225, term225.getClass(), "id", 0);
        setField(term195, term195.getClass(), "mpa", term225);
        setField(term195, term195.getClass(), "genres", term227);
        setField(term195, term195.getClass(), "likedUsers", term233);
        setIntField(term195, term195.getClass(), "id", -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.FilmService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term195;
        callMethod(klass, "validate", argTypes, term194, args);
    }

};


