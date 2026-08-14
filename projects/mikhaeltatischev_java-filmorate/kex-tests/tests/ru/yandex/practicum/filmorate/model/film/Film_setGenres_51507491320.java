package ru.yandex.practicum.filmorate.model.film;

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
import static ru.yandex.practicum.filmorate.model.film.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Film_setGenres_51507491320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2278;
     Object term2355;

    public Film_setGenres_51507491320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2279 = new Long(4266570509071948633L);
        Integer term2309 = new Integer(1555897383);
        Integer term2312 = new Integer(202001407);
        HashMap term2327 = new HashMap();
        Set<Object> term2391 =  ((Map) term2327).keySet();
        HashSet term2326 = new HashSet((Collection<? extends Object>) term2391);
        HashMap term2333 = new HashMap();
        Set<Object> term2392 =  ((Map) term2333).keySet();
        HashSet term2332 = new HashSet((Collection<? extends Object>) term2392);
        Integer term2353 = new Integer(158873461);
        term2278 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term2305 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2311 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term2278, term2278.getClass(), "id", term2279);
        setField(term2278, term2278.getClass(), "name", "WHcwFgsGFC");
        setField(term2278, term2278.getClass(), "description", "HzqpegHiRq");
        setIntField(term2305, term2305.getClass(), "year", 2027);
        setShortField(term2305, term2305.getClass(), "month", (short) 3);
        setShortField(term2305, term2305.getClass(), "day", (short) 14);
        setField(term2278, term2278.getClass(), "releaseDate", term2305);
        setField(term2278, term2278.getClass(), "duration", term2309);
        setField(term2311, term2311.getClass(), "id", term2312);
        setField(term2311, term2311.getClass(), "name", "jwsfVjMoJT");
        setField(term2278, term2278.getClass(), "mpa", term2311);
        setField(term2278, term2278.getClass(), "genres", term2326);
        setField(term2278, term2278.getClass(), "likes", term2332);
        setField(term2278, term2278.getClass(), "rate", term2353);
        HashMap term2356 = new HashMap();
        Set<Object> term2393 =  ((Map) term2356).keySet();
        term2355 = new HashSet((Collection<? extends Object>) term2393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term2355;
        callMethod(klass, "setGenres", argTypes, term2278, args);
    }

};


