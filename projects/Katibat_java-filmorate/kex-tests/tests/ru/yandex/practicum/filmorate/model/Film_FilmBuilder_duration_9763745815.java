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

public class Film_FilmBuilder_duration_9763745815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2790;
     Object term2846;

    public Film_FilmBuilder_duration_9763745815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2791 = new Long(-3842548265506930260L);
        Integer term2821 = new Integer(-1922583790);
        term2790 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2817 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2823 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term2837 = newInstance(Class.forName("java.util.TreeSet"));
        Object term2838 = newInstance(Class.forName("java.util.TreeMap"));
        Object term2839 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2840 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term2842 = newInstance(Class.forName("java.lang.Object"));
        setField(term2790, term2790.getClass(), "id", term2791);
        setField(term2790, term2790.getClass(), "name", "XOiDvlDhdc");
        setField(term2790, term2790.getClass(), "description", "AdxvLJhNLe");
        setIntField(term2817, term2817.getClass(), "year", 2012);
        setShortField(term2817, term2817.getClass(), "month", (short) 4);
        setShortField(term2817, term2817.getClass(), "day", (short) 19);
        setField(term2790, term2790.getClass(), "releaseDate", term2817);
        setField(term2790, term2790.getClass(), "duration", term2821);
        setIntField(term2823, term2823.getClass(), "id", 767834723);
        setField(term2823, term2823.getClass(), "name", "lHfTrWKMPk");
        setField(term2790, term2790.getClass(), "mpa", term2823);
        setField(term2838, term2838.getClass(), "comparator", null);
        setIntField(term2840, term2840.getClass(), "id", -602026508);
        setField(term2840, term2840.getClass(), "name", null);
        setField(term2839, term2839.getClass(), "key", term2840);
        setField(term2839, term2839.getClass(), "value", term2842);
        setField(term2839, term2839.getClass(), "left", null);
        setField(term2839, term2839.getClass(), "right", null);
        setField(term2839, term2839.getClass(), "parent", null);
        setBooleanField(term2839, term2839.getClass(), "color", true);
        setField(term2838, term2838.getClass(), "root", term2839);
        setIntField(term2838, term2838.getClass(), "size", 1);
        setIntField(term2838, term2838.getClass(), "modCount", 1);
        setField(term2838, term2838.getClass(), "entrySet", null);
        setField(term2838, term2838.getClass(), "navigableKeySet", null);
        setField(term2838, term2838.getClass(), "descendingMap", null);
        setField(term2838, term2838.getClass(), "keySet", null);
        setField(term2838, term2838.getClass(), "values", null);
        setField(term2837, term2837.getClass(), "m", term2838);
        setField(term2790, term2790.getClass(), "genres", term2837);
        term2846 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2846;
        callMethod(klass, "duration", argTypes, term2790, args);
    }

};


