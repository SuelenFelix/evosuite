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

public class Film_FilmBuilder_name_17631249532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2472;

    public Film_FilmBuilder_name_17631249532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2473 = new Long(-2170847986967241072L);
        Integer term2503 = new Integer(1162663216);
        term2472 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2499 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2505 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term2519 = newInstance(Class.forName("java.util.TreeSet"));
        Object term2520 = newInstance(Class.forName("java.util.TreeMap"));
        Object term2521 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2522 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term2524 = newInstance(Class.forName("java.lang.Object"));
        Object term2525 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2527 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term2472, term2472.getClass(), "id", term2473);
        setField(term2472, term2472.getClass(), "name", "sEccwbJKYE");
        setField(term2472, term2472.getClass(), "description", "AWRooQKkdW");
        setIntField(term2499, term2499.getClass(), "year", 2017);
        setShortField(term2499, term2499.getClass(), "month", (short) 8);
        setShortField(term2499, term2499.getClass(), "day", (short) 7);
        setField(term2472, term2472.getClass(), "releaseDate", term2499);
        setField(term2472, term2472.getClass(), "duration", term2503);
        setIntField(term2505, term2505.getClass(), "id", 865208305);
        setField(term2505, term2505.getClass(), "name", "vjxIhXHxGR");
        setField(term2472, term2472.getClass(), "mpa", term2505);
        setField(term2520, term2520.getClass(), "comparator", null);
        setIntField(term2522, term2522.getClass(), "id", -244121226);
        setField(term2522, term2522.getClass(), "name", null);
        setField(term2521, term2521.getClass(), "key", term2522);
        setField(term2521, term2521.getClass(), "value", term2524);
        setField(term2525, term2525.getClass(), "key", null);
        setField(term2525, term2525.getClass(), "value", term2524);
        setField(term2525, term2525.getClass(), "left", null);
        setField(term2525, term2525.getClass(), "right", null);
        setField(term2525, term2525.getClass(), "parent", term2521);
        setBooleanField(term2525, term2525.getClass(), "color", true);
        setField(term2521, term2521.getClass(), "left", term2525);
        setField(term2527, term2527.getClass(), "key", null);
        setField(term2527, term2527.getClass(), "value", term2524);
        setField(term2527, term2527.getClass(), "left", null);
        setField(term2527, term2527.getClass(), "right", null);
        setField(term2527, term2527.getClass(), "parent", term2521);
        setBooleanField(term2527, term2527.getClass(), "color", true);
        setField(term2521, term2521.getClass(), "right", term2527);
        setField(term2521, term2521.getClass(), "parent", null);
        setBooleanField(term2521, term2521.getClass(), "color", true);
        setField(term2520, term2520.getClass(), "root", term2521);
        setIntField(term2520, term2520.getClass(), "size", 4);
        setIntField(term2520, term2520.getClass(), "modCount", 4);
        setField(term2520, term2520.getClass(), "entrySet", null);
        setField(term2520, term2520.getClass(), "navigableKeySet", null);
        setField(term2520, term2520.getClass(), "descendingMap", null);
        setField(term2520, term2520.getClass(), "keySet", null);
        setField(term2520, term2520.getClass(), "values", null);
        setField(term2519, term2519.getClass(), "m", term2520);
        setField(term2472, term2472.getClass(), "genres", term2519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZVecLZMLHF";
        callMethod(klass, "name", argTypes, term2472, args);
    }

};


