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

public class Film_setReleaseDate_149277904915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3082;
     Object term3127;

    public Film_setReleaseDate_149277904915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3115 = new HashMap();
        Set<Object> term3151 =  ((Map) term3115).keySet();
        HashSet term3114 = new HashSet((Collection<? extends Object>) term3151);
        HashMap term3121 = new HashMap();
        Set<Object> term3152 =  ((Map) term3121).keySet();
        HashSet term3120 = new HashSet((Collection<? extends Object>) term3152);
        term3082 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3107 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3112 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term3082, term3082.getClass(), "name", "CFyoseFGLF");
        setField(term3082, term3082.getClass(), "description", "SFqCrhEWLm");
        setIntField(term3107, term3107.getClass(), "year", 2017);
        setShortField(term3107, term3107.getClass(), "month", (short) 4);
        setShortField(term3107, term3107.getClass(), "day", (short) 2);
        setField(term3082, term3082.getClass(), "releaseDate", term3107);
        setLongField(term3082, term3082.getClass(), "duration", 6682528376118987775L);
        setField(term3112, term3112.getClass(), "name", null);
        setIntField(term3112, term3112.getClass(), "id", 0);
        setField(term3082, term3082.getClass(), "mpa", term3112);
        setField(term3082, term3082.getClass(), "genres", term3114);
        setField(term3082, term3082.getClass(), "likedUsers", term3120);
        setIntField(term3082, term3082.getClass(), "id", -268815336);
        term3127 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3127, term3127.getClass(), "year", 2016);
        setShortField(term3127, term3127.getClass(), "month", (short) 4);
        setShortField(term3127, term3127.getClass(), "day", (short) 30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term3127;
        callMethod(klass, "setReleaseDate", argTypes, term3082, args);
    }

};


