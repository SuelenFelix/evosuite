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

public class Film_getLikedUsers_118113465112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2837;

    public Film_getLikedUsers_118113465112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2870 = new HashMap();
        Set<Object> term2902 =  ((Map) term2870).keySet();
        HashSet term2869 = new HashSet((Collection<? extends Object>) term2902);
        HashMap term2876 = new HashMap();
        Set<Object> term2903 =  ((Map) term2876).keySet();
        HashSet term2875 = new HashSet((Collection<? extends Object>) term2903);
        term2837 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2862 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2867 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term2837, term2837.getClass(), "name", "hOncybyCAH");
        setField(term2837, term2837.getClass(), "description", "QduALnDSVo");
        setIntField(term2862, term2862.getClass(), "year", 2013);
        setShortField(term2862, term2862.getClass(), "month", (short) 2);
        setShortField(term2862, term2862.getClass(), "day", (short) 2);
        setField(term2837, term2837.getClass(), "releaseDate", term2862);
        setLongField(term2837, term2837.getClass(), "duration", -5248475803419977214L);
        setField(term2867, term2867.getClass(), "name", null);
        setIntField(term2867, term2867.getClass(), "id", 0);
        setField(term2837, term2837.getClass(), "mpa", term2867);
        setField(term2837, term2837.getClass(), "genres", term2869);
        setField(term2837, term2837.getClass(), "likedUsers", term2875);
        setIntField(term2837, term2837.getClass(), "id", -1888585309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLikedUsers", argTypes, term2837, args);
    }

};


