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

public class FilmDbService_updateFilm_12720501042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151;
     Object term152;

    public FilmDbService_updateFilm_12720501042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmDbService"));
        setField(term151, term151.getClass(), "filmStorage", null);
        setField(term151, term151.getClass(), "userService", null);
        setField(term151, term151.getClass(), "genreStorage", null);
        HashMap term210 = new HashMap();
        Set<Object> term285 =  ((Map) term210).keySet();
        HashSet term209 = new HashSet((Collection<? extends Object>) term285);
        HashMap term223 = new HashMap();
        Set<Object> term286 =  ((Map) term223).keySet();
        HashSet term222 = new HashSet((Collection<? extends Object>) term286);
        term152 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term178 = newInstance(Class.forName("java.time.LocalDate"));
        Object term183 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term152, term152.getClass(), "id", 6375119433582206027L);
        setField(term152, term152.getClass(), "name", "RMFIsYGgne");
        setField(term152, term152.getClass(), "description", "NRdvgJlhkX");
        setIntField(term178, term178.getClass(), "year", 2016);
        setShortField(term178, term178.getClass(), "month", (short) 11);
        setShortField(term178, term178.getClass(), "day", (short) 29);
        setField(term152, term152.getClass(), "releaseDate", term178);
        setIntField(term152, term152.getClass(), "duration", -1339778481);
        setIntField(term183, term183.getClass(), "id", 1725571209);
        setField(term183, term183.getClass(), "name", "uuaPigETmJ");
        setField(term183, term183.getClass(), "description", "MxlszYVzRf");
        setField(term152, term152.getClass(), "mpa", term183);
        setField(term152, term152.getClass(), "genres", term209);
        setField(term152, term152.getClass(), "likes", term222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.FilmDbService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term152;
        callMethod(klass, "updateFilm", argTypes, term151, args);
    }

};


