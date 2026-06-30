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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class Film_FilmBuilder_genres_3456138117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2992;
     Object term3050;

    public Film_FilmBuilder_genres_3456138117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2993 = new Long(2936323121573284007L);
        Integer term3023 = new Integer(-2038273078);
        term2992 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3019 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3025 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term3039 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3040 = newInstance(Class.forName("java.util.TreeMap"));
        Object term3041 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3042 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term3044 = newInstance(Class.forName("java.lang.Object"));
        Object term3045 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term2992, term2992.getClass(), "id", term2993);
        setField(term2992, term2992.getClass(), "name", "VMeAzAHwZj");
        setField(term2992, term2992.getClass(), "description", "PznxWXsZME");
        setIntField(term3019, term3019.getClass(), "year", 2023);
        setShortField(term3019, term3019.getClass(), "month", (short) 8);
        setShortField(term3019, term3019.getClass(), "day", (short) 12);
        setField(term2992, term2992.getClass(), "releaseDate", term3019);
        setField(term2992, term2992.getClass(), "duration", term3023);
        setIntField(term3025, term3025.getClass(), "id", 454281060);
        setField(term3025, term3025.getClass(), "name", "ZzIujlwVsw");
        setField(term2992, term2992.getClass(), "mpa", term3025);
        setField(term3040, term3040.getClass(), "comparator", null);
        setIntField(term3042, term3042.getClass(), "id", -1786399638);
        setField(term3042, term3042.getClass(), "name", null);
        setField(term3041, term3041.getClass(), "key", term3042);
        setField(term3041, term3041.getClass(), "value", term3044);
        setField(term3045, term3045.getClass(), "key", null);
        setField(term3045, term3045.getClass(), "value", term3044);
        setField(term3045, term3045.getClass(), "left", null);
        setField(term3045, term3045.getClass(), "right", null);
        setField(term3045, term3045.getClass(), "parent", term3041);
        setBooleanField(term3045, term3045.getClass(), "color", false);
        setField(term3041, term3041.getClass(), "left", term3045);
        setField(term3041, term3041.getClass(), "right", null);
        setField(term3041, term3041.getClass(), "parent", null);
        setBooleanField(term3041, term3041.getClass(), "color", true);
        setField(term3040, term3040.getClass(), "root", term3041);
        setIntField(term3040, term3040.getClass(), "size", 2);
        setIntField(term3040, term3040.getClass(), "modCount", 2);
        setField(term3040, term3040.getClass(), "entrySet", null);
        setField(term3040, term3040.getClass(), "navigableKeySet", null);
        setField(term3040, term3040.getClass(), "descendingMap", null);
        setField(term3040, term3040.getClass(), "keySet", null);
        setField(term3040, term3040.getClass(), "values", null);
        setField(term3039, term3039.getClass(), "m", term3040);
        setField(term2992, term2992.getClass(), "genres", term3039);
        term3050 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3051 = newInstance(Class.forName("java.util.TreeMap"));
        Object term3052 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3053 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term3056 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3057 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term3059 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3062 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3063 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term3065 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term3051, term3051.getClass(), "comparator", null);
        setIntField(term3053, term3053.getClass(), "id", 292681826);
        setField(term3053, term3053.getClass(), "name", "");
        setField(term3052, term3052.getClass(), "key", term3053);
        setField(term3052, term3052.getClass(), "value", term3044);
        setIntField(term3057, term3057.getClass(), "id", -1048298087);
        setField(term3057, term3057.getClass(), "name", null);
        setField(term3056, term3056.getClass(), "key", term3057);
        setField(term3056, term3056.getClass(), "value", term3044);
        setField(term3056, term3056.getClass(), "left", null);
        setField(term3059, term3059.getClass(), "key", null);
        setField(term3059, term3059.getClass(), "value", term3044);
        setField(term3059, term3059.getClass(), "left", null);
        setField(term3059, term3059.getClass(), "right", null);
        setField(term3059, term3059.getClass(), "parent", term3056);
        setBooleanField(term3059, term3059.getClass(), "color", false);
        setField(term3056, term3056.getClass(), "right", term3059);
        setField(term3056, term3056.getClass(), "parent", term3052);
        setBooleanField(term3056, term3056.getClass(), "color", true);
        setField(term3052, term3052.getClass(), "left", term3056);
        setIntField(term3063, term3063.getClass(), "id", 458147407);
        setField(term3063, term3063.getClass(), "name", null);
        setField(term3062, term3062.getClass(), "key", term3063);
        setField(term3062, term3062.getClass(), "value", term3044);
        setField(term3062, term3062.getClass(), "left", null);
        setField(term3065, term3065.getClass(), "key", null);
        setField(term3065, term3065.getClass(), "value", term3044);
        setField(term3065, term3065.getClass(), "left", null);
        setField(term3065, term3065.getClass(), "right", null);
        setField(term3065, term3065.getClass(), "parent", term3062);
        setBooleanField(term3065, term3065.getClass(), "color", false);
        setField(term3062, term3062.getClass(), "right", term3065);
        setField(term3062, term3062.getClass(), "parent", term3052);
        setBooleanField(term3062, term3062.getClass(), "color", true);
        setField(term3052, term3052.getClass(), "right", term3062);
        setField(term3052, term3052.getClass(), "parent", null);
        setBooleanField(term3052, term3052.getClass(), "color", true);
        setField(term3051, term3051.getClass(), "root", term3052);
        setIntField(term3051, term3051.getClass(), "size", 5);
        setIntField(term3051, term3051.getClass(), "modCount", 5);
        setField(term3051, term3051.getClass(), "entrySet", null);
        setField(term3051, term3051.getClass(), "navigableKeySet", null);
        setField(term3051, term3051.getClass(), "descendingMap", null);
        setField(term3051, term3051.getClass(), "keySet", null);
        setField(term3051, term3051.getClass(), "values", null);
        setField(term3050, term3050.getClass(), "m", term3051);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TreeSet");
        Object[] args = new Object[1];
        args[0] = term3050;
        callMethod(klass, "genres", argTypes, term2992, args);
    }

};


