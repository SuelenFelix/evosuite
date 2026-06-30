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

public class Film_FilmBuilder_build_596316548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3101;

    public Film_FilmBuilder_build_596316548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3102 = new Long(-1154553077993834885L);
        Integer term3132 = new Integer(1227103734);
        term3101 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3128 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3134 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term3148 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3149 = newInstance(Class.forName("java.util.TreeMap"));
        Object term3150 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3151 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term3153 = newInstance(Class.forName("java.lang.Object"));
        Object term3154 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3156 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term3101, term3101.getClass(), "id", term3102);
        setField(term3101, term3101.getClass(), "name", "FPvxVzzSvD");
        setField(term3101, term3101.getClass(), "description", "WHcwFgsGFC");
        setIntField(term3128, term3128.getClass(), "year", 2015);
        setShortField(term3128, term3128.getClass(), "month", (short) 9);
        setShortField(term3128, term3128.getClass(), "day", (short) 15);
        setField(term3101, term3101.getClass(), "releaseDate", term3128);
        setField(term3101, term3101.getClass(), "duration", term3132);
        setIntField(term3134, term3134.getClass(), "id", 1328271830);
        setField(term3134, term3134.getClass(), "name", "HzqpegHiRq");
        setField(term3101, term3101.getClass(), "mpa", term3134);
        setField(term3149, term3149.getClass(), "comparator", null);
        setIntField(term3151, term3151.getClass(), "id", 1596070772);
        setField(term3151, term3151.getClass(), "name", null);
        setField(term3150, term3150.getClass(), "key", term3151);
        setField(term3150, term3150.getClass(), "value", term3153);
        setField(term3154, term3154.getClass(), "key", null);
        setField(term3154, term3154.getClass(), "value", term3153);
        setField(term3154, term3154.getClass(), "left", null);
        setField(term3154, term3154.getClass(), "right", null);
        setField(term3154, term3154.getClass(), "parent", term3150);
        setBooleanField(term3154, term3154.getClass(), "color", false);
        setField(term3150, term3150.getClass(), "left", term3154);
        setField(term3156, term3156.getClass(), "key", null);
        setField(term3156, term3156.getClass(), "value", term3153);
        setField(term3156, term3156.getClass(), "left", null);
        setField(term3156, term3156.getClass(), "right", null);
        setField(term3156, term3156.getClass(), "parent", term3150);
        setBooleanField(term3156, term3156.getClass(), "color", true);
        setField(term3150, term3150.getClass(), "right", term3156);
        setField(term3150, term3150.getClass(), "parent", null);
        setBooleanField(term3150, term3150.getClass(), "color", true);
        setField(term3149, term3149.getClass(), "root", term3150);
        setIntField(term3149, term3149.getClass(), "size", 9);
        setIntField(term3149, term3149.getClass(), "modCount", 9);
        setField(term3149, term3149.getClass(), "entrySet", null);
        setField(term3149, term3149.getClass(), "navigableKeySet", null);
        setField(term3149, term3149.getClass(), "descendingMap", null);
        setField(term3149, term3149.getClass(), "keySet", null);
        setField(term3149, term3149.getClass(), "values", null);
        setField(term3148, term3148.getClass(), "m", term3149);
        setField(term3101, term3101.getClass(), "genres", term3148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3101, args);
    }

};


