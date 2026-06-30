package ru.yandex.practicum.filmorate.model;

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
import static ru.yandex.practicum.filmorate.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Film_setGenres_43031500018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3313;
     Object term3358;

    public Film_setGenres_43031500018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3346 = new HashMap();
        Set<Object> term3416 =  ((Map) term3346).keySet();
        HashSet term3345 = new HashSet((Collection<? extends Object>) term3416);
        HashMap term3352 = new HashMap();
        Set<Object> term3417 =  ((Map) term3352).keySet();
        HashSet term3351 = new HashSet((Collection<? extends Object>) term3417);
        term3313 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3338 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3343 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term3313, term3313.getClass(), "name", "qCpEbQDHdF");
        setField(term3313, term3313.getClass(), "description", "AHbZyFOmlo");
        setIntField(term3338, term3338.getClass(), "year", 2013);
        setShortField(term3338, term3338.getClass(), "month", (short) 5);
        setShortField(term3338, term3338.getClass(), "day", (short) 26);
        setField(term3313, term3313.getClass(), "releaseDate", term3338);
        setLongField(term3313, term3313.getClass(), "duration", 9013624480170062917L);
        setField(term3343, term3343.getClass(), "name", null);
        setIntField(term3343, term3343.getClass(), "id", 0);
        setField(term3313, term3313.getClass(), "mpa", term3343);
        setField(term3313, term3313.getClass(), "genres", term3345);
        setField(term3313, term3313.getClass(), "likedUsers", term3351);
        setIntField(term3313, term3313.getClass(), "id", -615654495);
        HashMap term3359 = new HashMap();
        Set<Object> term3418 =  ((Map) term3359).keySet();
        term3358 = new HashSet((Collection<? extends Object>) term3418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term3358;
        callMethod(klass, "setGenres", argTypes, term3313, args);
    }

};


