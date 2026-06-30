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

public class Film_FilmBuilder_releaseDate_1450949264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2696;
     Object term2756;

    public Film_FilmBuilder_releaseDate_1450949264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2697 = new Long(-4443169559037975007L);
        Integer term2727 = new Integer(391863371);
        term2696 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2723 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2729 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term2743 = newInstance(Class.forName("java.util.TreeSet"));
        Object term2744 = newInstance(Class.forName("java.util.TreeMap"));
        Object term2745 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2746 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term2748 = newInstance(Class.forName("java.lang.Object"));
        Object term2749 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2751 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term2696, term2696.getClass(), "id", term2697);
        setField(term2696, term2696.getClass(), "name", "iNwOJRBEjp");
        setField(term2696, term2696.getClass(), "description", "XylxrMBraH");
        setIntField(term2723, term2723.getClass(), "year", 2025);
        setShortField(term2723, term2723.getClass(), "month", (short) 2);
        setShortField(term2723, term2723.getClass(), "day", (short) 13);
        setField(term2696, term2696.getClass(), "releaseDate", term2723);
        setField(term2696, term2696.getClass(), "duration", term2727);
        setIntField(term2729, term2729.getClass(), "id", -1530420153);
        setField(term2729, term2729.getClass(), "name", "pORebkoRdD");
        setField(term2696, term2696.getClass(), "mpa", term2729);
        setField(term2744, term2744.getClass(), "comparator", null);
        setIntField(term2746, term2746.getClass(), "id", -469968304);
        setField(term2746, term2746.getClass(), "name", null);
        setField(term2745, term2745.getClass(), "key", term2746);
        setField(term2745, term2745.getClass(), "value", term2748);
        setField(term2749, term2749.getClass(), "key", null);
        setField(term2749, term2749.getClass(), "value", term2748);
        setField(term2749, term2749.getClass(), "left", null);
        setField(term2749, term2749.getClass(), "right", null);
        setField(term2749, term2749.getClass(), "parent", term2745);
        setBooleanField(term2749, term2749.getClass(), "color", true);
        setField(term2745, term2745.getClass(), "left", term2749);
        setField(term2751, term2751.getClass(), "key", null);
        setField(term2751, term2751.getClass(), "value", term2748);
        setField(term2751, term2751.getClass(), "left", null);
        setField(term2751, term2751.getClass(), "right", null);
        setField(term2751, term2751.getClass(), "parent", term2745);
        setBooleanField(term2751, term2751.getClass(), "color", true);
        setField(term2745, term2745.getClass(), "right", term2751);
        setField(term2745, term2745.getClass(), "parent", null);
        setBooleanField(term2745, term2745.getClass(), "color", true);
        setField(term2744, term2744.getClass(), "root", term2745);
        setIntField(term2744, term2744.getClass(), "size", 4);
        setIntField(term2744, term2744.getClass(), "modCount", 4);
        setField(term2744, term2744.getClass(), "entrySet", null);
        setField(term2744, term2744.getClass(), "navigableKeySet", null);
        setField(term2744, term2744.getClass(), "descendingMap", null);
        setField(term2744, term2744.getClass(), "keySet", null);
        setField(term2744, term2744.getClass(), "values", null);
        setField(term2743, term2743.getClass(), "m", term2744);
        setField(term2696, term2696.getClass(), "genres", term2743);
        term2756 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2756, term2756.getClass(), "year", 2012);
        setShortField(term2756, term2756.getClass(), "month", (short) 2);
        setShortField(term2756, term2756.getClass(), "day", (short) 19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term2756;
        callMethod(klass, "releaseDate", argTypes, term2696, args);
    }

};


