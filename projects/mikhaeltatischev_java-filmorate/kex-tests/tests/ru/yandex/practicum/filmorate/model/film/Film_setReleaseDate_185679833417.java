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

public class Film_setReleaseDate_185679833417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1919;
     Object term1995;

    public Film_setReleaseDate_185679833417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1920 = new Long(7495904023107549024L);
        Integer term1950 = new Integer(53410913);
        Integer term1953 = new Integer(-375014958);
        HashMap term1968 = new HashMap();
        Set<Object> term2029 =  ((Map) term1968).keySet();
        HashSet term1967 = new HashSet((Collection<? extends Object>) term2029);
        HashMap term1979 = new HashMap();
        Set<Object> term2030 =  ((Map) term1979).keySet();
        HashSet term1978 = new HashSet((Collection<? extends Object>) term2030);
        Integer term1993 = new Integer(-341152642);
        term1919 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term1946 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1952 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term1919, term1919.getClass(), "id", term1920);
        setField(term1919, term1919.getClass(), "name", "xIeFjkHkOe");
        setField(term1919, term1919.getClass(), "description", "SdCKLMIYnX");
        setIntField(term1946, term1946.getClass(), "year", 2015);
        setShortField(term1946, term1946.getClass(), "month", (short) 7);
        setShortField(term1946, term1946.getClass(), "day", (short) 24);
        setField(term1919, term1919.getClass(), "releaseDate", term1946);
        setField(term1919, term1919.getClass(), "duration", term1950);
        setField(term1952, term1952.getClass(), "id", term1953);
        setField(term1952, term1952.getClass(), "name", "OJJtVNPyKZ");
        setField(term1919, term1919.getClass(), "mpa", term1952);
        setField(term1919, term1919.getClass(), "genres", term1967);
        setField(term1919, term1919.getClass(), "likes", term1978);
        setField(term1919, term1919.getClass(), "rate", term1993);
        term1995 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1995, term1995.getClass(), "year", 2022);
        setShortField(term1995, term1995.getClass(), "month", (short) 11);
        setShortField(term1995, term1995.getClass(), "day", (short) 16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term1995;
        callMethod(klass, "setReleaseDate", argTypes, term1919, args);
    }

};


